package Manager;

import java.sql.ResultSet;
import java.util.*;

public class ItemManager {
    IOManager ioManager = new IOManager();
    ConnectionManager con = null;

    public void addItem() {

    }

    public void updateItem() {

    }

    public void getItem() {

    }

    public void deleteItem() {

    }

    public void getAllItems() throws Exception {
        ioManager.itemHeading();
        List<String> list = new LinkedList<String>();
        List<Integer> intList = new LinkedList<Integer>();
        con = ConnectionManager.getDbCon();
        String query = "SELECT * FROM retail_schema.item";
        ResultSet rs = con.query(query);
        while (rs.next()) {
            intList.add(rs.getInt("ItemId"));
            list.add(rs.getString("ItemName"));
        }
        ioManager.listOfItem(list, intList);

    }
}