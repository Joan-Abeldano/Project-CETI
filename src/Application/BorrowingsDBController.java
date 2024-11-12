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
public class BorrowingsDBController extends DBController{ //This needs a father class
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
    public ResultSet getBorrowings() {
        String SQL = "SELECT * FROM borrowings"; //I should maybe get the stuff i need but idc 
        //Time complexity goes brrrrr
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
