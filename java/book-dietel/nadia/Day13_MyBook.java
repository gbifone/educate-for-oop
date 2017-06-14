
public class MyBook extends Book {
   private int price;

    MyBook(String title,String author,int price){
        super(title,author);
        this.price = price;
    }
    void display(){
        System.out.printf("%s%s","Title: " ,title);
        System.out.printf("%s%s","Author: ",author);
        System.out.printf("%s%d","Price: " ,price);
    }
}
