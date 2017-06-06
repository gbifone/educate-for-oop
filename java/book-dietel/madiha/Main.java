/**
 * Created by TOSHIBA on 5/27/2017.
 */
import java.util.Scanner;
public class Main {
    public static void main ( String[] args ) {
        Scanner obj = new Scanner( System.in );
        HospitalRecord foundpatient = new HospitalRecord();

        Patient[] listOfPatient = new Patient[2] ;
        Patient object = new Patient();      //
        String[] searchDisease = new String[2];
        for( int m =0; m < 2; m++){
            listOfPatient =  getData( m );
        }
        for ( int j =0 ; j <2; j ++){
            System.out.println( " Enter the disease you want to search the patient of that disease  = " );
            searchDisease[j] = obj.nextLine( );
        }

    }
    public static Patient[] getData( int j) {
        Scanner obj = new Scanner( System.in );
        int id;
        String name, cnic, hospitalOfAdmission, address;

        Patient[] arrayOfPatient = new Patient[2];
        String[] disease = new String[2];
            Patient obj1 = new Patient( );

            System.out.println( " Enter the id = " );
            id = obj.nextInt( );
            obj1.setId( id );

            System.out.println( " Enter the name of the patient = " );
            name = obj.next( );
            obj1.setName( name );

            System.out.println( " Enter the cnic of the patient = " );
            cnic = obj.next( );
            obj1.setCnic( cnic );
            for (int i = 0; i < 2; i++) {
                System.out.println( " Enter the disease of the patient = " );
                disease[i] = obj.next( );
                obj1.setDisease( disease );
            }

            System.out.println( " Enter the name  of hospital = " );
            hospitalOfAdmission = obj.next( );
            obj1.sethospitalOfAdmission( hospitalOfAdmission );

            System.out.println( " Enter the address = " );
            address = obj.next( );
            obj1.setAddress( address );

            arrayOfPatient[j] = obj1;
        return arrayOfPatient;
    }

}