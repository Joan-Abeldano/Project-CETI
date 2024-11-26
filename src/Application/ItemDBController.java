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
public class ItemDBController extends DBController{
    public void insertItem(Item item) {
        String SQL = "INSERT INTO items(itemInventory,itemPossesion,itemGroup,itemCategory,itemSubCategory,itemType,itemBrand,itemModel,itemSerie,itemColor,itemPrice,itemState,itemOwner) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);";
        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setInt(1, item.getItemInventory());
            pstmt.setString(2, item.getItemPossesion());
            pstmt.setString(3, item.getItemGroup());
            pstmt.setString(4, item.getItemCategory());
            pstmt.setString(5, item.getItemSubCategory());
            pstmt.setString(6, item.getItemType());
            pstmt.setString(7, item.getItemBrand());
            pstmt.setString(8, item.getItemModel());
            pstmt.setString(9, item.getItemSerie());
            pstmt.setString(10, item.getItemColor());
            pstmt.setFloat(11, item.getItemPrice());
            pstmt.setString(12, item.getItemState());
            pstmt.setString(13, item.getItemOwner());
            pstmt.execute();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void deleteItem(Item item) {
        String SQL = "DELETE FROM items WHERE itemInventory="+item.getItemInventory()+";";
        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(SQL)){
            pstmt.executeUpdate();
        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void updateItem(Item item) {
        String SQL = "UPDATE items SET itemPossesion=\'"+item.getItemPossesion()+"\', itemGroup=\'"+item.getItemGroup()+"\', itemCategory=\'"+item.getItemCategory()+"\', itemSubCategory=\'"+item.getItemSubCategory()+"\', itemType=\'"+item.getItemType()+"\', itemBrand=\'"+item.getItemBrand()+"\', itemModel=\'"+item.getItemModel()+"\', itemSerie=\'"+item.getItemSerie()+"\', itemColor=\'"+item.getItemColor()+"\', itemPrice="+item.getItemPrice()+", itemState=\'"+item.getItemState()+"\', itemOwner=\'"+item.getItemOwner()+"\' WHERE itemInventory="+item.getItemInventory()+";";
        try (Connection conn = connect();
            PreparedStatement pstmt = conn.prepareStatement(SQL)){
            pstmt.executeUpdate();
        }catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
