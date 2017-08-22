package Manager;

import Entities.*;

import java.util.*;

public class ApplicationManager {
    Scanner input = new Scanner(System.in);
    IoManager ioManager = new IoManager();
    ItemManager itemManager = new ItemManager();
    UserManager userManager = new UserManager();
    OrderManager orderManager = new OrderManager();

    public void manageApplication() throws Exception {
        ioManager.printMenuMsg();
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                User user = ioManager.getUserDetailFormCLI();
                userManager.addUser(user);
                break;
            case 2:
                List<Item> li = itemManager.getAllItems();
                ioManager.printAllItems(li);
                break;
            case 3:
                String email = ioManager.getEmailFromUser();
                boolean bool = userManager.searchUserByEmail(email);
                if (bool) {
                    ioManager.printWelcomeMsg();
                    List<Item> listOfAllItems = itemManager.getAllItems();
                    ioManager.printAllItems(listOfAllItems);
                    List<Integer> arrayOfIds = ioManager.getOrderByUser();
                    List<String> listOfPurchasedItems = orderManager.getOrder(arrayOfIds);
                    ioManager.printOrderedItems(listOfPurchasedItems);
                } else {
                    ioManager.printRegisterMsg();
                    User userInput = ioManager.getUserDetailFormCLI();
                    userManager.addUser(userInput);
                }
                break;
        }
    }

    public static void main(String[] args) throws Exception {
        ApplicationManager applicationManager = new ApplicationManager();

        applicationManager.manageApplication();
    }

}
