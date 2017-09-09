package Manager;

import Entities.*;

import java.sql.*;
import java.util.*;

public class OrderManager {
    ConnectionManager conn = null;

    public int getOrderId() throws Exception {
        conn = ConnectionManager.getDbCon();
        String query = "SELECT COUNT(*) AS rowcount FROM retail_app_schema.order";
        int id = conn.idCount(query);
        return id;
    }

    public int getOrderItemId() throws Exception {
        conn = ConnectionManager.getDbCon();
        String query = "SELECT COUNT(*) AS rowcount FROM retail_app_schema.order_item";
        int id = conn.idCount(query);
        return id;
    }

    public Order createOrder( int userId ) throws Exception {
        int orderId = getOrderId();
        orderId++;
        Timestamp currDateTime = new Timestamp(System.currentTimeMillis());
        conn = ConnectionManager.getDbCon();
        String insertUser = "INSERT INTO retail_app_schema.order VALUES ( ?, ?, ? )";
        PreparedStatement ps = conn.insertUsingPreparedStatement(insertUser);
        ps.setInt(1, orderId);
        ps.setTimestamp(2, currDateTime );
        ps.setInt(3, userId);
        int result = conn.executePrepStatement(ps);
        Order order = new Order();
        if ( result == 1 ){
            order.setOrderId(orderId);
            order.setDateTime(currDateTime);
            order.setUserId(userId);
        }
        return order;
    }

    public void createPurchase(List<List> listOfOrderedItems) throws Exception {
        int orderId = getOrderId();
        int orderItemId = getOrderItemId();
        conn = ConnectionManager.getDbCon();

        List<Integer> listOfItemIds = listOfOrderedItems.get(0);
        Iterator<Integer> iteratorOfItemIds = listOfItemIds.iterator();
        List<Integer> listOfQuantity = listOfOrderedItems.get(1);
        Iterator<Integer> iteratorOfQuantity = listOfQuantity.iterator();


        String insertUser = "INSERT INTO retail_app_schema.order_item VALUES ( ?, ?, ?, ? )";
        PreparedStatement ps = conn.insertUsingPreparedStatement(insertUser);

        while (iteratorOfItemIds.hasNext()) {
            orderItemId++;
            ps.setInt(1, orderItemId);
            ps.setInt(2, orderId);
            ps.setInt(3, iteratorOfItemIds.next());
            ps.setInt(4, iteratorOfQuantity.next());
            conn.executePreparedStatement(ps);
        }
    }

    public ResultSet printOrderDetail() throws Exception{
        int orderId = getOrderId();
        conn = ConnectionManager.getDbCon();
        String query = "SELECT od.order_ID , od.dateTime, i.itemName, odi.quantity, i.price FROM ((retail_app_schema.order od INNER JOIN retail_app_schema.order_item odi ON od.order_ID = odi.order_ID) INNER  JOIN retail_app_schema.item i ON odi.Item_ID = i.item_ID) WHERE od.order_ID = ? ";
        PreparedStatement ps = conn.insertUsingPreparedStatement(query);
        ps.setInt(1,orderId);
        ResultSet rs = conn.executeQueryUsingPrepStatement(ps);
        return rs;
    }
}
