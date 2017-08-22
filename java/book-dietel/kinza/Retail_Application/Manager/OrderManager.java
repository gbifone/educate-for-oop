package Manager;

import java.sql.*;
import java.util.*;

public class OrderManager {
    ConnectionManager conn = null;

    public List<String> getOrder(List<Integer> arrayOfIds) throws Exception {
        List<String> listOfItems = new ArrayList<>();
        Iterator<Integer> integerIterator = arrayOfIds.iterator();
        while (integerIterator.hasNext()) {
            String query = "SELECT itemName FROM retail_app_schema.item WHERE item_ID = ? ";
            conn = ConnectionManager.getDbCon();
            PreparedStatement ps = conn.insertUsingPreparedStatement(query);
            ps.setInt(1, integerIterator.next());
            ResultSet resultSet = conn.executeQueryUsingPrepStatement( ps );
            if (resultSet.next()) {
                listOfItems.add(resultSet.getString("itemName"));
            }
        }
        return listOfItems;
    }
}
