package Manager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OrderManager {
    ConnectionManager con =null;

    public List<String> purchaseItem(List<Integer> listOfIds) throws Exception {
        List<String> listOfOrderedItem = new ArrayList<>();
        Iterator<Integer> integerIterator = listOfIds.iterator();
        while (integerIterator.hasNext()) {
            String query = "SELECT ItemName FROM retail_schema.item WHERE ItemId = ?";
            con = ConnectionManager.getDbCon();
            PreparedStatement ps = con.insertUsingPrepStatement(query);
            ps.setInt(1, integerIterator.next());
            ResultSet rs = con.queryExecution(ps);
            if(rs.next()) {
                listOfOrderedItem.add(rs.getString("ItemName"));
            }
        }
        return listOfOrderedItem;
    }
}
