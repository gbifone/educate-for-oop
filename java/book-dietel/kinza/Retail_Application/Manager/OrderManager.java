package Manager;

import java.sql.ResultSet;

public class OrderManager {
    UserManager userManager = new UserManager();

    public void getOrder( String email) throws Exception {
        ResultSet rs = userManager.searchUser( email );

        if( rs.next() ){
            if ( rs.getString("email") != null && rs.getString("email").equals(email)){
                System.out.println("Welcome User! \n Please select item you want to purchase: ");
            }
        } else {
            System.out.println("You have to register yourself first: ");

        }
    }
}
