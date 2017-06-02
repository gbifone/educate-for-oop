import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by TOSHIBA on 6/1/2017.
 */
import java.util.ArrayList;

public class DriverManager {
    public static void searchDriversWithVehicles ( ArrayList <Driver> driversList, ArrayList <String> searchVechicleList) {
        ArrayList <String> vehicle = new ArrayList <String>();
        

        }

    public static void main ( String[] args ) {

        Scanner in = new Scanner( System.in );
        ArrayList <String> vehicles = new ArrayList <String>( );
        ArrayList <Driver> driver = new ArrayList <Driver>( );
        ArrayList <String> search = new ArrayList <String>( );

            Driver obj = new Driver( );
            System.out.println( " Enter the id =" );
            long id = in.nextLong( );
            obj.setId( id );

            System.out.println( " Enter the name  =" );
            String name = in.next( );
            obj.setName( name );

            System.out.println( " Enter the Driver Type  =" );
            String driverType = in.next( );
            obj.setDriverTye( driverType );

            boolean t = true;
            while ( t ) {
                System.out.println( " Enter the vehicles  =" );
                vehicles.add( in.next( ) );
                obj.setVehicles( vehicles );
            }
            driver.add(obj);

        System.out.println( " Enter the vehicles whose driver you want to search = " );

        boolean tr = true;
        while ( tr ) {
            search.add( in.next( ) );
            searchDriversWithVehicles( driver, search );
        }
    }
}
