package Manager;

import Entities.Item;

import java.sql.*;
import java.util.*;

public class ItemManager {
    ConnectionManager conn = null;


    public void addItem() {

    }

    public void updateItem() {

    }

    public void searchItem() {

    }

    public void deleteItem() {

    }

    public List getAllItems() throws Exception {
        List<Item> listOfItems = new LinkedList<>();
        conn = ConnectionManager.getDbCon();
        String query = "SELECT * FROM retail_app_schema.item ";
        ResultSet resultSet = conn.query(query);
        while (resultSet.next()) {
            Item item = new Item();
                item.setItemId(resultSet.getInt("item_ID"));
                item.setItemName(resultSet.getString("itemName"));
                item.setPrice(resultSet.getInt("price"));
                item.setCurrency(resultSet.getString("currency"));
                listOfItems.add(item);
            }
        return listOfItems;
    }

}
