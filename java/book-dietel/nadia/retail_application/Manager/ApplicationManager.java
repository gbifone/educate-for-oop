package Manager;

import Entities.Item;

import java.util.List;
import java.util.Scanner;

public class ApplicationManager {

    Scanner in = new Scanner(System.in);
    IOManager ioManager = new IOManager();
    UserManager userManager = new UserManager();
    ItemManager itemManager = new ItemManager();
    OrderManager orderManager = new OrderManager();

    public void manageApplication() throws Exception {
        ioManager.printAppMenu();
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                List<String> userDetail = ioManager.getUserDetailFromCLI();
                userManager.addUser(userDetail);
                break;
            case 2:
                ioManager.printItemHeadingMsg();
                List<Item> list = itemManager.getAllItems();
                ioManager.printItems(list);
                break;
            case 3:
                String email = ioManager.getUserEmail();
                boolean bool = userManager.getUserByEmail(email);
                if (bool) {
                    ioManager.printWelComeMsg();
                    ioManager.printItemHeadingMsg();
                    List<Item> listOfAllItems = itemManager.getAllItems();
                    ioManager.printItems(listOfAllItems);
                    List<Integer> listOfIds = ioManager.getOrderByUser();
                    List<String> listOfPurchasedItems = orderManager.purchaseItem(listOfIds);
                    ioManager.printOrderedItem(listOfPurchasedItems);
                } else {
                    ioManager.printRegisterFirstMsg();
                    ioManager.getUserDetailFromCLI();
                }
                break;
        }
    }
    public static void main(String[] args) throws Exception {

        ApplicationManager appManager = new ApplicationManager();
        appManager.manageApplication();
    }

}
