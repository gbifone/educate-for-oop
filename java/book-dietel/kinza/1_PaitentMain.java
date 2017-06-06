import java.util.Scanner;

/**
 * Created by Kinza Fatima on 5/27/2017.
 */
public class PaitentMain {
    public static void main ( String[] args ) {
        Scanner in = new Scanner ( System.in );
        HospitalRecord record = new HospitalRecord ();



        Paitent[] recordOfPaitents = new Paitent[ 5 ];
        String[] searchDisease = new String[5];
        Paitent[] searchPaitients = new Paitent[5];

        System.out.println ("Enter Your details: " );
        for(int i = 0; i < 5; i++) {
            recordOfPaitents[ i ] = getDataFromPaitient ( );
        }

        System.out.println ("Enter disease to search record: " );
            for(int j = 0; j < searchDisease.length ; j++){
                searchDisease[j] = in.nextLine();

            }
            for(int i = 0 ; i < searchPaitients.length; i++) {
                System.out.println (searchPaitients[i] = record.searchPatientswithDisease ( recordOfPaitents, searchDisease, i ) );
            }

    }

    public static Paitent getDataFromPaitient( ) {
        Scanner in = new Scanner ( System.in );
        Paitent p1 = new Paitent ();

        int id;
        String name, cnic, hospitalOfAdmission, address;
        Paitent arrayOfPaitient ;
        String[] arrayOfDisease = new String[5];


            System.out.println ( "Enter id: " );
            id = in.nextInt ( );
            p1.setId ( id );

            System.out.println ( "Enter Your name: " );
            name = in.nextLine ( );
            p1.setName ( name );

            System.out.println ( "Enter CNIC no: " );
            cnic = in.nextLine ( );
            p1.setCnic ( cnic );

            for(int i = 0; i < 5; i++ ) {
                System.out.println ( "Enter disease: " );
                arrayOfDisease[i] = in.nextLine ();
            }
            p1.setDisease ( arrayOfDisease );

            System.out.println ( "Enter Name of Hospital" );
            hospitalOfAdmission = in.nextLine ( );
            p1.setHospitalOfAdmission ( hospitalOfAdmission );

            System.out.println ( "Enter Address" );
            address = in.nextLine ( );
            p1.setAddress ( address );

             arrayOfPaitient = p1;

             return arrayOfPaitient;



    }

}
