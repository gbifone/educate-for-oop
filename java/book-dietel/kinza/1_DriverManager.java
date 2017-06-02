import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
/**
 * Created by Kinza Fatima on 6/1/2017.
 */
public class DriverManager {
    public static void main ( String[] args ) {

        Scanner in = new Scanner ( System.in );
        DriverManager dm = new DriverManager ();
        ArrayList<Driver> arrOfDrivers = new ArrayList <> (  );
        ArrayList<String> vehicleList = new ArrayList <> (  );
        boolean a = true;

        while( a ) {
            Driver  d = new Driver ( );
            boolean b = true;

            System.out.println ( "Enter data for Driver: " );

            System.out.println ( "Enter id: " );
            d.setId ( in.nextLong ( ) );

            System.out.println ( "Enter Name: " );
            d.setName ( in.next ( ) );

            System.out.println ( "Enter Driver Type:" );
            d.setDriverType ( in.next ( ) );

            ArrayList<String>  vehicles = new ArrayList <> (  );
            for ( int i = 0 ; i < 3 ; i++ ){
                System.out.println ( "Enter Vehicles: " );
                vehicles.add ( in.next ( ) );
            }

            d.setVehicles ( vehicles );

            arrOfDrivers.add ( d );

            System.out.println ("Enter \"true\" to continue or \"false\" to exit input. " );
            a = in.nextBoolean ();
            System.out.println ( );
        }

        for(Driver arr: arrOfDrivers){
            System.out.println (arr.toString () );
        }

        System.out.println ("enter Vehicles for which you want to search Drivers: " );
        for(int i = 0; i < 3; i++){
             vehicleList.add ( in.next () );
        }


        System.out.println("Driver whose Vehicles is match with the given Vehicles: ");
        ArrayList<Driver> searchDriver = dm.searchDriversWithVehicles (arrOfDrivers,vehicleList);

        for(Driver s: searchDriver){
            System.out.println (s.toString () );
        }

    }

    public ArrayList<Driver> searchDriversWithVehicles(ArrayList<Driver> driver, ArrayList<String> vehicleList){
        ArrayList<Driver> matchVehicle = new ArrayList <> (  );

        for(Driver dri: driver ){
            Collections.sort(dri.getVehicles ());
            Collections.sort ( vehicleList );
            if ( dri.getVehicles ().equals ( vehicleList ) ) {
                matchVehicle.add ( dri );
            }
        }

        return matchVehicle;
    }
}
