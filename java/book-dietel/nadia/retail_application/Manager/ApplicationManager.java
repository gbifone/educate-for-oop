package Manager;

import Entities.Item;
import Entities.User;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.sql.ResultSet;
import java.util.List;
import java.util.Scanner;

public class ApplicationManager {

    private Scanner in = new Scanner(System.in);
    private IOManager ioManager = new IOManager();
    private UserManager userManager = new UserManager();
    private ItemManager itemManager = new ItemManager();
    private OrderManager orderManager = new OrderManager();
    User user;
    int choice, result;
    String name, email, cnic = "" ,inputData = "";
    boolean bool;

    public void manageApplication() throws Exception {
        ioManager.printAppMenu();
        choice = in.nextInt();
        switch (choice) {
            case 1:
                List<String> userDetail = ioManager.getUserDetailFromCLI();
                if (userDetail.size() == 3) {
                    userManager.addUser(userDetail);
                    ioManager.printRegCompleteMsg();
                } else {
                    ioManager.printRegErrorMsg();
                }
                break;
            case 2:
                List<Item> list = itemManager.getAllItems();
                ioManager.printItems(list);
                break;
            case 3:
                email = ioManager.getEmailToVerifyUser();
                user = userManager.getUserByEmail(email);
                if (user != null) {
                    ioManager.printWelComeMsg();
                    List<Item> listOfAllItems = itemManager.getAllItems();
                    ioManager.printItems(listOfAllItems);
                    orderManager.createOrder(user.getId());
                    List<List> listOfOrderedItem = ioManager.getOrderByUser();
                    int orderId = orderManager.createPurchase(listOfOrderedItem);
                    ResultSet rs = orderManager.getOrderDetail(orderId);
                    ioManager.printOrderedItem(rs);
                } else {
                    ioManager.printRegisterFirstMsg();
                    ioManager.getUserDetailFromCLI();
                }
                break;
            case 4:
                email = ioManager.getEmailToVerifyUser();
                user = userManager.getUserByEmail(email);
                if (user != null) {
                    int orderId = orderManager.getOrderIdByUserId(user.getId());
                    ResultSet rs = orderManager.getOrderDetail(orderId);
                    ioManager.printOrderedItem(rs);
                } else {
                    ioManager.printRegisterFirstMsg();

                }
                break;
            case 5:
                ioManager.manageUserMenu();
                choice = in.nextInt();
                switch (choice) {
                    case 1:
                        inputData = ioManager.getUserDataToUpdate();
                        bool = ioManager.checkInputForEmaiOrCNIC(inputData);
                        if (bool) {
                            user = userManager.getUserByEmail(inputData);
                        } else {
                            user = userManager.getUserByCNIC(inputData);
                        }
                        ioManager.printUserPersonalDetail(user);
                        ioManager.printMenuToUserUpdation();
                        choice = in.nextInt();
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
                choice = in.nextInt();
                switch (choice) {
                    case 1:
                        Item item = ioManager.getItemDetailFromCLI();
                        result = itemManager.addItem(item);
                        ioManager.printOperationStatusMsg(result);
                        break;
                    case 2:
                        inputData = ioManager.getItemNameToManageItem();
                        ioManager.printMenuToUpdateItem();
                        choice = in.nextInt();
                        Object obj;
                        switch (choice){
                            case 1:
                                obj = ioManager.getNewValueForItem(choice);
                                result = itemManager.updateItem(choice,obj,inputData);
                                ioManager.printOperationStatusMsg(result);
                                break;
                            case 2:
                                obj = ioManager.getNewValueForItem(choice);
                                result = itemManager.updateItem(choice,obj,inputData);
                                ioManager.printOperationStatusMsg(result);
                                break;
                            case 3:
                                obj = ioManager.getNewValueForItem(choice);
                                result = itemManager.updateItem(choice,obj,inputData);
                                ioManager.printOperationStatusMsg(result);
                                break;
                        }
                        break;
                    case 3:
                        inputData = ioManager.getItemNameToManageItem();
                        result = itemManager.deleteItem(inputData);
                        ioManager.printOperationStatusMsg(result);
                        break;
                }
                break;
        }
    }

    public static final Logger log = Logger.getLogger(ApplicationManager.class);

    public static void main(String[] args) throws Exception {

        PropertyConfigurator.configure("log4j.properties");

        ApplicationManager appManager = new ApplicationManager();
        appManager.manageApplication();
    }

}
