package Manager;

import java.util.*;

public class IoManager {
    Scanner input = new Scanner(System.in);
    UserManager userManager = new UserManager();

    public void menuMessage(){
        System.out.println("Press 1 to registration: \n" +
                            "Press 2 to view items: \n" +
                            "Press 3 to purchase items:");
    }

    public void getUserInfo() throws Exception {
        System.out.println("Enter your name: ");
        String userName = input.nextLine();
        System.out.println("Enter CNIC: ");
        String userCnic = input.nextLine();
        System.out.println("Enter your email address: ");
        String userEmail = input.nextLine();
        userManager.addUser(userName, userCnic, userEmail);
    }

    public String getEmailByUser() {
         System.out.println("Enter your Email");
         String email = input.next();
         return email;
    }

    public void printAllItems( List<Map <Integer,String >> list ){
        System.out.println("List of Items\n ");
        Iterator itrator = list.iterator();

        while (itrator.hasNext()){
            System.out.printf("%s\n", itrator.next());
        }
    }
}
