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
public class BorrowingsDBController { //This needs a father class
    private final String url = "jdbc:postgresql://localhost:5432/CETI";
    private final String user = "postgres";
    private final String password = "Joan";

    public Connection connect() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
    
    //Why did i use the word "borrowing", i hate it
    public void insertBorrowing(Borrowing borrowing) {
        String SQL = "INSERT INTO borrowings(startDate,userId,itemInventory,personId) VALUES (?,?,?,?);";
        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1,borrowing.getStartDateString());
            pstmt.setInt(2, borrowing.getUserBorrower().getUserId());
            pstmt.setInt(3, borrowing.getItemBorrowed().getItemInventory());
            pstmt.setInt(4, borrowing.getPerson().getPersonId());
            pstmt.execute();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    //Again, this word sounds horrible
    public Borrowing[] getBorrowings() {
        List<Borrowing> borrowingList = new ArrayList<>();
        String SQL = "SELECT * FROM borrowings"; //I should maybe get the stuff i need but idc 
        //Time complexity goes brrrrr
        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(SQL);
            ResultSet resultSet = pstmt.executeQuery()) {
            while (resultSet.next()) {
                int borrowingId = resultSet.getInt("borrowingId");
                String startDate = resultSet.getString("startDate");
                String endDate = resultSet.getString("endDate");
                int userId = resultSet.getInt("userId");
                int itemInventory = resultSet.getInt("itemInventory");
                int personId = resultSet.getInt("personId");
                boolean ended = resultSet.getBoolean("ended");

                //Borrowing borrowingObj = new Borrowing();
                //borrowingList.add(borrowingObj);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return borrowingList.toArray(new Borrowing[0]);
    }
}
