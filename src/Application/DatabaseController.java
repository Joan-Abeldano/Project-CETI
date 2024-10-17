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
    
    public void insertBorrowing(Borrowing borrowing) {
        String SQL = "INSERT INTO borrowings(id, ) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setInt(1,borrowing.getId());
            pstmt.setString(2, borrowing.getItemBorrowed().getItemDesc());
            pstmt.setString(3, borrowing.getItemBorrowed().getItemType());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}