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
    public void insertUser(User user) {
        String SQL = "CREATE USER "+user.getUserName()+" WITH REPLICATION PASSWORD \'"+user.getUserPassword()+"\';";
        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.execute();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void deleteUser(User user) {
        String SQL = "DELETE FROM users WHERE userId="+user.getUserId()+";";
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
