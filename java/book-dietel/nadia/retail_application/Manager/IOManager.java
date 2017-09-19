package Manager;

import Entities.Item;
import Entities.User;
import org.apache.log4j.Logger;
import java.sql.ResultSet;
import java.util.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IOManager {
    private final Logger log = Logger.getLogger(this.getClass());
    Scanner in = new Scanner(System.in);

    public void printAppMenu() {
        log.info("Displaying Menu");
        System.out.println("Press 1: To Registration \n" +
                           "Press 2: To View Items \n" +
                           "Press 3: To purchase Items\n" +
                           "Press 4: To View Order Detail \n" +
                           "Press 5: To Manage User \n" +
                           "Press 6: To Manage Item" );
    }

    public List<String> getUserDetailFromCLI() throws Exception {
        Pattern namePattern = Pattern.compile("^[A-Za-z]+$");
        Pattern cnicPattern = Pattern.compile("^[0-9-]*$");
        Pattern emailPattern = Pattern.compile("^[A-Za-z0-9@.]+$");
        List<String> list = new ArrayList<String>();
        log.info("Getting user information from CLI ");
        try {
            System.out.println("Enter your Name:");
            String name = in.nextLine();
            Matcher nameMatcher = namePattern.matcher(name);
            if (nameMatcher.find()) {
                list.add(name);
            } else {
                throw new IOExceptionManager("Please enter valid name");
            }
            System.out.println("Enter your CNIC:");
            String cnic = in.next();
            Matcher cnicMatcher = cnicPattern.matcher(cnic);
            if (cnicMatcher.find()) {
                list.add(cnic);
            } else {
                throw new IOExceptionManager("Please enter valid CNIC");
            }
            System.out.println("Enter your Email:");
            String email = in.next();
            boolean bool = email.endsWith(".com");
            if(bool) {
                Matcher emailMatcher = emailPattern.matcher(email);
                if (emailMatcher.find()) {
                    list.add(email);
                } else {
                    throw new IOExceptionManager("Please enter valid email");
                }
            }
            else {
                throw new IOExceptionManager("Please enter valid email");
            }
        } catch (IOExceptionManager ex) {
            log.warn("Exception Occurred:" + ex);
        }
        return list;
    }

    public void printRegCompleteMsg(){
        log.info("Displaying Registration Successful message");
        System.out.println("You have successfully register in the system.");
    }

    public void printRegErrorMsg(){
        log.info("Displaying Registration error message");
        System.out.println("You have done something wrong.");
    }

    public String getUserEmail() {
        log.info("Getting email from the user");
        String email;
        String varifiedEmail = "";
        Pattern emailPattern = Pattern.compile("^[A-Za-z0-9@.]+$");
        try {
            System.out.println("Enter your Email");
            email = in.next();
            Matcher emailMatcher = emailPattern.matcher(email);
            if (emailMatcher.find()) {
                varifiedEmail = email;
            } else {
                throw new IOExceptionManager("Please enter valid email");
            }
        } catch (IOExceptionManager ex) {
            log.warn("Exception Occurred:" + ex);
        }
        return varifiedEmail;
    }

    public String getUserName(){
        log.info("Getting Name from the user");
        String name;
        String varifiedname = "";
        Pattern emailPattern = Pattern.compile("^[A-Za-z]+$");
        try {
            System.out.println("Enter your Name");
            name = in.next();
            Matcher emailMatcher = emailPattern.matcher(name);
            if (emailMatcher.find()) {
                varifiedname = name;
            } else {
                throw new IOExceptionManager("Please enter valid Name");
            }
        } catch (IOExceptionManager ex) {
            log.warn("Exception Occurred:" + ex);
        }
        return varifiedname;
    }

    public String getUserCNIC(){
        log.info("Getting CNIC from the user");
        String cnic;
        String varifiedCnic = "";
        Pattern emailPattern = Pattern.compile("^[0-9-]*$");
        try {
            System.out.println("Enter your CNIC");
           cnic= in.next();
            Matcher emailMatcher = emailPattern.matcher(cnic);
            if (emailMatcher.find()) {
                varifiedCnic = cnic;
            } else {
                throw new IOExceptionManager("Please enter valid CNIC");
            }
        } catch (IOExceptionManager ex) {
            log.warn("Exception Occurred:" + ex);
        }
        return varifiedCnic;
    }

    public void printWelComeMsg() {
        log.info("Showing WelCome message ");
        System.out.println("WelCome\nNow you can purchase items!");
    }

    public void printRegisterFirstMsg() {
        log.info("Show that you are currently not Register in the system ");
        System.out.println("Sorry!You are not registered in our system. Please register yourself first\n");
    }

    public void printItemHeadingMsg() {
        log.info("Showing message of list of all item. ");
        System.out.println("*********************\n List of All Items\n*********************");
    }

    public void printItems(List<Item> list) {
        log.info("Printing list of all items/product");
        System.out.printf("%-8s %-15s %-10s %-10s\n", "ItemId", "ItemName", "Price", "Currency");
        Iterator<Item> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public List<List> getOrderByUser() {
        log.info("Getting order from the user");
        String tempItemId = "";
        int itemId;
        String tempqty = "";
        int qty;
        String tempInput = "";
        int i = 0;
        List<Integer> ids = new ArrayList<>();
        List<Integer> quantaties = new ArrayList<>();
        List<List> detailOfOrderedItem = new ArrayList<>();
        Pattern integerPattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        try {
            do {
                System.out.println("Enter Item Id");
                tempItemId = in.next();
                Matcher itemIdMatcher = integerPattern.matcher(tempItemId);
                if (itemIdMatcher.find()) {
                    itemId = Integer.parseInt(tempItemId);
                    ids.add(itemId);
                } else {
                    throw new IOExceptionManager("Enter input in digits");
                }
                System.out.println("Enter Item Qty");
                tempqty = in.next();
                Matcher qtyMatcher = integerPattern.matcher(tempqty);
                if (qtyMatcher.find()) {
                    qty = Integer.parseInt(tempqty);
                    quantaties.add(qty);
                } else {
                    throw new IOExceptionManager("Enter input in digits");
                }
                System.out.println("Please Enter -1 For exit or 0 For continue");
                tempInput = in.next();
                Matcher inputMatcher = integerPattern.matcher(tempInput);
                if (inputMatcher.find()) {
                    i = Integer.parseInt(tempInput);
                } else {
                    throw new IOExceptionManager("Enter valid input ");
                }
            } while (i == 0);
            detailOfOrderedItem.add(ids);
            detailOfOrderedItem.add(quantaties);
        } catch (IOExceptionManager ex) {
            log.warn("Exception Occurred" + ex);
        }
        return detailOfOrderedItem;
    }

    public void printOrderedItem(ResultSet rs) throws Exception {
        log.info("Displaying list of ordered item:");
        System.out.println("\n\n You Ordered following items \n\n");
        System.out.printf("%-10s %-15s %-13s %-10s %-15s\n", "Order_id", "Order_Date", "Product_Name", "Quantity", "Price");
        while (rs.next()) {
            System.out.printf("%-10d %-15s %-15s %-8d %-15d\n", rs.getInt("OrderId"),
                    rs.getDate("DateTime"), rs.getString("ItemName"),
                    rs.getInt("Quantity"), rs.getInt("Price"));
        }
    }

    public void manageUserMenu(){
        log.info("Display Menu to Manager User");
        System.out.println("Press 1: To Update User \n"+
                           "Press 2: To Delete User \n");
    }

    public String getUserDataToUpdate() {
        log.info("Getting user Data to Update");
        String verifiedInput = "";
        Pattern cnicPattern = Pattern.compile("^[0-9-]*$");
        Pattern emailPattern = Pattern.compile("^[A-Za-z0-9@.]+$");
        try {
            System.out.println("Please enter your CNIC#/Email");
            String data = in.next();
            boolean bool = data.endsWith(".com");
            if(bool){
                    Matcher emailMatcher = emailPattern.matcher(data);
                    if (emailMatcher.find()) {
                        verifiedInput= data;
                    } else {
                        throw new IOExceptionManager("Please enter valid email");
                    }
            } else {
                Matcher cnicMatcher = cnicPattern.matcher(data);
                if (cnicMatcher.find()) {
                    verifiedInput = data;
                } else {
                    throw new IOExceptionManager("Please enter valid CNIC");
                }
            }
        }catch (IOExceptionManager ex){
            log.warn("Exception Occurred" + ex);
        }
        return verifiedInput;
    }

    public void printUserPersonalDetail(User user){
        log.info("Displaying user Personal Detail:");
        System.out.println("\nYou Personal Detail\n");
        System.out.printf("%-6s %-13s %-15s %-10s \n", "Id", "Name", "CNIC", "Email");
        System.out.printf("%-6d %-13s %-15s %-10s \n", user.getId(),
                    user.getName(), user.getCNIC(),user.getEmail());
    }

    public void printUpdationMsg(int result){
        log.info("Display Updation Message");
        if(result == 1){
            System.out.println("User Updated successfully");
        } else {
            System.out.println("Something Wrong");
        }
    }

    public void printDeletionMsg(int result){
        log.info("Display Deletion Message");
        if(result == 1){
            System.out.println("User deleted successfully");
        } else {
            System.out.println("Something Wrong");
        }
    }

    public void printMenuToUserUpdation(){
        log.info("Displaying Menu message to Updata User");
        System.out.println("Press 1: To Update User  Name \n" +
                           "Press 2: To Update User  CNIC\n" +
                           "Press 3: To Update User  Email");
    }
}
