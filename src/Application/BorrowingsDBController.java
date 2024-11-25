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
public class BorrowingsDBController extends DBController{
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
    
    public void deleteBorrowing(Borrowing borrowing) {
        String SQL = "DELETE FROM borrowings WHERE borrowingId="+borrowing.getBorrowingId()+";";
        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(SQL)){
            pstmt.executeUpdate();
        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void updateBorrowing(Borrowing borrowing) {
        String SQL = "UPDATE borrowings SET startDate="+borrowing.getStartDate()+", endDate="+borrowing.getEndDate()+", userId="+borrowing.getUserBorrower().getUserId()+", itemInventory="+borrowing.getItemBorrowed().getItemInventory()+", personId="+borrowing.getPerson().getPersonId()+" WHERE borrowingId="+borrowing.getBorrowingId()+";";
        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(SQL)){
            pstmt.executeUpdate();
        }catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void endBorrowing(Borrowing borrowing) {
        String SQL = "UPDATE borrowings SET endDate="+borrowing.getEndDate()+", ended=true WHERE borrowingId="+borrowing.getBorrowingId()+";";
        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(SQL)){
            pstmt.executeUpdate();
        }catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
