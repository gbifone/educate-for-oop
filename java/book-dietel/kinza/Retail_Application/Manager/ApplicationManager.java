package Manager;

import Entities.*;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.sql.ResultSet;
import java.util.*;

public class ApplicationManager {
    Scanner input = new Scanner(System.in);
    IoManager ioManager = new IoManager();
    ItemManager itemManager = new ItemManager();
    UserManager userManager = new UserManager();
    OrderManager orderManager = new OrderManager();
    private String email = "", name = "", cnic = "", inputData = "";
    private User user;
    private int result, choice;
    private boolean bool = false;
    ResultSet rs = null;

    public void manageApplication() throws Exception {
        ioManager.printMenuMsg();
        choice = input.nextInt();

        switch (choice) {
            case 1:
                user = ioManager.getUserDetailFormCLI();
                bool = userManager.checkUserForEmptyValues(user);
                if (bool) {
                    result = userManager.addUser(user);
                    ioManager.printOperationStatusMsg(result);
                }
                break;
            case 2:
                List<Item> li = itemManager.getAllItems();
                ioManager.printAllItems(li);
                break;
            case 3:
                email = ioManager.getEmailToVerifyUser();
                user = userManager.getUserByEmail(email);
                if (user != null) {
                    ioManager.printWelcomeMsg();
                    List<Item> listOfAllItems = itemManager.getAllItems();
                    ioManager.printAllItems(listOfAllItems);
                    orderManager.createOrder(user.getUserId());
                    List<List> listOfOrderedItems = ioManager.getOrderByUser();
                    int orderId = orderManager.createPurchase(listOfOrderedItems);
                    ResultSet rs = orderManager.getOrderDetail(orderId);
                    ioManager.printOrderedItems( rs );
                } else {
                    ioManager.printRegWarningMsg();
                    user = ioManager.getUserDetailFormCLI();
                    userManager.addUser(user);
                }
                break;
            case 4:
                email = ioManager.getEmailToVerifyUser();
                user = userManager.getUserByEmail(email);
                if (user != null) {
                    int orderId = orderManager.getOrderIdByUserId(user.getUserId());
                    rs = orderManager.getOrderDetail(orderId);
                    ioManager.printOrderedItems(rs);
                } else {
                    ioManager.printRegWarningMsg();
                    user = ioManager.getUserDetailFormCLI();
                    userManager.addUser(user);
                }
                break;
            case 5:
                ioManager.manageUserMenu();
                choice = input.nextInt();
                switch (choice) {
                    case 1:
                        inputData = ioManager.getUserDataToUpdate();
                        bool = ioManager.checkInputForEmailOrCnic( inputData );
                        if (bool) {
                            user = userManager.getUserByEmail(inputData);
                        } else {
                            user = userManager.getUserByCnic(inputData);
                        }
                        ioManager.printUserPersonalDetail(user);
                        ioManager.printMenuToUpdateUser();
                        choice = input.nextInt();
                        switch (choice) {
                            case 1:
                                name = ioManager.getNewValueForUser(choice);
                                result = userManager.updateUser(choice, name, user);
                                ioManager.printOperationStatusMsg(result);
                                break;
                            case 2:
                                cnic = ioManager.getNewValueForUser(choice);
                                result = userManager.updateUser(choice, cnic, user);
                                ioManager.printOperationStatusMsg(result);
                                break;
                            case 3:
                                email = ioManager.getEmailToVerifyUser();
                                result = userManager.updateUser(choice, email, user);
                                ioManager.printOperationStatusMsg(result);
                                break;
                        }
                        break;
                    case 2:
                        inputData = ioManager.getUserDataToUpdate();
                        bool = inputData.endsWith(".com");
                        if (bool) {
                            result = userManager.deleteUser(true, inputData);
                        } else {
                            result = userManager.deleteUser(false, inputData);
                        }
                        ioManager.printOperationStatusMsg(result);
                        break;
                }
                break;
            case 6:
                ioManager.manageItemMenu();
                choice = input.nextInt();
                switch (choice){
                    case 1:
                        Item item = ioManager.getItemDetailFormCLI();
                        result = itemManager.addItem( item );
                        ioManager.printOperationStatusMsg( result );
                        break;
                    case 2:
                        inputData = ioManager.getItemNameToManageItem();
                        ioManager.printMenuToUpdateItem();
                        choice = input.nextInt();
                        Object object ;
                        switch ( choice ){
                            case 1:
                                object = ioManager.getNewValueForItem( choice );
                                result = itemManager.updateItem( choice, object , inputData);
                                ioManager.printOperationStatusMsg(result);
                                break;
                            case 2:
                                object = ioManager.getNewValueForItem( choice );
                                result = itemManager.updateItem( choice, object , inputData);
                                ioManager.printOperationStatusMsg(result);
                                break;
                            case 3:
                                object = ioManager.getNewValueForItem( choice );
                                result = itemManager.updateItem( choice, object , inputData);
                                ioManager.printOperationStatusMsg(result);
                                break;
                        }
                        break;
                    case 3:
                        inputData = ioManager.getItemNameToManageItem();
                        result = itemManager.deleteItem( inputData );
                        ioManager.printOperationStatusMsg( result );
                        break;
                }
                break;
        }
    }

    public static Logger logger = Logger.getLogger(ApplicationManager.class);

    public static void main(String[] args) throws Exception {

        PropertyConfigurator.configure("log4j.properties");

        ApplicationManager applicationManager = new ApplicationManager();
        applicationManager.manageApplication();
    }

}
