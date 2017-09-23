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
    private Scanner in = new Scanner(System.in);
    private boolean bool;
    private String name, email, cnic;
    private String  varifiedEmail = "";
    private Pattern namePattern = Pattern.compile("^[A-Za-z]+$");
    private Pattern cnicPattern = Pattern.compile("\"^[0-9+]{5}-[0-9+]{7}-[0-9]{1}$\"");
    private Pattern emailPattern = Pattern.compile("[a-zA-Z0-9[!#$%&'()*+,/\\-_\\.\\\"]]+@[a-zA-Z0-9[!#$%&'()*+,/\\-_\\\"]]+\\.[a-zA-Z0-9[!#$%&'()*+,/\\-_\\\"\\.]]+\"");

    public void printAppMenu() {
        log.info("Displaying Menu");
        System.out.println("Press 1: To Registration \n" +
                "Press 2: To View Items \n" +
                "Press 3: To purchase Items\n" +
                "Press 4: To View Order Detail \n" +
                "Press 5: To Manage User \n" +
                "Press 6: To Manage Item");
    }

    public boolean getMatcher(Pattern pattern, String str) {
        boolean bool = false;
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            bool = true;
        } else {
            bool = false;
        }
        return bool;
    }

    public List<String> getUserDetailFromCLI() throws Exception {
        List<String> list = new ArrayList<String>();
        log.info("Getting user information from CLI ");
        try {
            System.out.println("Enter your Name:");
            name = in.nextLine();
            bool = getMatcher(namePattern, name);
            if (bool) {
                list.add(name);
            } else {
                throw new IOExceptionManager("Please enter valid name");
            }
            System.out.println("Enter your CNIC:");
            cnic = in.next();
            bool = getMatcher(cnicPattern, cnic);
            if (bool) {
                list.add(cnic);
            } else {
                throw new IOExceptionManager("Please enter valid CNIC");
            }
            System.out.println("Enter your Email:");
            email = in.next();
            boolean boolEmail = email.endsWith(".com");
            if (boolEmail) {
                if (bool) {
                    list.add(email);
                } else {
                    throw new IOExceptionManager("Please enter valid email");
                }
            } else {
                throw new IOExceptionManager("Please enter valid email");
            }
        } catch (IOExceptionManager ex) {
            log.warn("Exception Occurred:" + ex);
        }
        return list;
    }

    public void printRegCompleteMsg() {
        log.info("Displaying Registration Successful message");
        System.out.println("You have successfully registered in the system.");
    }

    public void printRegErrorMsg() {
        log.info("Displaying Registration error message");
        System.out.println("You have done something wrong.");
    }

    public String getEmailToVerifyUser() {
        log.info("Getting email from the user");
        try {
            System.out.println("Enter your Email");
            email = in.next();
            bool = getMatcher(emailPattern, email);
            if (bool) {
                varifiedEmail = email;
            } else {
                throw new IOExceptionManager("Please enter valid email");
            }
        } catch (IOExceptionManager ex) {
            log.warn("Exception Occurred:" + ex);
        }
        return varifiedEmail;
    }

    public boolean checkInputForEmaiOrCNIC(String str){
        log.info("Check input whether it is email or CNIC");
        bool = getMatcher(emailPattern,str);
        return bool;
    }

    public String getNewValueForUser(int option) {
        String varifiedInput = "";
        switch (option) {
            case 1:
                log.info("Getting Name from the user");
                try {
                    System.out.println("Enter your Name");
                    name = in.next();
                    bool = getMatcher(namePattern, name);
                    if (bool) {
                        varifiedInput = name;
                    } else {
                        throw new IOExceptionManager("Please enter valid Name");
                    }
                } catch (IOExceptionManager ex) {
                    log.warn("Exception Occurred:" + ex);
                }
                break;
            case 2:
                log.info("Getting CNIC from the user");
                try {
                    System.out.println("Enter your CNIC");
                    cnic = in.next();
                    bool = getMatcher(cnicPattern, cnic);
                    if (bool) {
                        varifiedInput = cnic;
                    } else {
                        throw new IOExceptionManager("Please enter valid CNIC");
                    }
                } catch (IOExceptionManager ex) {
                    log.warn("Exception Occurred:" + ex);
                }
                break;
        }
        return varifiedInput;
    }

    public void printWelComeMsg() {
        log.info("\nShowing WelCome message ");
        System.out.println("WelCome\nNow you can purchase items!\n");
    }

    public void printRegisterFirstMsg() {
        log.info("Show that you are currently not Register in the system ");
        System.out.println("Sorry!You are not registered in our system. Please register yourself first\n");
    }

    public void printItems(List<Item> list) {
        log.info("Printing list of all items/product");
        System.out.println("*********************\n List of All Items\n*********************");
        System.out.printf("%-8s %-15s %-10s %-10s\n", "ItemId", "ItemName", "Price", "Currency");
        Iterator<Item> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
    }

    public List<List> getOrderByUser() {
        log.info("Getting order from the user");
        String tempItemId = "", tempqty = "", tempInput = "";
        int itemId, qty, i;
        List<Integer> ids = new ArrayList<>();
        List<Integer> quantaties = new ArrayList<>();
        List<List> detailOfOrderedItem = new ArrayList<>();
        Pattern integerPattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        try {
            do {
                System.out.println("Enter Item Id");
                tempItemId = in.next();
                bool = getMatcher(integerPattern, tempItemId);
                if (bool) {
                    itemId = Integer.parseInt(tempItemId);
                    ids.add(itemId);
                } else {
                    throw new IOExceptionManager("Enter input in digits");
                }
                System.out.println("Enter Item Qty");
                tempqty = in.next();
                bool = getMatcher(integerPattern, tempqty);
                if (bool) {
                    qty = Integer.parseInt(tempqty);
                    quantaties.add(qty);
                } else {
                    throw new IOExceptionManager("Enter input in digits");
                }
                System.out.println("Please Enter -1 For exit or 0 For continue");
                tempInput = in.next();
                bool = getMatcher(integerPattern, tempInput);
                if (bool) {
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

    public void printOrderedItem(ResultSet rs ) throws Exception {
        int bill = 0;
        log.info("Displaying list of ordered item:");
        System.out.println("\n\n You Ordered following items \n\n");
        System.out.printf("%-10s %-15s %-13s %-10s %-10s %-10s\n",
                "Order_id", "Order_Date", "Product_Name", "Quantity", "Price" , "Total");
        while (rs.next()) {
            System.out.printf("%-10d %-15s %-15s %-8d %-10d %-10s \n", rs.getInt("OrderId"),
                    rs.getDate("DateTime"), rs.getString("ItemName"),
                    rs.getInt("Quantity"), rs.getInt("Price"),
                    (rs.getInt("Price") * rs.getInt("Quantity")));
            int sum = rs.getInt("Price") * rs.getInt("Quantity");
            bill = bill + sum;
        }
        System.out.printf("\n%s%d","Your total bill is: ", bill);
    }

    public void manageUserMenu() {
        log.info("Display Menu to Manager User");
        System.out.println("Press 1: To Update User \n" +
                "Press 2: To Delete User \n");
    }

    public String getUserDataToUpdate() {
        log.info("Getting user Data to Update");
        String verifiedInput = "";
        try {
            System.out.println("Please enter your CNIC#/Email");
            String data = in.next();
            boolean boolEmail = data.endsWith(".com");
            if (boolEmail) {
                bool = getMatcher(emailPattern, data);
                if (bool) {
                    verifiedInput = data;
                } else {
                    throw new IOExceptionManager("Please enter valid email");
                }
            } else {
                bool = getMatcher(cnicPattern, data);
                if (bool) {
                    verifiedInput = data;
                } else {
                    throw new IOExceptionManager("Please enter valid CNIC");
                }
            }
        } catch (IOExceptionManager ex) {
            log.warn("Exception Occurred" + ex);
        }
        return verifiedInput;
    }

    public void printUserPersonalDetail(User user) {
        log.info("Displaying user Personal Detail:");
        System.out.println("\nYou Personal Detail\n");
        System.out.printf("%-6s %-13s %-15s %-10s \n", "Id", "Name", "CNIC", "Email");
        System.out.printf("%-6d %-13s %-15s %-10s \n", user.getId(),
                user.getName(), user.getCNIC(), user.getEmail());
    }

    public void printMenuToUserUpdation() {
        log.info("Displaying Menu message to Updata User");
        System.out.println("Press 1: To Update User  Name \n" +
                "Press 2: To Update User  CNIC\n" +
                "Press 3: To Update User  Email");
    }

    public void printOperationStatusMsg(int result) {
        log.info("Display Operation Status Message");
        if (result == 1) {
            System.out.println("You have Successfully done!");
        } else {
            System.out.println("Something Wrong!");
        }
    }

    public void manageItemMenu() {
        log.info("Display Menu to Manager Item");
        System.out.println("Press 1: To Add Item \n" +
                           "Press 2: To Update Item \n" +
                           "Press 3: To Delete Item \n");
    }

    public Item getItemDetailFromCLI() {
        log.info("Getting item information from CLI ");
        Item item = new Item();
        System.out.println("Enter item Name:");
        String itemName = in.next();
        item.setItemName(itemName);
        System.out.println("Enter item Price:");
        int itemPrice = in.nextInt();
        item.setPrice(itemPrice);
        System.out.println("Enter Currency:");
        String currency = in.next();
        item.setCurrency(currency);
        return item;
    }

    public String getItemNameToManageItem(){
        log.info("Getting item name to manage item");
        System.out.println("Enter item name");
        name = in.nextLine();
        return name;
    }

    public void printMenuToUpdateItem(){
        log.info("Print Menu to update item");
        System.out.println("Press 1: To Update Item Name \n" +
                        "Press 2: To Update Item Price \n" +
                        "Press 3: To Update Item Currency");
    }

    public Object getNewValueForItem(int option){
        Object input = "";
        switch (option){
            case 1:
                log.info("Getting item Name");
                System.out.println("Enter new Name for item ");
                name = in.nextLine();
                input = name;
                break;
            case 2:
                log.info("Getting item Name");
                System.out.println("Enter new Price for item");
                int price = in.nextInt();
                input = price;
                break;
            case 3:
                log.info("Getting item Name");
                System.out.println("Enter new Currency for item ");
                name = in.nextLine();
                input = name;
                break;
        }
        return input;
    }
}
