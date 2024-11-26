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
public class PersonDBController extends DBController{
    public void insertPerson(Person person) {
        String SQL = "INSERT INTO people(personName, personLastName, personGroup) VALUES (?, ?, ?);";
        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, person.getPersonName());
            pstmt.setString(2, person.getPersonLastName());
            pstmt.setString(3, person.getPersonGroup());
            pstmt.execute();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void deletePerson(Person person) {
        String SQL = "DELETE FROM people WHERE personId="+person.getPersonId()+";";
        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(SQL)){
            pstmt.executeUpdate();
        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void updatePerson(Person person) {
        String SQL = "UPDATE people SET personName=\'"+person.getPersonName()+"\', personLastName=\'"+person.getPersonLastName()+"\', personGroup=\'"+person.getPersonGroup()+"\' WHERE personId="+person.getPersonId()+";";
        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(SQL)){
            pstmt.executeUpdate();
        }catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
