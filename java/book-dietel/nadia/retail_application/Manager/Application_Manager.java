package Manager;

import java.util.Scanner;

public class Application_Manager {

    Scanner obj = new Scanner(System.in);
    User_Manager userManager = new User_Manager();
    Item_Manager itemManager = new Item_Manager();
    Order_Manager orderManager = new Order_Manager();

    public void manage_application()throws Exception{
        System.out.println("Press 1: To Registration \nPress 2: To View Items \nPress 3: To purchase Items ");
        int choice = obj.nextInt();

        switch (choice){
            case 1:
                userManager.addUser();
                break;
            case 2:
                itemManager.getAllItem();
                break;
            case 3:
                orderManager.purchaseItem();
                break;
        }
    }
}
