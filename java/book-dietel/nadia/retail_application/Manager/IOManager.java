package Manager;

import Entities.Item;

import java.awt.*;
import java.sql.ResultSet;
import java.util.*;
import java.util.List;

public class IOManager {
    Scanner in = new Scanner(System.in);

    public void printAppMenu() {
        System.out.println("Press 1: To Registration \nPress 2: To View Items \nPress 3: To purchase Items ");
    }

    public List<String> getUserDetailFromCLI() throws Exception {
        List<String> list = new ArrayList<String>();
        System.out.println("Enter your Name:");
        String name = in.next();
        System.out.println("Enter your CNIC:");
        String cnic = in.next();
        System.out.println("Enter your Email:");
        String email = in.next();
        list.add(name);
        list.add(cnic);
        list.add(email);
        return list;
    }

    public String getUserEmail() {
        System.out.println("Enter your Email");
        String email = in.next();
        return email;
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
        System.out.printf("%-8s %-15s %-10s %-10s\n" , "ItemId"  , "ItemName" , "Price" , "Currency");
        Iterator<Item> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public List<List> getOrderByUser() {
        List<Integer> ids = new ArrayList<>();
        List<Integer> quantaties = new ArrayList<>();
        List<List> detailOfOrderedItem = new ArrayList<>();
        int i = 0;
        do {
            System.out.println("Enter Item Id");
            int id = in.nextInt();
            ids.add(id);
            System.out.println("Enter Item Qty");
            int qty = in.nextInt();
            quantaties.add(qty);
            System.out.println("Please Enter -1 For exit or 0 For continue");
            i = in.nextInt();
        } while (i == 0);
        detailOfOrderedItem.add(ids);
        detailOfOrderedItem.add(quantaties);
        return detailOfOrderedItem;
    }

    public void printOrderedItem(ResultSet rs) throws Exception{
        System.out.println("\n\n You Ordered following items \n\n");
        System.out.printf("%-10s %-15s %-13s %-10s %-15s\n","Order_id" ,"Order_Date" , "Product_Name" , "Quantity" , "Price" );
        while (rs.next()){
            System.out.printf("%-10d %-15s %-15s %-8d %-15d\n", rs.getInt("OrderId") ,
                              rs.getDate("DateTime"), rs.getString("ItemName") ,
                              rs.getInt("Quantity"), rs.getInt("Price"));
        }
    }
}
