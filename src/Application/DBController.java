/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author labso20
 */
public class DBController {
    private final String url = "jdbc:postgresql://localhost:5432/CETI";
    private final String user = "postgres";
    private final String password = "Joan";

    public Connection connect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
    
    public ArrayList<User> getQueryResult(String SQL) {
        ArrayList<User> arr = new ArrayList<>();
        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(SQL);
            ResultSet resultSet = pstmt.executeQuery()) {
            while(resultSet.next()){
                User user = new User(resultSet.getString("userName"),resultSet.getString("userPassword"));
                arr.add(user);
            }
            return arr;
        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
}
