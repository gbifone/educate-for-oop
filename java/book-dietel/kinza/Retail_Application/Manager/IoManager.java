package Manager;

import Entities.*;
import java.sql.*;
import java.util.*;
import java.util.regex.*;
import org.apache.log4j.Logger;

public class IoManager {
    private final Logger logger = Logger.getLogger(this.getClass());
    Scanner input = new Scanner(System.in);

    public void printMenuMsg() {
        logger.info("Displaying menu");
        System.out.println( "Press 1 To Registration: \n" +
                            "Press 2 To View Items: \n" +
                            "Press 3 To Purchase Items: \n" +
                            "Press 4 To View Order Details: \n" +
                            "Press 5 To Manage User: \n" +
                            "Press 6 To Manage Item: \n");
    }

    public User getUserDetailFormCLI() throws Exception {
        logger.info("getting user data from CLI");
        Pattern namePattern = Pattern.compile("^[a-zA-Z]+$");
        Pattern cnicPattern = Pattern.compile("^[0-9]*$");
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
            if (cnicMatcher.find()) {
                user.setUserCnic(cnic);
            } else {
                throw new IoExceptionManager("Please enter a valid CNIC");
            }
            System.out.println("Enter your email address: ");
            String email = input.next();
            boolean bool = email.endsWith(".com");
            if ( bool ) {
                Matcher emailMatcher = emailPattern.matcher(email);
                if (emailMatcher.find()) {
                    user.setUserEmail(email);
                } else {
                    throw new IoExceptionManager("Please enter a valid email");
                }
            } else {
                throw new IoExceptionManager("Please enter a valid email");
            }
        } catch (IoExceptionManager e){
            logger.warn("Exception Occur: "+ e );
        }
        return user;
    }

    public void printAllItems(List<Item> list) {
        logger.info("Displaying list of all items");
        System.out.println("\n**List of Items**\n ");
        System.out.printf("%-8s %-15s %-10s %-10s\n" , "ItemId" ,  "ItemName",  "Price" , "Currency ");
        Iterator<Item> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.printf("%s\n", iterator.next());
        }
    }

    public String getEmailFromUser() {
        logger.info("getting email form user");
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
            logger.warn("Exception Occur: "+ e );
        }
        return emailOutput;
    }

    public String getNameFromUser() {
        logger.info("getting name form user");
        String nameInput = "";
        String nameOutput = "";
        Pattern namePattern = Pattern.compile("^[a-zA-Z]+$");
        try{
            System.out.println("Enter your Name");
            nameInput = input.next();
            Matcher nameMatcher = namePattern.matcher(nameInput);
            if (nameMatcher.find()) {
                nameOutput = nameInput;
            } else {
                throw new IoExceptionManager("Please enter a valid name");
            }
        } catch (IoExceptionManager e){
            logger.warn("Exception Occur: "+ e );
        }
        return nameOutput;
    }

    public String getCnicFromUser() {
        logger.info("getting cnic form user");
        String cnicInput = "";
        String cnicOutput = "";
        Pattern cnicPattern = Pattern.compile("^[0-9]+$");
        try{
            System.out.println("Enter your CNIC");
            cnicInput = input.next();
            Matcher cnicMatcher = cnicPattern.matcher(cnicInput);
            if (cnicMatcher.find()) {
                cnicOutput = cnicInput;
            } else {
                throw new IoExceptionManager("Please enter a valid cnic");
            }
        } catch (IoExceptionManager e){
            logger.warn("Exception Occur: "+ e );
        }
        return cnicOutput;
    }

    public void printWelcomeMsg() {
        logger.info("displaying welcome message");
        System.out.println("Welcome User! \n Please select item you want to purchase: ");
    }

    public void printRegWarningMsg() {
        logger.info("displaying Registration Warning message");
        System.out.println("You are not registered in our system. You have to register yourself first! ");
    }

    public void printRegCompletedMsg(){
        logger.info("displying registration successful message");
        System.out.println("Registration completed.");
    }

    public void printRegErrorMsg(){
        logger.info("displaying registration error message");
        System.out.println("You have Done something wrong in Registration");
    }

    public List<List> getOrderByUser() {
        logger.info("getting order from user");
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
            listOfOrderedItems.add(listOfItemId);
            listOfOrderedItems.add(listOfQuantity);
        } catch (IoExceptionManager e){
            logger.warn("Exception Occur: "+ e );
        }
        return listOfOrderedItems;
    }

    public void printOrderedItems(ResultSet rs) throws Exception {
        logger.info("Displaying list of ordered items");
        System.out.println("\nYou have ordered following items: \n");
        System.out.printf("%-10s %-15s %-10s %-10s %-15s\n", "Order_Id", "Order_Date", "Item_Name" , "Quantity", "Price");
        while (rs.next()){
            System.out.printf("%-10s %-15s %-10s %-10s %-15s\n", rs.getInt("order_ID"), rs.getDate("dateTime"),
                    rs.getString("itemName"), rs.getInt("quantity"), rs.getInt("price"));
        }
    }

    public void manageUserMenu(){
        logger.info("Displaying Menu to Manage User ");
        System.out.println("Press 1 To Update Existing User \n " +
                            "Press 2 To Delete Existing User");
    }

    public String getUserDataToUpdate( ) {
        logger.info("Getting User Data To Update");
        String verifiedInput = "";
        Pattern cnicPattern = Pattern.compile("^[0-9]*$");
        Pattern emailPattern = Pattern.compile("^[a-zA-Z0-9@.]+$");
        try {
            System.out.println("Please enter your Email / CNIC no. : ");
            String userInput = input.next();
            boolean bool = userInput.endsWith(".com");
            if( bool ) {
                    Matcher emailMatcher = emailPattern.matcher(userInput);
                    if (emailMatcher.find()) {
                        verifiedInput = userInput;
                    } else {
                        throw new IoExceptionManager("Please enter a valid email");
                    }
            } else {
                Matcher cnicMatcher = cnicPattern.matcher(userInput);
                if (cnicMatcher.find()) {
                    verifiedInput = userInput;
                } else {
                    throw new IoExceptionManager("Please enter a valid CNIC");
                }
            }
        } catch (IoExceptionManager e){
            logger.warn("Exception Occur: "+ e );
        }
        return verifiedInput;
    }

    public void printUserPersonalDetail( User user ){
        logger.info("Displaying user's Personal Details ");
        System.out.println("\nYour personal Details : \n");
        System.out.printf("%-10s %-8s %-10s %-10s \n", "user_Id", "Name", "CNIC#" , "Email");
        System.out.printf("%-10s %-8s %-10s %-10s \n", user.getUserId(), user.getUserName(),
                    user.getUserCnic(), user.getUserEmail() );
    }

    public void printMenuToUpdateUser( ){
        logger.info("Displaying Menu to Update User");
        System.out.println( "Press 1 to Update Name \n" +
                "Press 2 to Update CNIC \n" +
                "Press 3 to Update Email \n");
    }

    public void printUpdationMsg(int result){
        logger.info("Displaying Updation Message");
        if( result == 1){
            System.out.println("User Updated Successfully! ");
        } else {
            System.out.println("Something went wrong! ");
        }
    }

    public void printDeletionMsg(int result){
        logger.info("Displaying Deletion Message");
        if( result == 1){
            System.out.println("User Deleted Successfully! ");
        } else {
            System.out.println("Something went wrong! ");
        }
    }

}
