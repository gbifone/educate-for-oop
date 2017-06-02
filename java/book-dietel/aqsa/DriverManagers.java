import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created by Aqsa on 6/2/2017.
 */
public class DriverManagers {

    public static void main(String[] args) {
        ArrayList<Driver> listOfDrivers = new ArrayList <> ();

        Scanner obj = new Scanner (System.in);
        DriverManagers objectOfThisClass = new DriverManagers ();
        Boolean v = true;

        while ( v ) {

            Driver objectOfDriverClass = new Driver ( );

            System.out.println ("Enter id: ");
            objectOfDriverClass.setId (obj.nextLong ( ));

            System.out.println ("Enter name: ");
            objectOfDriverClass.setName (obj.next ( ));

            System.out.println ("Enter driver type: ");
            objectOfDriverClass.setDriverType (obj.next ( ));

            ArrayList <String> vehicleList = new ArrayList <> ( );
            for ( int i = 0; i < 3; i++ ) {
                System.out.println ("Enter Vehicles: ");
                vehicleList.add (obj.next ( ));
                objectOfDriverClass.setVehicles (vehicleList);
            }
            listOfDrivers.add (objectOfDriverClass);
            System.out.println ("Enter false to exit loop and true for continue: ");
            v = obj.nextBoolean ( );

        }
        for(Driver to: listOfDrivers )
        {
            System.out.println (to.toString () );
        }

        ArrayList<String> searchVehicles = new ArrayList <> ();
        System.out.println ("Enter vehicles for search: " );
        for(int j=0; j< 3; j++)
        {
            searchVehicles.add (obj.next ());
        }
        System.out.println ("Result:" );
        ArrayList<Driver> resultOfMatchVahicles = objectOfThisClass.searchDriverWithVahicles (listOfDrivers,searchVehicles);
        for(Driver d: resultOfMatchVahicles)
        {
            System.out.println (d.toString () );
        }
    }
    public ArrayList<Driver> searchDriverWithVahicles( ArrayList<Driver> driverlist, ArrayList<String> searchListOfVahicles)
    {
        ArrayList<Driver> result = new ArrayList <> ();
        for(Driver var:driverlist)
        {
            if(var.getVehicles () .equals (searchListOfVahicles))
            {
                result.add (var);
            }
        }
        return result;
    }

}
