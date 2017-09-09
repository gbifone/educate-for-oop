package Entities;

public class Item {
    private int itemId;
    private String itemName;
    private int price;
    private String currency;

    public Item() {

    }

    public Item(int itemId, String itemName, int price, String currency) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        this.currency = currency;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return   String.format("%-8d %-15s %-10d %-10s" ,itemId , itemName , price ,currency);
    }
}
