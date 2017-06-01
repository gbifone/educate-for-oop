import java.util.Scanner;

/**
 * Created by Kinza Fatima on 5/27/2017.
 */
public class PaitentMain {
    public static void main ( String[] args ) {
        Scanner in = new Scanner ( System.in );
        int id, cnic;
        String name, disease, hospitalOfAdmission, address;
        char a = 'y';
        do {
            System.out.println ( "Enter id: " );
            id = in.nextInt ( );
            System.out.println ( "Enter Your name: " );
            name = in.nextLine ( );
            System.out.println ( "Enter CNIS no: " );
            cnic = in.nextInt ( );
            System.out.println ( "Enter disease: " );
            disease = in.nextLine ( );
            System.out.println ( "enter Name of Hospital" );
            hospitalOfAdmission = in.nextLine ( );
            System.out.println ( "Enter Address" );
            address = in.nextLine ( );

            System.out.println ("You want to enter more values? [Y/N] ");
        } while ( a == 'y'  );

        Paitent paitentName = new Paitent (id, name, cnic, disease, hospitalOfAdmission, address );



    }
}
