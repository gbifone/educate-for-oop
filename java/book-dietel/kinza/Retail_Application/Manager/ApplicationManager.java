package Manager;

import java.util.Scanner;

public class ApplicationManager {
    Scanner input = new Scanner(System.in);
    IoManager ioManager = new IoManager();
    ItemManager itemManager = new ItemManager();
    OrderManager orderManager = new OrderManager();

        public void manageApplication() throws  Exception {
            ioManager.menuMessage();
            int choice = input.nextInt();

            switch ( choice ){
                case 1:
                    ioManager.getUserInfo();
                    break;
                case 2:
                    itemManager.getAllItems();
                    break;
                case 3:
                    String email = ioManager.getEmailByUser();
                    orderManager.getOrder(email);
                    break;
            }
        }


}
