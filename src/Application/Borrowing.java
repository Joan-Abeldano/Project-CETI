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
    private Date startDate;
    private Date relativeDateEnd;
    private Date endDate;
    private boolean ended;
    private String name;
    private String lastname;
    private String group;

    public Borrowing(int borrowingId, int itemBorrowed, Date startDate, Date relativeDateEnd, Date endDate, boolean ended, String name, String lastname, String group) {
        this.borrowingId = borrowingId;
        this.itemBorrowed = itemBorrowed;
        this.startDate = startDate;
        this.relativeDateEnd = relativeDateEnd;
        this.endDate = endDate;
        this.ended = ended;
        this.name = name;
        this.lastname = lastname;
        this.group = group;
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

    public Date getRelativeDateEnd() {
        return relativeDateEnd;
    }

    public void setRelativeDateEnd(Date relativeDateEnd) {
        this.relativeDateEnd = relativeDateEnd;
    }
    
    public String getRelativeDateEndString(){
        String pattern = "MM/dd/yyyy HH:mm:ss";
        DateFormat df = new SimpleDateFormat(pattern);
        String relativeDateEndString = df.format(this.relativeDateEnd);
        return relativeDateEndString;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
    
    
    
}
