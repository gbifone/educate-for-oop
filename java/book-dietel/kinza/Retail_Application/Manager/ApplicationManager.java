package Manager;

import java.util.Scanner;

public class ApplicationManager {
    Scanner input = new Scanner(System.in);

        public void manageApplication() {
            System.out.println("Press 1 to registration: \n" +
                                "Press 2 to view items: \n" +
                                 "Press 3 to purchase items:");
            int choice = input.nextInt();

            switch ( choice ){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
        }
}
