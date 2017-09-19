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
    private String email = "";
    private User user;

    public void manageApplication() throws Exception {
        ioManager.printMenuMsg();
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                user = ioManager.getUserDetailFormCLI();
                boolean bool = userManager.verifyUser(user);
                if(bool) {
                    userManager.addUser(user);
                    ioManager.printRegCompletedMsg();
                } else {
                    ioManager.printRegErrorMsg();
                }
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
                    ioManager.printRegWarningMsg();
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
                    ioManager.printRegWarningMsg();
                    user = ioManager.getUserDetailFormCLI();
                    userManager.addUser(user);
                }
                break;
            case 5:
                ioManager.manageUserMenu();
                int ch = input.nextInt();
                switch (ch){
                    case 1:
                        String data = ioManager.getUserDataToUpdate();
                        boolean bol = data.endsWith(".com");
                        if( bol ){
                            user = userManager.getUserByEmail(data);
                        } else {
                            user = userManager.getUserByCnic(data);
                        }
                        ioManager.printUserPersonalDetail( user );
                        ioManager.printMenuToUpdateUser();
                        int option = input.nextInt();
                        int rs;
                        switch (option ){
                            case 1:
                                String name = ioManager.getNameFromUser();
                                rs = userManager.updateUser( option, name , user.getUserEmail());
                                ioManager.printUpdationMsg( rs );
                                break;
                            case 2:
                                String cnic = ioManager.getCnicFromUser();
                                rs = userManager.updateUser( option, cnic, user.getUserEmail() );
                                ioManager.printUpdationMsg( rs );
                                break;
                            case 3:
                                String email = ioManager.getEmailFromUser();
                                rs = userManager.updateUser( option, email, user.getUserEmail() );
                                ioManager.printUpdationMsg( rs );
                                break;
                        }
                        break;
                    case 2:
                        String userInput = ioManager.getUserDataToUpdate();
                        boolean bool1 = userInput.endsWith(".com");
                        int result;
                        if( bool1 ) {
                            result = userManager.deleteUser( true, userInput );
                        } else {
                            result = userManager.deleteUser( false, userInput );
                        }
                        ioManager.printDeletionMsg( result );
                        break;
                }
                break;
            case 6:
                break;
        }
    }
    public static  Logger logger = Logger.getLogger(ApplicationManager.class);

    public static void main(String[] args) throws Exception {

        PropertyConfigurator.configure("log4j.properties");
        //LogManager logManager = new LogManager();
        //logManager.setLogger();

        ApplicationManager applicationManager = new ApplicationManager();
        applicationManager.manageApplication();
    }

}
