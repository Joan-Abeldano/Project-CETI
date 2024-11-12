/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
/**
 *
 * @author labso20
 */
public class LoginDBController extends DBController{ //This needs a father class
    public void insertUser(User user) {
        String SQL = "INSERT INTO users(userName, userPassword) VALUES (?, ?)";
        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, user.getUserName());
            pstmt.setString(2, user.getUserPassword());
            pstmt.execute();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    //This implementation is not good at all
    //Ill leave it here forever
    public ResultSet getUsers() { //This method name is a bit cool
        String SQL = "SELECT * FROM users"; //Im to lazy
        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(SQL);
            ResultSet resultSet = pstmt.executeQuery()) {
            return resultSet;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
