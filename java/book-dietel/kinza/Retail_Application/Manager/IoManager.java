package Manager;

import Entities.*;

import java.sql.*;
import java.util.*;
import java.util.regex.*;

import org.apache.log4j.Logger;

public class IoManager {
    private final Logger logger = Logger.getLogger(this.getClass());
    private Scanner input = new Scanner(System.in);
    private Pattern namePattern = Pattern.compile("^[a-zA-Z]+$");
    private Pattern cnicPattern = Pattern.compile("^[0-9+]{5}-[0-9+]{7}-[0-9+]{1}$");
    private Pattern emailPattern = Pattern.compile("^[a-zA-Z0-9[!#$%^&*()+,/\\-_\\.\"]]+@[a-zA-Z0-9[!#$%^&*()+,/\\-_\\.\"]]+\\.[a-zA-Z0-9[!#$%^&*()+,/\\-_\\.\"]]+$");
    private String name, cnic, email;
    private String verifiedEmail = "" , verifiedInput = "";;
    private boolean bool;

    public void printMenuMsg() {
        logger.info("Displaying menu");
        System.out.println("Press 1 To Registration: \n" +
                "Press 2 To View Items: \n" +
                "Press 3 To Purchase Items: \n" +
                "Press 4 To View Order Details: \n" +
                "Press 5 To Manage User: \n" +
                "Press 6 To Manage Item: \n");
    }

    public boolean getMatcher(Pattern pattern, String string) {
        Matcher matcher = pattern.matcher(string);
        if (matcher.find()) {
            bool = true;
        } else {
            bool = false;
        }
        return bool;
    }

    public User getUserDetailFormCLI() throws Exception {
        logger.info("getting user data from CLI");
        User user = new User();
        try {
            System.out.println("Enter your name: ");
            name = input.nextLine();
            bool = getMatcher(namePattern, name);
            if (bool) {
                user.setUserName(name);
            } else {
                throw new IoExceptionManager("Please enter a valid name");
            }
            System.out.println("Enter CNIC: ");
            cnic = input.next();
            bool = getMatcher(cnicPattern, cnic);
            if (bool) {
                user.setUserCnic(cnic);
            } else {
                throw new IoExceptionManager("Please enter a valid CNIC");
            }
            System.out.println("Enter your email address: ");
            email = input.next();
            bool = getMatcher(emailPattern, email);
            if (bool) {
                user.setUserEmail(email);
            } else {
                throw new IoExceptionManager("Please enter a valid email");
            }
        } catch (IoExceptionManager e) {
            logger.warn("Exception Occur: " + e);
        }
        return user;
    }

