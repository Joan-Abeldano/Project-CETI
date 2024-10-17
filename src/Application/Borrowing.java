/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;

import java.util.Date;

/**
 *
 * @author labso20
 */
public class Borrowing {
    private int id;
    private Item itemBorrowed;
    private Person person;
    private User userBorrower;
    private Date startDate;
    private Date endDate;

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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    
}
