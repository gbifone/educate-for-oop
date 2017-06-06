import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Kinza Fatima on 6/1/2017.
 */
public class DriverManager {
    public static void main ( String[] args ) {

        Scanner in = new Scanner ( System.in );
        DriverManager dm = new DriverManager ();
        ArrayList<String>  vehicles = new ArrayList <> (  );
        ArrayList<Driver> arrOfDrivers = new ArrayList <> (  );
        ArrayList<String> vehicleList = new ArrayList <> (  );
        boolean a = true;

        while( a ){
            Driver d = new Driver (  );
            boolean b = true;

            System.out.println ("Enter data for Driver: " );

            System.out.println (d.toString () );
            System.out.println ( );

            System.out.println ("Enter id: " );
            d.setId ( in.nextLong () );

            System.out.println ("Enter Name: " );
            d.setName ( in.next() );

            System.out.println ("Enter Driver Type:" );
            d.setDriverType ( in.next() );

            while ( b ){
                System.out.println ( "Enter Vehicles: " );
                vehicles.add ( in.next ( ) );
                d.setVehicles ( vehicles );

                System.out.println ("Enter \"true\" to continue or \"false\" to exit vehicles. " );
                b = in.nextBoolean ();
            }

            arrOfDrivers.add ( d );

            System.out.println ("Enter \"true\" to continue or \"false\" to exit input. " );
            a = in.nextBoolean ();
            System.out.println ( );
        }

        boolean c = true;
        System.out.println ("enter Vehicles for which you want to search Drivers: " );
        while( c ){
             vehicleList.add ( in.next () );
            System.out.println ("Enter \"true\" to continue or \"false\" to exit input. " );
            c = in.nextBoolean ();
        }

      //  System.out.println("Driver whose Vehicles is match with the given Vehicles: ");
      //  Driver[] searchDriver = dm.searchDriversWithVehicles (arrOfDrivers,vehicleList);

    }

   /* public Driver[] searchDriversWithVehicles(ArrayList<Driver> Driver, ArrayList<String > vehicleList){
        Driver[] matchVehicle = new Driver[2];


    }*/
}
