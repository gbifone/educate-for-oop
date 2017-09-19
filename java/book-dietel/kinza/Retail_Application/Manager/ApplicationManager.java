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
    private String email = "";
    private User user;

    public void manageApplication() throws Exception {
        ioManager.printMenuMsg();
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                user = ioManager.getUserDetailFormCLI();
                userManager.addUser(user);
                break;
            case 2:
                List<Item> li = itemManager.getAllItems();
                ioManager.printAllItems(li);
                break;
            case 3:
                email = ioManager.getEmailFromUser();
                user = userManager.getUserByEmail( email );
                if ( user != null ) {
                    ioManager.printWelcomeMsg();
                    List<Item> listOfAllItems = itemManager.getAllItems();
                    ioManager.printAllItems(listOfAllItems);
                    orderManager.createOrder( user.getUserId( ) );
                    List<List> listOfOrderedItems = ioManager.getOrderByUser( );
                    int orderId = orderManager.createPurchase( listOfOrderedItems );
                    ResultSet rs = orderManager.getOrderDetail( orderId );
                    ioManager.printOrderedItems(rs);
                } else {
                    ioManager.printRegisterMsg();
                    user = ioManager.getUserDetailFormCLI();
                    userManager.addUser(user);
                }
                break;
            case 4:
                email = ioManager.getEmailFromUser();
                user = userManager.getUserByEmail( email );
                if ( user != null ) {
                    int orderId = orderManager.getOrderIdByUserId( user.getUserId() );
                    ResultSet rs = orderManager.getOrderDetail( orderId );
                    ioManager.printOrderedItems(rs);
                } else {
                    ioManager.printRegisterMsg();
                    user = ioManager.getUserDetailFormCLI();
                    userManager.addUser(user);
                }
                break;
        }
    }

    public static void main(String[] args) throws Exception {
        ApplicationManager applicationManager = new ApplicationManager();

        applicationManager.manageApplication();
    }

}
