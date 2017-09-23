package Manager;

import Entities.*;

import java.sql.*;
import java.util.*;

import org.apache.log4j.Logger;

public class OrderManager {
    private final Logger logger = Logger.getLogger(this.getClass());
    private ConnectionManager conn = null;

    private int getOrderIdFromDb() throws Exception {
        conn = ConnectionManager.getDbCon();
        String query = "SELECT MAX(order_ID) FROM retail_app_schema.order";
        ResultSet rs = conn.query(query);
        rs.next();
        int id = rs.getInt(1);
        return id;
    }

    private int getOrderItemId() throws Exception {
        conn = ConnectionManager.getDbCon();
        String query = "SELECT MAX(order_item_ID) FROM retail_app_schema.order_item";
        ResultSet rs = conn.query(query);
        rs.next();
        int id = rs.getInt(1);
        return id;
    }

    public Order createOrder(int userId) throws Exception {
        logger.info("Placing order");
        int orderId = getOrderIdFromDb();
        orderId++;
        Timestamp currDateTime = new Timestamp(System.currentTimeMillis());
        conn = ConnectionManager.getDbCon();
        String insertUser = "INSERT INTO retail_app_schema.order VALUES ( ?, ?, ? )";
        PreparedStatement ps = conn.insertUsingPreparedStatement(insertUser);
        ps.setInt(1, orderId);
        ps.setTimestamp(2, currDateTime);
        ps.setInt(3, userId);
        int result = conn.executePrepStatement(ps);
        Order order = new Order();
        if (result == 1) {
            order.setOrderId(orderId);
            order.setDateTime(currDateTime);
            order.setUserId(userId);
        }
        return order;
    }

    public int createPurchase(List<List> listOfOrderedItems) throws Exception {
        logger.info("Inserting order details in Database");
        int orderId = getOrderIdFromDb();
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
        return orderId;
    }

    protected int getOrderIdByUserId(int userId) throws Exception {
        int orderId = 0;
        conn = ConnectionManager.getDbCon();
        String insertUser = "SELECT order_ID FROM retail_app_schema.order WHERE user_ID = ?";
        PreparedStatement ps = conn.insertUsingPreparedStatement(insertUser);
        ps.setInt(1, userId);
        ResultSet rs = conn.executeQueryUsingPrepStatement(ps);
        while (rs.next()) {
            orderId = rs.getInt("order_ID");
        }
        return orderId;
    }

    public ResultSet getOrderDetail(int orderId) throws Exception {
        logger.info("Getting details of ordered items from Database");
        conn = ConnectionManager.getDbCon();
        String query = "SELECT od.order_ID , od.dateTime, i.itemName, odi.quantity, " +
                "i.price FROM ((retail_app_schema.order od INNER JOIN retail_app_schema.order_item odi" +
                " ON od.order_ID = odi.order_ID) INNER  JOIN retail_app_schema.item i ON odi.Item_ID = i.item_ID) " +
                "WHERE od.order_ID = ? ";
        PreparedStatement ps = conn.insertUsingPreparedStatement(query);
        ps.setInt(1, orderId);
        ResultSet rs = conn.executeQueryUsingPrepStatement(ps);
        return rs;
    }

    public int getBill(ResultSet rs)throws Exception {
        int price, quantity, totalBill = 0;
        while ( rs.next() ){
            price = rs.getInt("price");
            quantity = rs.getInt("quantity");
            totalBill = totalBill + ( price * quantity );
        }
        return totalBill;
    }

}
