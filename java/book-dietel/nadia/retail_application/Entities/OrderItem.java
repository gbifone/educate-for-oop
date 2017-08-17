package Entities;

public class OrderItem {
    private int orderId;
    private int quantity;

    public OrderItem(int orderId, int quantity) {
        this.orderId = orderId;
        this.quantity = quantity;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "orderId=" + orderId +
                ", quantity=" + quantity +
                '}';
    }
}
