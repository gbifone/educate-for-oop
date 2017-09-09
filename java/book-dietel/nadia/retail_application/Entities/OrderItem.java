package Entities;

public class OrderItem {
    private int Id;
    private int orderId;
    private int itemId;
    private int quantity;

    public OrderItem() {

    }

    public OrderItem(int id, int orderId, int itemId, int quantity) {
        Id = id;
        this.orderId = orderId;
        this.itemId = itemId;
        this.quantity = quantity;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
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
                "Id=" + Id +
                ", getOrderId=" + orderId +
                ", itemId=" + itemId +
                ", quantity=" + quantity +
                '}';
    }
}
