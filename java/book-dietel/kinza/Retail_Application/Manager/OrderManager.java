package Manager;

import java.sql.ResultSet;
import java.util.Scanner;

public class OrderManager {
    Scanner input = new Scanner( System. in );
    UserManager userManager = new UserManager();

    public void getOrder() throws Exception {
        String email;
        System.out.println("Please enter your email: ");
        email = input.nextLine();
        ResultSet rs = userManager.searchUser( email );

        if( rs.next() ){
            if ( rs.getString("email") != null && rs.getString("email").equals(email)){
                System.out.println("Welcome User! \n Please select item you want to purchase: ");
            }
        } else {
            System.out.println("You have to register yourself first: ");
            userManager.addUser();
        }
    }
}
