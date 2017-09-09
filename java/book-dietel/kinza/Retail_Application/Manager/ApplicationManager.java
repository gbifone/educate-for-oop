package Manager;

import Entities.*;

import java.sql.ResultSet;
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
                User userObj = userManager.getUserByEmail( email );
                if ( userObj != null ) {
                    ioManager.printWelcomeMsg();
                    List<Item> listOfAllItems = itemManager.getAllItems();
                    ioManager.printAllItems(listOfAllItems);
                    orderManager.createOrder( userObj.getUserId() );
                    List<List> listOfOrderedItems = ioManager.getOrderByUser();
                    orderManager.createPurchase( listOfOrderedItems );
                    ResultSet rs = orderManager.printOrderDetail();
                    ioManager.printOrderedItems(rs);

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
