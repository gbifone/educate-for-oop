package Manager;

import Entities.Item;

import java.util.*;

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
        Iterator<Item> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public List<Integer> getOrderByUser() {
        List<Integer> integers = new ArrayList<>();
        int i = 0;
        do {
            System.out.println("Enter Item Id");
            int id = in.nextInt();
            integers.add(id);
            System.out.println("Please Enter -1 For exit or 0 For continue");
            i = in.nextInt();
        } while (i == 0);
        return integers;
    }

    public void printOrderedItem(List<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
