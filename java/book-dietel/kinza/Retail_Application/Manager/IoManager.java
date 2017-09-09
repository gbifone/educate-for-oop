package Manager;

import Entities.Item;
import Entities.User;

import java.sql.ResultSet;
import java.util.*;

public class IoManager {
    Scanner input = new Scanner(System.in);

    public void printMenuMsg() {
        System.out.println("Press 1 to registration: \n" +
                "Press 2 to view items: \n" +
                "Press 3 to purchase items:");
    }

    public User getUserDetailFormCLI() throws Exception {
        User user = new User();
        System.out.println("Enter your name: ");
        String name = input.next();
        user.setUserName( name );
        System.out.println("Enter CNIC: ");
        String cnic = input.next();
        user.setUserCnic(cnic);
        System.out.println("Enter your email address: ");
        String email = input.next();
        user.setUserEmail(email);

        return user;
    }

    public void printAllItems(List<Item> list) {
        System.out.println("\n**List of Items**\n ");
        System.out.printf("%-8s %-15s %-10s %-10s\n" , "ItemId" ,  "ItemName",  "Price" , "Currency ");
        Iterator<Item> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.printf("%s\n", iterator.next());
        }
    }

    public String getEmailFromUser() {
        System.out.println("Enter your Email");
        String email = input.next();
        return email;
    }

    public void printWelcomeMsg() {
        System.out.println("Welcome User! \n Please select item you want to purchase: ");
    }

    public void printRegisterMsg() {
        System.out.println("You are not registered in our system. You have to register yourself first! ");
    }

    public List<List> getOrderByUser() {
        char ch = 'q';
        List<Integer> listOfItemId = new ArrayList<>();
        List<Integer> listOfQuantity = new ArrayList<>();
        List<List> listOfOrderedItems = new ArrayList<>();

        do {
            System.out.println("Enter Item to purchase: ");
            int purchasedItem = input.nextInt();
            listOfItemId.add(purchasedItem);
            System.out.println("Enter Quantity of selected item: ");
            int itemQty = input.nextInt();
            listOfQuantity.add(itemQty);
            System.out.println("Press \'q\' to Quit or \'c\' to Continue purchasing items: ");
            ch = input.next().charAt(0);
        } while (ch != 'q');
        listOfOrderedItems.add(listOfItemId);
        listOfOrderedItems.add(listOfQuantity);
        return listOfOrderedItems;
    }

    public void printOrderedItems(ResultSet rs) throws Exception {
        System.out.println("\nYou have ordered following items: \n");
        System.out.printf("%-10s %-15s %-10s %-10s %-15s\n", "Order_Id", "Order_Date", "Item_Name" , "Quantity", "Price");
        while (rs.next()){
            System.out.printf("%-10s %-15s %-10s %-10s %-15s\n", rs.getInt("order_ID"), rs.getDate("dateTime"),
                    rs.getString("itemName"), rs.getInt("quantity"), rs.getInt("price"));
        }
    }
}
