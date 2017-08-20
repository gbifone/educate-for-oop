package Manager;

import Entities.Item;
import Entities.User;

import java.util.*;

public class IOManager {
    Scanner in = new Scanner(System.in);
    UserManager userManager = new UserManager();

    public void appMenu() {
        System.out.println("Press 1: To Registration \nPress 2: To View Items \nPress 3: To purchase Items ");
    }

    public List<String> getUserDetailFromCLI() throws Exception {
        List<String> list = new ArrayList<String>();
        System.out.println("Enter your Name:");
        String name = in.nextLine();
        System.out.println("Enter your CNIC:");
        String CNIC = in.next();
        System.out.println("Enter your Email:");
        String email = in.next();
        list.add(name);
        list.add(CNIC);
        list.add(email);
        return list;
    }

    public String getUserEmail() {
        System.out.println("Enter your Email");
        String email = in.next();
        return email;
    }

    public void wellComeMessage() {
        System.out.println("WelCome\nNow You can purchase items");
    }

    public void registerFirst() {
        System.out.println("Sorry! Register yourself First\n");
    }

    public void itemHeading() {
        System.out.println("*********************");
        System.out.println("  List of All Items ");
        System.out.println("*********************\n");
    }
    public void printItem(List<Item>  list){
        Iterator<Item> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    public List<Integer> getOrderByUser(){
        int i = 0;
        List<Integer> integers = new ArrayList<>();
       do {
            System.out.println("Enter Item Id");
            int id = in.nextInt();
            integers.add(id);
           System.out.println("Enter -1 For exit or 0 F0r continue");
           i = in.nextInt();
        } while (i == 0);

        return integers;
    }
    public void printOrderedItem(List<String>  list){
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
