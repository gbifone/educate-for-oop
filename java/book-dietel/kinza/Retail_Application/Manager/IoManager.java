package Manager;

import Entities.Item;
import Entities.User;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.sql.ResultSet;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IoManager {
    Scanner input = new Scanner(System.in);

    public void printMenuMsg() {
        System.out.println("Press 1 to registration: \n" +
                "Press 2 to view items: \n" +
                "Press 3 to purchase items: \n" +
                "Press 4 to view order details: ");
    }

    public User getUserDetailFormCLI() throws Exception {
        Pattern namePattern = Pattern.compile("^[a-zA-Z]+$");
        Pattern cnicPattern = Pattern.compile("^[a-zA-Z]*$");
        Pattern emailPattern = Pattern.compile("^[a-zA-Z0-9@.]+$");
        User user = new User();
        try {
            System.out.println("Enter your name: ");
            String name = input.nextLine();
            Matcher nameMatcher = namePattern.matcher(name);
            if (nameMatcher.find()) {
                user.setUserName(name);
            } else {
                throw new IoExceptionManager("Please enter a valid name");
            }
            System.out.println("Enter CNIC: ");
            String cnic = input.next();
            Matcher cnicMatcher = cnicPattern.matcher(cnic);
            if (!cnicMatcher.find()) {
                user.setUserCnic(cnic);
            } else {
                throw new IoExceptionManager("Please enter a valid CNIC");
            }
            System.out.println("Enter your email address: ");
            String email = input.next();
            Matcher emailMatcher = emailPattern.matcher(email);
            if (emailMatcher.find()) {
                user.setUserEmail(email);
            } else {
                throw new IoExceptionManager("Please enter a valid email");
            }
        } catch (IoExceptionManager e){
            System.err.println( e);
        }
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
        String emailInput = "";
        String emailOutput = "";
        Pattern emailPattern = Pattern.compile("^[a-zA-Z0-9@.]+$");
        try{
            System.out.println("Enter your Email");
            emailInput = input.next();
            Matcher emailMatcher = emailPattern.matcher(emailInput);
            if (emailMatcher.find()) {
                emailOutput = emailInput;
            } else {
                throw new IoExceptionManager("Please enter a valid email");
            }
        } catch (IoExceptionManager e){
             System.err.println( e);
        }
        return emailOutput;
    }

    public void printWelcomeMsg() {
        System.out.println("Welcome User! \n Please select item you want to purchase: ");
    }

    public void printRegisterMsg() {
        System.out.println("You are not registered in our system. You have to register yourself first! ");
    }

    public List<List> getOrderByUser() {
        char ch = 'q';
        String tempPurchasedItem;
        int purchasedItem;
        String tempItemQty;
        int itemQty;
        String character;

        List<Integer> listOfItemId = new ArrayList<>();
        List<Integer> listOfQuantity = new ArrayList<>();
        List<List> listOfOrderedItems = new ArrayList<>();
        Pattern charPattern = Pattern.compile("^[qcQC]+$");
        Pattern integerPattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        try {
            do {
                System.out.println("Enter Item to purchase: ");
                tempPurchasedItem = input.next();
                Matcher itemMatcher = integerPattern.matcher(tempPurchasedItem);
                if (itemMatcher.find()) {
                    purchasedItem = Integer.parseInt(tempPurchasedItem);
                    listOfItemId.add(purchasedItem);
                } else {
                    throw new IoExceptionManager("Enter numeric input");
                }
                System.out.println("Enter Quantity of selected item: ");
                tempItemQty = input.next();
                Matcher qtyMatcher = integerPattern.matcher(tempItemQty);
                if (qtyMatcher.find()) {
                    itemQty = Integer.parseInt(tempItemQty);
                    listOfQuantity.add(itemQty);
                } else {
                    throw new IoExceptionManager("Enter numeric input");
                }
                System.out.println("Press \'q\' to Quit or \'c\' to Continue purchasing items: ");
                character = input.next();
                Matcher matcher = charPattern.matcher(character);
                if(matcher.find()){
                    ch = character.charAt(0);
                } else {
                    throw new IoExceptionManager("Enter a valid input \'q\' or \'c\' ");
                }
            } while (ch != 'q' && ch != 'Q');
        } catch (IoExceptionManager e){
            System.err.println(e);
        }
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
