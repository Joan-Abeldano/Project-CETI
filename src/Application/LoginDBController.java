/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author labso20
 */
public class LoginDBController extends DBController{
    public void insertUserAdmin(User user) {
        String SQL = "CREATE USER "+user.getUserName()+" WITH PASSWORD \'"+user.getUserPassword()+"\' LOGIN CREATEROLE;";
        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.execute();
            grantAdminPrivileges(user,conn);
            grantNoAdminPrivileges(user,conn);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void insertUserNoAdmin(User user) {
        String SQL = "CREATE USER "+user.getUserName()+" WITH PASSWORD \'"+user.getUserPassword()+"\' LOGIN;";
        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.execute();
            grantNoAdminPrivileges(user,conn);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    private void grantAdminPrivileges(User user, Connection conn) {
        String insertOnItems = "GRANT INSERT ON items TO "+user.getUserName();
        String deleteOnItems = "GRANT DELETE ON items TO "+user.getUserName();
        try {
            PreparedStatement pstmt;
            pstmt = conn.prepareStatement(insertOnItems);
            pstmt.execute();
            pstmt = conn.prepareStatement(deleteOnItems);
            pstmt.execute();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    private void grantNoAdminPrivileges(User user,Connection conn) {
        String selectOnItems = "GRANT SELECT ON items TO "+user.getUserName();
        String insertOnBorrowings = "GRANT INSERT ON borrowings TO "+user.getUserName();
        String deleteOnBorrowings = "GRANT DELETE ON borrowings TO "+user.getUserName();
        String selectOnBorrowings = "GRANT SELECT ON borrowings TO "+user.getUserName();
        String insertOnPeople = "GRANT INSERT ON people TO "+user.getUserName();
        String deleteOnPeople = "GRANT DELETE ON people TO "+user.getUserName();
        String selectOnPeople = "GRANT SELECT ON people TO "+user.getUserName();
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
            pstmt = conn.prepareStatement(insertOnPeople);
            pstmt.execute();
            pstmt = conn.prepareStatement(deleteOnPeople);
            pstmt.execute();
            pstmt = conn.prepareStatement(selectOnPeople);
            pstmt.execute();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void deleteUser(User user) {
        String SQL = "DROP USER "+user.getUserName()+";";
        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(SQL)){
            pstmt.executeUpdate();
        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void updateUser(User user) {
        String SQL = "UPDATE users SET userName=\'"+user.getUserName()+"\', userPassword=\'"+user.getUserPassword()+"\' WHERE userId="+user.getUserId()+";";
        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(SQL)){
            pstmt.executeUpdate();
        }catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
