package Entities;

public class Item {
    private int item_ID;
    private String itemName;

    public Item(int item_ID, String itemName) {
        this.item_ID = item_ID;
        this.itemName = itemName;
    }

    public int getItem_ID() {
        return item_ID;
    }

    public void setItem_ID(int item_ID) {
        this.item_ID = item_ID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public String toString() {
        return "Item{" +
                "item_ID=" + item_ID +
                ", itemName='" + itemName + '\'' +
                '}';
    }
}
