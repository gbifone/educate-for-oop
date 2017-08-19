package Manager;

import java.util.Scanner;

public class ApplicationManager {

    Scanner in = new Scanner(System.in);


    IOManager ioManager = new IOManager();
    ItemManager itemManager = new ItemManager();
    OrderManager orderManager = new OrderManager();

    public void manageApplication() throws Exception {
        ioManager.appMenu();
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                ioManager.getUserData();
                break;
            case 2:
                itemManager.getAllItems();
                break;
            case 3:
                String email = ioManager.getUserEmail();
                orderManager.purchaseItem(email);
                break;
        }
    }

}
