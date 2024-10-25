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
    private int itemNumber;
    private int itemInventory;
    private String itemPossesion;
    private String itemGroup;
    private String itemCategory;
    private String itemSubCategory;
    private String itemType;
    private String itemBrand;
    private String itemModel;
    private String itemSerie;
    private String itemColor;
    private float itemPrice;
    private String itemState;
    private String itemOwner;

    public Item(int itemNumber, int itemInventory, String itemPossesion, String itemGroup, String itemCategory, String itemSubCategory, String itemType, String itemBrand, String itemModel, String itemSerie, String itemColor, float itemPrice, String itemState, String itemOwner) {
        this.itemNumber = itemNumber;
        this.itemInventory = itemInventory;
        this.itemPossesion = itemPossesion;
        this.itemGroup = itemGroup;
        this.itemCategory = itemCategory;
        this.itemSubCategory = itemSubCategory;
        this.itemType = itemType;
        this.itemBrand = itemBrand;
        this.itemModel = itemModel;
        this.itemSerie = itemSerie;
        this.itemColor = itemColor;
        this.itemPrice = itemPrice;
        this.itemState = itemState;
        this.itemOwner = itemOwner;
    }
    
    public Item(int itemInventory,String itemCategory) {
        this.itemInventory = itemInventory;
        this.itemCategory = itemCategory;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public int getItemInventory() {
        return itemInventory;
    }

    public void setItemInventory(int itemInventory) {
        this.itemInventory = itemInventory;
    }

    public String getItemPossesion() {
        return itemPossesion;
    }

    public void setItemPossesion(String itemPossesion) {
        this.itemPossesion = itemPossesion;
    }

    public String getItemGroup() {
        return itemGroup;
    }

    public void setItemGroup(String itemGroup) {
        this.itemGroup = itemGroup;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public String getItemSubCategory() {
        return itemSubCategory;
    }

    public void setItemSubCategory(String itemSubCategory) {
        this.itemSubCategory = itemSubCategory;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemBrand() {
        return itemBrand;
    }

    public void setItemBrand(String itemBrand) {
        this.itemBrand = itemBrand;
    }

    public String getItemModel() {
        return itemModel;
    }

    public void setItemModel(String itemModel) {
        this.itemModel = itemModel;
    }

    public String getItemSerie() {
        return itemSerie;
    }

    public void setItemSerie(String itemSerie) {
        this.itemSerie = itemSerie;
    }

    public String getItemColor() {
        return itemColor;
    }

    public void setItemColor(String itemColor) {
        this.itemColor = itemColor;
    }

    public float getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(float itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemState() {
        return itemState;
    }

    public void setItemState(String itemState) {
        this.itemState = itemState;
    }

    public String getItemOwner() {
        return itemOwner;
    }

    public void setItemOwner(String itemOwner) {
        this.itemOwner = itemOwner;
    }
    
    
}
