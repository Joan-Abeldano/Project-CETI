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
import javax.swing.JOptionPane;
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
    
    private void grantNoAdminPrivileges(User user, Connection conn) {
        String selectOnItems = "GRANT SELECT ON item_inventory TO " + user.getUserName();
        String insertOnBorrowings = "GRANT INSERT ON borrowings TO " + user.getUserName();
        String deleteOnBorrowings = "GRANT DELETE ON borrowings TO " + user.getUserName();
        String selectOnBorrowings = "GRANT SELECT ON borrowings TO " + user.getUserName();
        String usageOnSeq = "GRANT USAGE, SELECT, UPDATE ON SEQUENCE borrowings_borrowingid_seq TO " + user.getUserName();  // Fix for sequence

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
            pstmt = conn.prepareStatement(usageOnSeq);
            pstmt.execute();  // Fix applied here
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }



    public void deleteUser(String user) {
        String quitPriv = "DROP OWNED BY ?;";
        String dropRole = "DROP ROLE ?;";

        try (Connection conn = connect();
             PreparedStatement pstmt1 = conn.prepareStatement(quitPriv);
             PreparedStatement pstmt2 = conn.prepareStatement(dropRole)) {

            pstmt1.setString(1, user);
            pstmt1.executeUpdate();

            pstmt2.setString(1, user);
            pstmt2.executeUpdate();

            FileController fc = new FileController(new File("users.txt"));
            fc.updateFile();

            JOptionPane.showMessageDialog(null, "Usuario eliminado exitosamente");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al eliminar el usuario");
        } catch (IOException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Error al actualizar el archivo de usuarios");
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
