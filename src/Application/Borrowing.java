/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author labso20
 */
public class Borrowing {
    private int borrowingId;
    private Item itemBorrowed;
    private Person person;
    private User userBorrower;
    private Date startDate;
    private Date endDate;
    private boolean ended;

    public Borrowing(int borrowingId, Item itemBorrowed, Person person, User userBorrower, Date startDate, Date endDate, boolean ended) {
        //This is probably temp...maybe
        this.borrowingId = borrowingId;
        this.itemBorrowed = itemBorrowed;
        this.person = person;
        this.userBorrower = userBorrower;
        this.startDate = startDate;
        this.endDate = endDate;
        this.ended = ended;
    }

    public int getBorrowingId() {
        return borrowingId;
    }

    public void setBorrowingId(int borrowingId) {
        this.borrowingId = borrowingId;
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

    public String getStartDateString() {
        String pattern = "MM/dd/yyyy HH:mm:ss";
        DateFormat df = new SimpleDateFormat(pattern);      
        String startDateString = df.format(this.startDate);
        return startDateString;
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

    public boolean isEnded() {
        return ended;
    }

    public void setEnded(boolean ended) {
        this.ended = ended;
    }
    
}
