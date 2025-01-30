/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author labso20
 */
public class DBController {
    private final String url = "jdbc:postgresql://localhost:5432/Prestamos_CETI";
    private String user = "";
    private String password = "";

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }
    
    public Connection connect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
    
    public int importCSVWithPsql(String filePath,String user,String pass) {
        String SQL = "psql -h 132.18.53.20 -d PrestamosCETI -U "+user+" -c\"\\copy item_inventory from \'"+filePath+"\' WITH DELIMITER \',\' CSV HEADER\"";
        
        try {
            ProcessBuilder pb = new ProcessBuilder("bash", "-c", SQL);
            pb.environment().put("PGPASSWORD", pass);
            pb.inheritIO(); // Output to console
            Process process = pb.start();
            return 1;
        } catch (IOException e) {
            return 0;
        }
    }
    
    public ArrayList<Map<String, Object>> getQueryResult(String SQL) {
        ArrayList<Map<String, Object>> result = new ArrayList<>();
        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(SQL);
            ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
            Map<String, Object> resMap = new HashMap<>();
            for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                resMap.put(rs.getMetaData().getColumnName(i), rs.getObject(i));
            }
            result.add(resMap);
        }
            return result;
        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }
}
