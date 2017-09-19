package Entities;

import java.sql.Timestamp;

public class Order {
    private int orderId;
    private Timestamp dateTime;
    private int userId;

    public Order(){

    }

    public Order(int orderId, Timestamp dateTime, int userId) {
        this.orderId = orderId;
        this.dateTime = dateTime;
        this.userId = userId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", dateTime=" + dateTime +
                ", userId=" + userId +
                '}';
    }
}
