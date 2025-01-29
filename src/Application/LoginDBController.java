/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author labso20
 */
public class LoginDBController extends DBController{
    public boolean insertUserAdmin(User user) {
        String SQL = "CREATE ROLE "+user.getUserName()+" WITH PASSWORD \'"+user.getUserPassword()+"\' LOGIN CREATEROLE SUPERUSER;";
        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.execute();
            assignGroup(user,conn);
            FileController fc = new FileController(new File("users.txt"));
            try {
                fc.updateFile();
                return true;
            } catch (IOException ex) {
                System.out.println(ex);
                return false;
            }
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public boolean insertUserNoAdmin(User user) {
        String SQL = "CREATE ROLE "+user.getUserName()+" WITH PASSWORD \'"+user.getUserPassword()+"\' LOGIN;";
        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.execute();
            grantNoAdminPrivileges(user,conn);
            assignGroup(user,conn);
            FileController fc = new FileController(new File("users.txt"));
            try {
                fc.updateFile();
                return true;
            } catch (IOException ex) {
                System.out.println(ex);
                return false;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    private void assignGroup(User user,Connection conn) {
        String addToGroup = "ALTER GROUP ceti ADD USER "+user.getUserName()+";";
        try {
            PreparedStatement pstmt;
            pstmt = conn.prepareStatement(addToGroup);
            pstmt.execute();
        }
        catch(SQLException ex) {
            System.out.println(ex);
        }
    }
    
    private void grantNoAdminPrivileges(User user,Connection conn) {
        String selectOnItems = "GRANT SELECT ON item_inventory TO "+user.getUserName();
        String insertOnBorrowings = "GRANT INSERT ON borrowings TO "+user.getUserName();
        String deleteOnBorrowings = "GRANT DELETE ON borrowings TO "+user.getUserName();
        String selectOnBorrowings = "GRANT SELECT ON borrowings TO "+user.getUserName();
        try {
            PreparedStatement pstmt;
            pstmt = conn.prepareStatement(selectOnItems);
            pstmt.execute();
            pstmt = conn.prepareStatement(insertOnBorrowings);
            pstmt.execute();
            pstmt = conn.prepareStatement(deleteOnBorrowings);
            pstmt.execute();
            pstmt = conn.prepareStatement(selectOnBorrowings);
            pstmt.execute();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void deleteUser(User user) {
        String quitPriv = "DROP OWNED BY "+user.getUserName()+";";
        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(quitPriv)){
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(LoginDBController.class.getName()).log(Level.SEVERE, null, ex);
        }
        String SQL = "DROP ROLE "+user.getUserName()+";";
        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(SQL)){
            pstmt.executeUpdate();
            FileController fc = new FileController(new File("users.txt"));
            try {
                fc.updateFile();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void updateUser(User oldUser,User newUser) {
        String SQL = "ALTER USER "+oldUser.getUserName()+"";
        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(SQL)){
            pstmt.executeUpdate();
            FileController fc = new FileController(new File("users.txt"));
            try {
                fc.updateFile();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
