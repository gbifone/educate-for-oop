package Manager;

import Entities.Item;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ApplicationManager {

    Scanner         in              = new Scanner(System.in);
    IOManager       ioManager       = new IOManager();
    UserManager     userManager     = new UserManager();
    ItemManager     itemManager     = new ItemManager();
    OrderManager    orderManager    = new OrderManager();

    public void manageApplication() throws Exception {
        ioManager.appMenu();
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                List<String> s = ioManager.getUserDetailFromCLI();
                userManager.addUser(s);
                break;
            case 2:
                ioManager.itemHeading();
                List<Item> list = itemManager.getAllItems();
                ioManager.printItem(list);

                break;
            case 3:
                String email = ioManager.getUserEmail();
                boolean bool = userManager.getUser(email);
                if (bool){
                    ioManager.wellComeMessage();
                    ioManager.itemHeading();
                    List<Item> list1 = itemManager.getAllItems();
                    ioManager.printItem(list1);
                    List<Integer> listOfIds = ioManager.getOrderByUser();
                    List<String> list3 = orderManager.purchaseItem(listOfIds);
                    ioManager.printOrderedItem(list3);

                } else {
                    ioManager.registerFirst();
                    ioManager.getUserDetailFromCLI();
                }
                break;
        }
    }

}
