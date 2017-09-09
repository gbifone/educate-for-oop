package Manager;

import Entities.Item;
import java.sql.ResultSet;
import java.util.*;

public class ItemManager {
    ConnectionManager con = null;

    public void addItem() {

    }

    public void updateItem() {

    }

    public void getItem() {

    }

    public void deleteItem() {

    }

    public List<Item> getAllItems() throws Exception {
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