    public void printAllItems(List<Item> list) {
        logger.info("Displaying list of all items");
        System.out.println("\n**List of Items**\n ");
        System.out.printf("%-8s %-15s %-10s %-10s\n", "ItemId", "ItemName", "Price", "Currency ");
        Iterator<Item> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.printf("%s\n", iterator.next());
        }
    }

    public String getEmailToVerifyUser() {
        logger.info("getting email form user");
        try {
            System.out.println("Enter your Email");
            email = input.next();
            boolean bool = getMatcher(emailPattern, email);
            if (bool) {
                verifiedEmail = email;
            } else {
                throw new IoExceptionManager("Please enter a valid email");
            }
        } catch (IoExceptionManager e) {
            logger.warn("Exception Occur: " + e);
        }
        return verifiedEmail;
    }

    public boolean checkInputForEmailOrCnic( String inputString){
        logger.info("Checking input whether it is Email or CNIC");
        boolean bool = getMatcher(emailPattern, inputString);
        return bool;
    }

    public String getNewValueForUser(int option) {
        switch (option) {
            case 1:
                logger.info("getting name form user");
                try {
                    System.out.println("Enter your Name");
                    name = input.next();
                    bool = getMatcher(namePattern, name);
                    if (bool) {
                        verifiedInput = name;
                    } else {
                        throw new IoExceptionManager("Please enter a valid name");
                    }
                } catch (IoExceptionManager e) {
                    logger.warn("Exception Occur: " + e);
                }
                break;
            case 2:
                logger.info("getting cnic form user");
                try {
                    System.out.println("Enter your CNIC");
                    cnic = input.next();
                    bool = getMatcher(cnicPattern, cnic);
                    if (bool) {
                        verifiedInput = cnic;
                    } else {
                        throw new IoExceptionManager("Please enter a valid cnic");
                    }
                } catch (IoExceptionManager e) {
                    logger.warn("Exception Occur: " + e);
                }
                break;
        }
        return verifiedInput;
    }

    public void printWelcomeMsg() {
        logger.info("displaying welcome message");
        System.out.println("Welcome User! \n Please select item you want to purchase: ");
    }

    public void printRegWarningMsg() {
        logger.info("displaying Registration Warning message");
        System.out.println("You are not registered in our system. You have to register yourself first! ");
    }

    public List<List> getOrderByUser() {
        logger.info("getting order from user");
        char ch = 'q';
        String tempPurchasedItem, tempItemQty, character;
        int purchasedItem, itemQty;
        List<Integer> listOfItemId = new ArrayList<>();
        List<Integer> listOfQuantity = new ArrayList<>();
        List<List> listOfOrderedItems = new ArrayList<>();
        Pattern charPattern = Pattern.compile("^[qcQC]+$");
        Pattern integerPattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        try {
            do {
                System.out.println("Enter Item to purchase: ");
                tempPurchasedItem = input.next();
                bool = getMatcher(integerPattern, tempPurchasedItem);
                if (bool) {
                    purchasedItem = Integer.parseInt(tempPurchasedItem);
                    listOfItemId.add(purchasedItem);
                } else {
                    throw new IoExceptionManager("Enter numeric input");
                }
                System.out.println("Enter Quantity of selected item: ");
                tempItemQty = input.next();
                bool = getMatcher(integerPattern, tempItemQty);
                if (bool) {
                    itemQty = Integer.parseInt(tempItemQty);
                    listOfQuantity.add(itemQty);
                } else {
                    throw new IoExceptionManager("Enter numeric input");
                }
                System.out.println("Press \'q\' to Quit or \'c\' to Continue purchasing items: ");
                character = input.next();
                bool = getMatcher(charPattern, character);
                if (bool) {
                    ch = character.charAt(0);
                } else {
                    throw new IoExceptionManager("Enter a valid input \'q\' or \'c\' ");
                }
            } while (ch != 'q' && ch != 'Q');
            listOfOrderedItems.add(listOfItemId);
            listOfOrderedItems.add(listOfQuantity);
        } catch (IoExceptionManager e) {
            logger.warn("Exception Occur: " + e);
        }
        return listOfOrderedItems;
    }

    public void printOrderedItems(ResultSet rs) throws Exception {
        int bill = 0;
        logger.info("Displaying list of ordered items");
        System.out.println("\nYou have ordered following items: \n");
        System.out.printf("%-10s %-15s %-10s %-10s %-10s %-1s\n", "Order_Id", "Order_Date", "Item_Name", "Quantity", "Price", "Total");
        while (rs.next()) {
            System.out.printf("%-10s %-15s %-10s %-10s %-10s %1s\n", rs.getInt("order_ID"), rs.getDate("dateTime"),
                    rs.getString("itemName"), rs.getInt("quantity"), rs.getInt("price"),
                    ( rs.getInt("price") * rs.getInt("quantity") ));
            int sum = ( rs.getInt("price") * rs.getInt("quantity") );
            bill = bill + sum;
        }
        System.out.println("Your Total Bill is :" + bill);
    }

    public void manageUserMenu() {
        logger.info("Displaying Menu to Manage User ");
        System.out.println("Press 1 To Update Existing User \n " +
                "Press 2 To Delete Existing User");
    }

    public String getUserDataToUpdate() {
        logger.info("Getting User Data To Update");
        String verifiedInput = "";
        try {
            System.out.println("Please enter your Email / CNIC no. : ");
            String userInput = input.next();
            boolean boolEmail = userInput.endsWith(".com");
            if (boolEmail) {
                bool = getMatcher(emailPattern, userInput);
                if (bool) {
                    verifiedInput = userInput;
                } else {
                    throw new IoExceptionManager("Please enter a valid email");
                }
            } else {
                bool = getMatcher(cnicPattern, userInput);
                if (bool) {
                    verifiedInput = userInput;
                } else {
                    throw new IoExceptionManager("Please enter a valid CNIC");
                }
            }
        } catch (IoExceptionManager e) {
            logger.warn("Exception Occur: " + e);
        }
        return verifiedInput;
    }

    public void printUserPersonalDetail(User user) {
        logger.info("Displaying user's Personal Details ");
        System.out.println("\nYour personal Details : \n");
        System.out.printf("%-10s %-8s %-10s %-10s \n", "user_Id", "Name", "CNIC#", "Email");
        System.out.printf("%-10s %-8s %-10s %-10s \n", user.getUserId(), user.getUserName(),
                user.getUserCnic(), user.getUserEmail());
    }

    public void printMenuToUpdateUser() {
        logger.info("Displaying Menu to Update User");
        System.out.println("Press 1 to Update Name \n" +
                "Press 2 to Update CNIC \n" +
                "Press 3 to Update Email \n");
    }

    public void printOperationStatusMsg(int result) {
        logger.info("Displaying Operation Status Message ");
        if (result == 1) {
            System.out.println("You have successfully done! ");
        } else {
            System.out.println("Something went wrong! ");
        }
    }

    public void manageItemMenu(){
        logger.info("Displaying Menu to Manage Item");
        System.out.println( "Press 1 To Add Item\n" +
                            "Press 2 To Update Item \n"+
                            "Press 3 To Delete Item");
    }

    public Item getItemDetailFormCLI(){
        logger.info("Getting Item Information Form CLI");
        Item item = new Item();
        System.out.println("Enter Item Name: ");
        String itemName = input.next();
        item.setItemName(itemName);
        System.out.println("Enter Item Price: ");
        int itemPrice =input.nextInt();
        item.setPrice(itemPrice);
        System.out.println("Enter Currency:");
        String currency = input.next();
        item.setCurrency(currency);
        return item;
    }

    public String getItemNameToManageItem(){
        logger.info("Getting Item Name To Manage Item");
        System.out.println("Enter Item Name : ");
        name = input.nextLine();
        return name;
    }

    public void printMenuToUpdateItem(){
        logger.info("print Menu to Updating item");
        System.out.println( "Press 1 To Update Item Name: \n" +
                            "Press 2 To Update Item Price \n" +
                            "Press 3 To Update Currency"    );
    }

    public Object getNewValueForItem(int option){
        Object object = "";
        switch (option){
            case 1:
                logger.info("getting new name for Item");
                System.out.println("Enter New Name For Item");
                object = input.next();
                break;
            case 2:
                logger.info("getting new Price for Item");
                System.out.println("Enter New Price For Item");
                object = input.nextInt();

                break;
            case 3:
                logger.info("getting new name for Item");
                System.out.println("Enter New Currency For Item");
                object = input.next();
                break;
        }
        return object;
    }

}
