package Manager;

import Entities.Item;
import Entities.User;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.sql.ResultSet;
import java.util.List;
import java.util.Scanner;

public class ApplicationManager {

    Scanner in = new Scanner(System.in);
    IOManager ioManager = new IOManager();
    UserManager userManager = new UserManager();
    ItemManager itemManager = new ItemManager();
    OrderManager orderManager = new OrderManager();
    User user;
    private String email = "";

    public void manageApplication() throws Exception {
        ioManager.printAppMenu();
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                List<String> userDetail = ioManager.getUserDetailFromCLI();
                if(userDetail.size() == 3 ) {
                    userManager.addUser(userDetail);
                    ioManager.printRegCompleteMsg();
                } else {
                    ioManager.printRegErrorMsg();
                }
                break;
            case 2:
                ioManager.printItemHeadingMsg();
                List<Item> list = itemManager.getAllItems();
                ioManager.printItems(list);
                break;
            case 3:
                 email = ioManager.getUserEmail();
                 user = userManager.getUserByEmail(email);
                if (user != null) {
                    ioManager.printWelComeMsg();
                    ioManager.printItemHeadingMsg();
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
                email = ioManager.getUserEmail();
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
                int ch = in.nextInt();
                switch (ch){
                    case 1:
                        String inputData = ioManager.getUserDataToUpdate();
                        boolean bol = inputData.endsWith(".com");
                        if(bol){
                             user = userManager.getUserByEmail(inputData);
                        } else {
                            user = userManager.getUserByCNIC(inputData);
                        }
                        ioManager.printUserPersonalDetail(user);
                        ioManager.printMenuToUserUpdation();
                        int option = in.nextInt();
                        int res ;
                        switch (option){
                            case 1:
                                String nam = ioManager.getUserName();
                                res = userManager.updateUser(option ,nam,user.getCNIC());
                                ioManager.printUpdationMsg(res);
                                break;
                            case 2:
                                String cnic = ioManager.getUserCNIC();
                                res = userManager.updateUser(option ,cnic,user.getCNIC());
                                ioManager.printUpdationMsg(res);
                                break;
                            case 3:
                                String email = ioManager.getUserEmail();
                                res = userManager.updateUser(option,email,user.getCNIC());
                                ioManager.printUpdationMsg(res);
                                break;
                        }
                        break;
                    case 2:
                        String inputDataForDeletion = ioManager.getUserDataToUpdate();
                        boolean bool = inputDataForDeletion.endsWith(".com");
                        int result;
                        if(bool){
                            result = userManager.deleteUser(true,inputDataForDeletion);
                        } else {
                            result = userManager.deleteUser(false ,inputDataForDeletion);
                        }
                        ioManager.printDeletionMsg(result);
                        break;
                }
                break;
            case 6:
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
