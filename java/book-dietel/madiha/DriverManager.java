import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collection;

/**
 * Created by TOSHIBA on 6/1/2017.
 */
import java.util.ArrayList;

public class DriverManager {
    public static ArrayList <Driver> searchDriversWithVehicles ( ArrayList <Driver> driversList, ArrayList <String> searchVechicleList ) {

        ArrayList <Driver> searchedVehicle = new ArrayList <Driver>( );

        for ( Driver  d: driversList ){
            Collection.Sort ( searchedVehicle);
           // Collection.sort ( d.getVehicles());
            if( d.getVehicles().equals( searchVechicleList )){
                searchedVehicle.add( d );
            }
        }
        return searchedVehicle;
    }

    public static void main ( String[] args ) {

        int n;
        Scanner in = new Scanner( System.in );

        ArrayList <Driver> driver = new ArrayList <Driver>( );
        ArrayList <String> search = new ArrayList <String>( );
        ArrayList <Driver> foundDriver = new ArrayList <Driver>( );
       do {

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

           ArrayList <String> vehicles = new ArrayList <String>( );
           System.out.println( " Enter the vehicles  =" );
           vehicles.add( in.next( ) );
           vehicles.add( in.next( ) );
           vehicles.add( in.next( ) );
           obj.setVehicles( vehicles );

           driver.add( obj );
           System.out.println(" press 1 to enter more drivers =" );
           n = in.nextInt();
       }
       while ( n == 1);

        System.out.println( " Enter the vehicles whose driver you want to search = " );
        search.add( in.next( ) );
        search.add( in.next( ) );
        search.add( in.next( ) );
      foundDriver =  searchDriversWithVehicles( driver, search );

        for( Driver data : foundDriver ){
            System.out.println( data.toString() );
        }


    }
}