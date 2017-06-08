public class Invoice implements Payable  {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    public Invoice ( String part, String description, int count, double price ) {
        this.partNumber = part;
        this.partDescription = description;
        setQuantity ( count );
        setPricePerItem ( price );
    }
    public String getPartNumber ( ) {
        return partNumber;
    }

    public void setPartNumber ( String part ) {
        this.partNumber = part;
    }
    public String getPartDescription ( ) {
        return partDescription;
    }

    public void setPartDescription ( String description ) {
        this.partDescription = description;
    }

    public int getQuantity ( ) {
        return quantity;
    }

    public void setQuantity ( int count ) {
        if ( count >= 0 ) {
            this.quantity = count;
        } else {
            throw new IllegalArgumentException( "Quantity must be >= 0" );
        }
    }

    public double getPricePerItem ( ) {
        return pricePerItem;
    }

    public void setPricePerItem ( double price ) {
        if ( price >= 0.0 ){
            this.pricePerItem = price;
        } else {
            throw new IllegalArgumentException( "Price per item must be >= 0" );
        }
    }

    @Override
    public double getPaymentAmount() {
        return getQuantity() * getPricePerItem();
    }
    @Override
    public String toString() {
        return String.format( "%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f", "invoice", "part number", getPartNumber(), getPartDescription(), "quantity", getQuantity(), "price per item", getPricePerItem() ); }

}
