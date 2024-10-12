/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;

/**
 *
 * @author labso20
 */
public class Borrowing {
    private int id;
    private Item itemBorrowed;
    private String observation;
    private Person person;
    private User userBorrower;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Item getItemBorrowed() {
        return itemBorrowed;
    }

    public void setItemBorrowed(Item itemBorrowed) {
        this.itemBorrowed = itemBorrowed;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public User getUserBorrower() {
        return userBorrower;
    }

    public void setUserBorrower(User userBorrower) {
        this.userBorrower = userBorrower;
    }
    
    
}
