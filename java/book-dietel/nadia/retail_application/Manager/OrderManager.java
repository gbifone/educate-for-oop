package Manager;

import Entities.Order;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

public class OrderManager {
    private final Logger log = Logger.getLogger(this.getClass());
    private ConnectionManager con = null;

    private int getOrderId() throws Exception {
        con = ConnectionManager.getDbCon();
        String query = "Select MAX(OrderId) FROM retail_schema.order";
        ResultSet rs = con.query(query);
        rs.next();
        int id = rs.getInt(1);
        return id;
    }

    private int getorderItemId() throws Exception {
        con = ConnectionManager.getDbCon();
        String query = "Select MAX(OrderItemId) FROM retail_schema.orderitem";
        ResultSet rs = con.query(query);
        rs.next();
        int id = rs.getInt(1);
        return id;
    }

    public Order createOrder(int userId) throws Exception {
        ApplicationManager.log.info("Placing order");
        int orderId = getOrderId();
        orderId++;
        Timestamp currentDateTime = new Timestamp(System.currentTimeMillis());
        con = ConnectionManager.getDbCon();
        String query = "INSERT INTO retail_schema.order VALUES (? , ? , ?)";
        PreparedStatement ps = con.insertUsingPrepStatement(query);
        ps.setInt(1, orderId);
        ps.setTimestamp(2, currentDateTime);
        ps.setInt(3, userId);
        int result = con.queryExecutionUsingPrepStat(ps);
        Order order = new Order();
        if (result == 1) {
            order.setOrderId(orderId);
            order.setDateTime(currentDateTime);
            order.setUserId(userId);
        }
        return order;

    }

    public int createPurchase(List<List> listOfOrderedItem) throws Exception {
        ApplicationManager.log.info("Inserting order detail in Database");
        int orderId = getOrderId();
        int orderItemId = getorderItemId();
        List<Integer> listOfIds = listOfOrderedItem.get(0);
        List<Integer> listOfQuantities = listOfOrderedItem.get(1);
        Iterator<Integer> iteratorOfIds = listOfIds.iterator();
        Iterator<Integer> iteratorOfQuantities = listOfQuantities.iterator();
        con = ConnectionManager.getDbCon();
        String query = "INSERT INTO retail_schema.orderitem VALUES (? , ? , ? , ?)";
        PreparedStatement ps = con.insertUsingPrepStatement(query);
        while (iteratorOfIds.hasNext()) {
            orderItemId++;
            ps.setInt(1, orderItemId);
            ps.setInt(2, orderId);
            ps.setInt(3, iteratorOfIds.next());
            ps.setInt(4, iteratorOfQuantities.next());
            con.queryExecutionUsingPrepStat(ps);
        }
        return orderId;
    }

    protected int getOrderIdByUserId(int uerId) throws Exception {
        con = ConnectionManager.getDbCon();
        String query = "SELECT OrderId FROM retail_schema.order WHERE UserId = ? ";
        PreparedStatement ps = con.insertUsingPrepStatement(query);
        ps.setInt(1, uerId);
        ResultSet rs = con.queryExecution(ps);
        rs.next();
        int orderId = rs.getInt("OrderId");
        return orderId;
    }

    public ResultSet getOrderDetail(int orderId) throws Exception {
        ApplicationManager.log.info("Getting detail of ordered item from Database");
        con = ConnectionManager.getDbCon();
        String query = "SELECT od.OrderId,od.DateTime,i.ItemName,odi.Quantity,i.Price FROM ((retail_schema.order od " +
                "INNER JOIN  retail_schema.orderitem odi ON od.OrderId = odi.OrderId)" +
                " INNER JOIN retail_schema.item i ON odi.ItemId = i.ItemId) WHERE od.OrderId = ?;";
        PreparedStatement ps = con.insertUsingPrepStatement(query);
        ps.setInt(1, orderId);
        ResultSet rs = con.queryExecution(ps);
        return rs;
    }

    public int getBill(ResultSet rs)throws Exception{
        int bill = 0 , price , quantity ;
        while (rs.next()){
            price = rs.getInt("Price");
            quantity = rs.getInt("Quantity");
            bill = bill + ( price *quantity );
        }
        return bill;
    }
}
