package Manager;

import Entities.Item;
import java.sql.*;
import java.util.*;

public class ItemManager {
    ConnectionManager conn = null;


    public void addItem(){

    }

    public void updateItem(){

    }

    public void searchItem(){

    }

    public void deleteItem(){

    }

    public List getAllItems() throws Exception {
        List<Item> list = new LinkedList<>();
        conn = ConnectionManager.getDbCon();
        String query = "SELECT * FROM retail_app_schema.item ";
        ResultSet resultSet = conn.query( query );
        while (resultSet.next()){
            Item item = new Item();
            ResultSetMetaData metaData = resultSet.getMetaData();
            for (int i = 1; i < metaData.getColumnCount(); i++){
                item.setItemId(resultSet.getInt(i));
                item.setItemName(resultSet.getString("itemName"));
            list.add(item);
            }

        }
        return list;
    }

}
