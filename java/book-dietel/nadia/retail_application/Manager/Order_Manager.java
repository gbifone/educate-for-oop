package Manager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Order_Manager {

    Scanner in = new Scanner(System.in);
    User_Manager userManager = new User_Manager();
    Connection_Manager con = null;

    public void purchaseItem() throws Exception {
        System.out.println("Enter your Email");
        String email = in.next();
        ResultSet rs = userManager.getUser(email);
        if (rs.next()) {
            if (rs.getString("Email") != null && rs.getString("Email").equals(email)) {
                System.out.println("WelCome\nYou can purchase an items");
            }
        } else {
            System.out.println("Sorry! Register yourself First\n");
            userManager.addUser();
        }
    }
}
