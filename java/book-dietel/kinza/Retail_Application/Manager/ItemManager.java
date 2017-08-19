package Manager;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.*;

public class ItemManager {
    IoManager ioManager = new IoManager();
    ConnectionManager conn = null;

    public void addItem(){

    }

    public void updateItem(){

    }

    public void searchItem(){

    }

    public void deleteItem(){

    }

    public void getAllItems() throws Exception {
        List<Map<Integer, String >> list = new LinkedList<>();
        conn = ConnectionManager.getDbCon();
        String query = "SELECT * FROM retail_app_schema.item ";
        ResultSet resultSet = conn.query( query );
        while (resultSet.next()){
            Map<Integer, String  > map = new LinkedHashMap<>();
            ResultSetMetaData metaData = resultSet.getMetaData();
            for (int i = 1; i < metaData.getColumnCount(); i++)
                map.put(resultSet.getInt(i), resultSet.getString("itemName"));
            list.add(map);
        }
        ioManager.printAllItems( list );
    }

}
