package Manager;

import Entities.Item;

import java.awt.*;
import java.sql.ResultSet;
import java.util.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IOManager {
    Scanner in = new Scanner(System.in);

    public void printAppMenu() {
        System.out.println("Press 1: To Registration \nPress 2: To View Items \nPress 3: To purchase Items\n" +
                "Press 4: To View Order Detail ");
    }

    public List<String> getUserDetailFromCLI() throws Exception {
        Pattern namePattern = Pattern.compile("^[A-Za-z]+$");
        Pattern cnicPattern = Pattern.compile("^[A-Za-z]*$");
        Pattern emailPattern = Pattern.compile("^[A-Za-z0-9@.]+$");
        List<String> list = new ArrayList<String>();
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
            if (!cnicMatcher.find()) {
                list.add(cnic);
            } else {
                throw new IOExceptionManager("Please enter valid CNIC");
            }
            System.out.println("Enter your Email:");
            String email = in.next();
            Matcher emailMatcher = emailPattern.matcher(email);
            if (emailMatcher.find()) {
                list.add(email);
            } else {
                throw new IOExceptionManager("Please enter valid email");
            }
        } catch (IOExceptionManager ex) {
            System.err.println(ex);

        }
        return list;
    }

    public String getUserEmail() {
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
            System.err.println(ex);

        }
        return varifiedEmail;
    }

    public void printWelComeMsg() {
        System.out.println("WelCome\nNow you can purchase items!");
    }

    public void printRegisterFirstMsg() {
        System.out.println("Sorry!You are not registered in our system. Please register yourself first\n");
    }

    public void printItemHeadingMsg() {
        System.out.println("*********************\n List of All Items\n*********************");
    }

    public void printItems(List<Item> list) {
        System.out.printf("%-8s %-15s %-10s %-10s\n", "ItemId", "ItemName", "Price", "Currency");
        Iterator<Item> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public List<List> getOrderByUser() {
        String tempItemId = "";
        int itemId;
        String tempqty = "";
        int qty;
        String tempInput = "";
        int i = 0;
        List<Integer> ids = new ArrayList<>();
        List<Integer> quantaties = new ArrayList<>();
        List<List> detailOfOrderedItem = new ArrayList<>();
        Pattern charPattern = Pattern.compile("^[qcQC]+$");
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
        } catch (IOExceptionManager ex) {
            System.err.println(ex);
        }
        detailOfOrderedItem.add(ids);
        detailOfOrderedItem.add(quantaties);
        return detailOfOrderedItem;
    }

    public void printOrderedItem(ResultSet rs) throws Exception {
        System.out.println("\n\n You Ordered following items \n\n");
        System.out.printf("%-10s %-15s %-13s %-10s %-15s\n", "Order_id", "Order_Date", "Product_Name", "Quantity", "Price");
        while (rs.next()) {
            System.out.printf("%-10d %-15s %-15s %-8d %-15d\n", rs.getInt("OrderId"),
                    rs.getDate("DateTime"), rs.getString("ItemName"),
                    rs.getInt("Quantity"), rs.getInt("Price"));
        }
    }
}
