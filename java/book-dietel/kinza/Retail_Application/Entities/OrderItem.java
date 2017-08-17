package Entities;

public class OrderItem {
    private int order_ID;
    private int quantity;

    public OrderItem(int order_ID, int quantity) {
        this.order_ID = order_ID;
        this.quantity = quantity;
    }

    public int getOrder_ID() {
        return order_ID;
    }

    public void setOrder_ID(int order_ID) {
        this.order_ID = order_ID;
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
                "order_ID=" + order_ID +
                ", quantity=" + quantity +
                '}';
    }
}
