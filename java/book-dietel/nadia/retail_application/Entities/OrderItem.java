package Entities;

public class OrderItem {
    private int Id;
    private int quantity;

    public OrderItem(int Id, int quantity) {
        this.Id = Id;
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

    @Override
    public String toString() {
        return "OrderItem{" +
                "Id=" + Id +
                ", quantity=" + quantity +
                '}';
    }
}
