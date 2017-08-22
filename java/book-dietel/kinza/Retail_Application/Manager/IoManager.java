package Manager;

import Entities.Item;
import Entities.User;

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
        user.setUserName(input.nextLine());
        System.out.println("Enter CNIC: ");
        user.setUserCnic(input.nextLine());
        System.out.println("Enter your email address: ");
        user.setUserEmail(input.nextLine());

        return user;
    }

    public void printAllItems(List<Item> list) {
        System.out.println("\n**List of Items**\n ");
        Iterator<Item> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.printf("%s\n", iterator.next());
        }
    }

    public String getEmailByUser() {
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

    public List<Integer> getOrderByUser() {
        char ch = 'q';
        List<Integer> arrayList = new ArrayList<>();
        do {
            System.out.println("Enter Items to purchase: ");
            int purchasedItem = input.nextInt();
            arrayList.add(purchasedItem);
            System.out.println("Press \'q\' to Quit or \'c\' to Continue purchasing items: ");
            ch = input.next().charAt(0);
        } while (ch != 'q');
        return arrayList;
    }

    public void printOrderedItems(List<String> listOfPurchasedItems) {
        System.out.println("\nYou have ordered following items: \n");
        Iterator<String> iterator = listOfPurchasedItems.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
