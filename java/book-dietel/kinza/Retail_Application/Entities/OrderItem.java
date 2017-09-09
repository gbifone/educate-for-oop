package Entities;

public class OrderItem {
    private int orderItemId;
    private int quantity;
    private int orderId;
    private int itemId;

    public OrderItem(int orderItemId, int quantity, int orderId, int itemId) {
        this.orderItemId = orderItemId;
        this.quantity = quantity;
        this.orderId = orderId;
        this.itemId = itemId;
    }

    public int getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(int orderItemId) {
        this.orderItemId = orderItemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "orderItemId=" + orderItemId +
                ", quantity=" + quantity +
                ", orderId=" + orderId +
                ", itemId=" + itemId +
                '}';
    }
}
