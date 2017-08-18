package Manager;

import java.util.Scanner;

public class ApplicationManager {
    Scanner input = new Scanner(System.in);
    UserManager userManager = new UserManager();
    ItemManager itemManager = new ItemManager();
    OrderManager orderManager = new OrderManager();

        public void manageApplication() throws  Exception {
            System.out.println("Press 1 to registration: \n" +
                                "Press 2 to view items: \n" +
                                 "Press 3 to purchase items:");
            int choice = input.nextInt();

            switch ( choice ){
                case 1:
                    userManager.addUser();
                    break;
                case 2:
                    itemManager.getAllItems();
                    break;
                case 3:
                    orderManager.getOrder();
                    break;
            }
        }
}
