package Manager;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class IOManager {
    Scanner in = new Scanner(System.in);
    UserManager userManager = new UserManager();

    public void appMenu() {
        System.out.println("Press 1: To Registration \nPress 2: To View Items \nPress 3: To purchase Items ");
    }

    public void getUserData() throws Exception {
        System.out.println("Enter your Name:");
        String name = in.nextLine();
        System.out.println("Enter your CNIC:");
        String CNIC = in.next();
        System.out.println("Enter your Email:");
        String email = in.next();
        userManager.addUser(name, CNIC, email);
    }

    public String getUserEmail() {
        System.out.println("Enter your Email");
        String email = in.next();
        return email;
    }

    public void wellComeMessage() {
        System.out.println("WelCome\nNow You can purchase items");
    }

    public void registerFirst() {
        System.out.println("Sorry! Register yourself First\n");
    }

    public void itemHeading() {
        System.out.println("*********************");
        System.out.println("  List of All Items ");
        System.out.println("*********************\n");
    }

    public void listOfItem(List<String> list, List<Integer> intList) {
        Iterator iterator = list.iterator();
        Iterator iterator1 = intList.iterator();
        while (iterator.hasNext()) {
            System.out.printf("%s\t%s\n", iterator1.next(), iterator.next());
        }

    }
}
