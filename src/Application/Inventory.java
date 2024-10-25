/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;

import java.util.List;

/**
 *
 * @author labso20
 */
public class Inventory {//Wtf it this class
    private List<Item> items;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
    
    public void addItem(Item item) {
        items.add(item);
    }
    
    public void deleteItem(Item item) {
        items.remove(item);
    }
}
