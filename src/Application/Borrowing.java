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
    private int itemBorrowed;
    private int person;
    private int userBorrower;
    private Date startDate;
    private Date endDate;
    private boolean ended;

    public Borrowing(int borrowingId, int itemBorrowed, int person, int userBorrower, Date startDate, Date endDate, boolean ended) {
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

    public int getItemBorrowed() {
        return itemBorrowed;
    }

    public void setItemBorrowed(int itemBorrowed) {
        this.itemBorrowed = itemBorrowed;
    }

    public int getPerson() {
        return person;
    }

    public void setPerson(int person) {
        this.person = person;
    }

    public int getUserBorrower() {
        return userBorrower;
    }

    public void setUserBorrower(int userBorrower) {
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
    
    public String getEndDateString() {
        String pattern = "MM/dd/yyyy HH:mm:ss";
        DateFormat df = new SimpleDateFormat(pattern);      
        String endDateString = df.format(this.endDate);
        return endDateString;
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
