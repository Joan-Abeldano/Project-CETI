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
public class CurrentBorrowing {
    //Person name & last name
    //Item inventory
    //Item category
    //Start date
    
    private String personName;
    private String personLastName;
    private int itemInventory;
    private String itemCategory;
    private Date startDate;

    public CurrentBorrowing(String personName, String personLastName, int itemInventory, String itemCategory, Date startDate) {
        this.personName = personName;
        this.personLastName = personLastName;
        this.itemInventory = itemInventory;
        this.itemCategory = itemCategory;
        this.startDate = startDate;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonLastName() {
        return personLastName;
    }

    public void setPersonLastName(String personLastName) {
        this.personLastName = personLastName;
    }

    public int getItemInventory() {
        return itemInventory;
    }

    public void setItemInventory(int itemInventory) {
        this.itemInventory = itemInventory;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    
    
}
