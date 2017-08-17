package Manager;

import java.util.Scanner;

public class ApplicationManager {
    Scanner input = new Scanner(System.in);

        public void manage_Application() {
            System.out.println("Press 1 to registration: ");
            System.out.println("Press 2 to view items: ");
            System.out.println("Press 3 to purchase items: ");
            int number = input.nextInt();

            if( number == 1 ){

            } else if ( number == 2 ){

            } else if ( number == 3 ){

            }
        }
}
