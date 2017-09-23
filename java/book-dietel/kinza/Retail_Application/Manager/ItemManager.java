package Manager;

import Entities.Item;

import java.sql.*;
import java.util.*;

import org.apache.log4j.Logger;

public class ItemManager {
    private final Logger logger = Logger.getLogger(this.getClass());
    private ConnectionManager conn = null;

    private int getItemIdFormDb() throws Exception {
        conn = ConnectionManager.getDbCon();
        String query = "SELECT MAX(item_ID) FROM retail_app_schema.item";
        ResultSet rs = conn.query(query);
        rs.next();
        int id = rs.getInt(1);
        return id;
    }

    public int addItem(Item item) throws Exception{
        logger.info("Adding item in the Database");
        int itemId = getItemIdFormDb();
        itemId++;
        conn = ConnectionManager.getDbCon();
        String query = "INSERT INTO retail_app_schema.item VALUES (?, ?, ?, ?)";
        PreparedStatement ps = conn.insertUsingPreparedStatement(query);
        ps.setInt(1,itemId);
        ps.setString(2, item.getItemName());
        ps.setInt(3, item.getPrice());
        ps.setString(4, item.getCurrency());
        int result = conn.executePrepStatement( ps );
        return result;
    }

    public int updateItem(int choice, Object object, String name) throws Exception {
        conn = ConnectionManager.getDbCon();
        String query = "";
        int result = 0;
        switch ( choice ) {
            case 1:
                logger.info("Updating Item Name ");
                query = "UPDATE retail_app_schema.item SET itemName = ? WHERE itemName = ? ";
                PreparedStatement ps1 = conn.insertUsingPreparedStatement(query);
                ps1.setObject(1, object);
                ps1.setString(2, name);
                result = conn.executePrepStatement(ps1);
                break;
            case 2:
                logger.info("Updating Item Price ");
                query = "UPDATE retail_app_schema.item SET price = ? WHERE itemName = ? ";
                PreparedStatement ps2 = conn.insertUsingPreparedStatement(query);
                ps2.setObject(1, object);
                ps2.setString(2, name);
                result = conn.executePrepStatement(ps2);
                break;
            case 3:
                logger.info("Updating Item Currency ");
                query = "UPDATE retail_app_schema.item SET currency = ? WHERE itemName = ? ";
                PreparedStatement ps3 = conn.insertUsingPreparedStatement(query);
                ps3.setObject(1, object);
                ps3.setString(2, name);
                result = conn.executePrepStatement(ps3);
                break;
        }
        return result;
    }

    public int deleteItem(String itemName) throws Exception{
        logger.info("deleting Item from Database");
        String query = "DELETE FROM retail_app_schema.item WHERE itemName = ? ";
        conn = ConnectionManager.getDbCon();
        PreparedStatement ps = conn.insertUsingPreparedStatement(query);
        ps.setString(1, itemName);
        int result = conn.executePrepStatement(ps);
        return result;
    }

    public List getAllItems() throws Exception {
        logger.info("Getting list of all items from Database");
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
