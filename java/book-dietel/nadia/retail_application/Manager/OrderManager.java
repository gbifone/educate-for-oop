package Manager;

import java.sql.ResultSet;

public class OrderManager {
    UserManager userManager = new UserManager();
    IOManager ioManager = new IOManager();


    public void purchaseItem(String email) throws Exception {
        ResultSet rs = userManager.getUser(email);
        if (rs.next()) {
            if (rs.getString("Email") != null && rs.getString("Email").equals(email)) {
                ioManager.wellComeMessage();
            }
        } else {
            ioManager.registerFirst();
            ioManager.getUserData();
        }
    }
}
