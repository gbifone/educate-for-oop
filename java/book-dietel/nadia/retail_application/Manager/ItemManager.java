package Manager;

import Entities.Item;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import org.apache.log4j.Logger;

public class ItemManager {
    private final Logger log = Logger.getLogger(this.getClass());
    private ConnectionManager con = null;

    public int getItemId() throws Exception {
        con = ConnectionManager.getDbCon();
        String query = "Select MAX(ItemId) FROM retail_schema.item";
        ResultSet rs = con.query(query);
        rs.next();
        int id = rs.getInt(1);
        return id;
    }

    public int addItem(Item item) throws Exception {
        log.info("Adding item in the Database");
        int itemId = getItemId();
        itemId++;
        con = ConnectionManager.getDbCon();
        String query = "INSERT INTO retail_schema.item VALUES (? , ? , ? , ?)";
        PreparedStatement ps = con.insertUsingPrepStatement(query);
        ps.setInt(1, itemId);
        ps.setString(2, item.getItemName());
        ps.setInt(3, item.getPrice());
        ps.setString(4, item.getCurrency());
        int result = con.queryExecutionUsingPrepStat(ps);
        return result;
    }

    public int updateItem(int option,Object obj,String name) throws Exception{
        con = ConnectionManager.getDbCon();
        String query;
        int res = 0;
        switch (option) {
            case 1:
                query = "UPDATE retail_schema.item SET ItemName = ?  WHERE ItemName = ? ";
                PreparedStatement ps1 = con.insertUsingPrepStatement(query);
                ps1.setObject(1, obj);
                ps1.setObject(2, name);
                res = con.queryExecutionUsingPrepStat(ps1);
                break;
            case 2:
                query = "UPDATE retail_schema.item SET Price = ?  WHERE ItemName = ? ";
                PreparedStatement ps2 = con.insertUsingPrepStatement(query);
                ps2.setObject(1, obj);
                ps2.setObject(2, name);
                res = con.queryExecutionUsingPrepStat(ps2);
                break;
            case 3:
                query = "UPDATE retail_schema.item SET Currency = ?  WHERE ItemName = ? ";
                PreparedStatement ps3 = con.insertUsingPrepStatement(query);
                ps3.setObject(1, obj);
                ps3.setObject(2, name);
                res = con.queryExecutionUsingPrepStat(ps3);
                break;
        }
        return res;
    }

    public int deleteItem(String itemName) throws Exception{
        log.info("Delete Item from Database");
        int result;
            String query = "DELETE  FROM  retail_schema.item WHERE ItemName= ? ";
            con = ConnectionManager.getDbCon();
            PreparedStatement ps = con.insertUsingPrepStatement(query);
            ps.setString(1, itemName);
            result = con.queryExecutionUsingPrepStat(ps);
            return result;
    }

    public List<Item> getAllItems() throws Exception {
        log.info("Getting all items / product from Database");
        List<Item> list = new LinkedList<Item>();
        con = ConnectionManager.getDbCon();
        String query = "SELECT * FROM retail_schema.item";
        ResultSet rs = con.query(query);
        while (rs.next()) {
            Item item = new Item();
            item.setItemId(rs.getInt("ItemId"));
            item.setItemName(rs.getString("ItemName"));
            item.setPrice(rs.getInt("Price"));
            item.setCurrency(rs.getString("Currency"));
            list.add(item);
        }
        return list;
    }

}
