/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
/**
 *
 * @author labso20
 */
public class LoginDBController { //This needs a father class
    private final String url = "jdbc:postgresql://localhost:5432/CETI";
    private final String user = "postgres";
    private final String password = "Joan";
    //This goes straight into git fy

    public Connection connect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
    
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
    public User[] getUsers() { //This method name is a bit cool
        List<User> userList = new ArrayList<>();
        String SQL = "SELECT * FROM users"; //Im to lazy
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL);
             ResultSet resultSet = pstmt.executeQuery()) {
            while (resultSet.next()) {
                String name = resultSet.getString("userName");
                String pass = resultSet.getString("userPassword");

                User userObj = new User(name, pass);
                userList.add(userObj);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return userList.toArray(new User[0]);
        //Why not a list, idk
    }
}
