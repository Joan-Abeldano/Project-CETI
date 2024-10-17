/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;

/**
 *
 * @author Joan
 */
public class Item {
    private String itemCode;
    private String itemDesc;
    private String itemType;
    
    private int itemNumber;
    private String itemInventory;
    private String itemPossesion;
    private String itemGroup;

    public Item(String itemCode, String itemDesc, String itemType) {
        this.itemCode = itemCode;
        this.itemDesc = itemDesc;
        this.itemType = itemType;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }
    
    
}
