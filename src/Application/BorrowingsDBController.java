/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;

import java.util.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author labso20
 */
public class BorrowingsDBController extends DBController{
    public boolean insertBorrowing(Borrowing borrowing) {
        String SQL = "INSERT INTO borrowings(startDate,relativeenddate,itemInventory,personname,personlastname,persongroup) VALUES (?,?,?,?,?,?);";
        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            java.sql.Date sqlStartDate = new java.sql.Date(borrowing.getStartDate().getTime());
            java.sql.Date sqlEndDate = new java.sql.Date(borrowing.getRelativeDateEnd().getTime());
            pstmt.setDate(1, sqlStartDate);
            pstmt.setDate(2, sqlEndDate);
            pstmt.setString(3, borrowing.getItemBorrowed());
            pstmt.setString(4, borrowing.getName());
            pstmt.setString(5, borrowing.getLastname());
            pstmt.setString(6, borrowing.getGroup());
            pstmt.execute();
            return true;
        } catch (SQLException ex) {
            String message = ex.getMessage();
            String notFoundId = extractMissingKey(message);
            JOptionPane.showMessageDialog(
        null,
        "El item con ID " + notFoundId + " no existe en el inventario.",
        "Error de Clave Foránea",
        JOptionPane.ERROR_MESSAGE);
            return false;
            
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
        String SQL = "UPDATE borrowings SET startDate=\'"+borrowing.getStartDate()+"\', relativeenddate=\'"+borrowing.getRelativeDateEndString()+"\', endDate=\'"+borrowing.getEndDate()+",\' itemInventory="+borrowing.getItemBorrowed()+", personname=\'"+borrowing.getName()+"\', personlastname=\'"+borrowing.getLastname()+"\', persongroup=\'"+borrowing.getGroup()+"\' WHERE borrowingId="+borrowing.getBorrowingId()+";";
        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(SQL)){
            pstmt.executeUpdate();
        }catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void endBorrowing(Date endDate, int id) {
        String SQL = "UPDATE borrowings SET endDate=\'"+endDate+"\', ended=true WHERE borrowingId="+id+";";
        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(SQL)){
            pstmt.executeUpdate();
        }catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    private void restartSerialId() {
        String SQL = "SELECT max(borrowingId) FROM borrowings;";
        
    }
    
    // Método para extraer la clave foránea faltante
private String extractMissingKey(String message) {
    String notFoundId = "desconocido"; // Valor por defecto en caso de no encontrar nada
    Pattern pattern = Pattern.compile("\\((\\d+)\\)"); // Busca un número entre paréntesis
    Matcher matcher = pattern.matcher(message);

    if (matcher.find()) {
        notFoundId = matcher.group(1); // Captura el número encontrado
    }

    return notFoundId;
}
}
