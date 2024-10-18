/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author labso20
 */
public class DatabaseController {
    private final String url = "jdbc:postgresql://localhost:5432/CETI";
    private final String user = "postgres";
    private final String password = "Joan";

    public Connection connect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
    
    public void insertUser(User user) {
        String SQL = "INSERT INTO users(name, password, role) VALUES (?, ?, ?)";
        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, user.getName());
            pstmt.setString(2, user.getPassword());
            pstmt.setString(3, user.getRole());
            pstmt.execute();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
