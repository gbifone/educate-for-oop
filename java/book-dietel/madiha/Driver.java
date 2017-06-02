/**
 * Created by TOSHIBA on 6/1/2017.
 */
import java.util.ArrayList;

public class Driver
{
    public long id;
    public String name, driverTye;
    ArrayList< String > vehicles = new ArrayList< String >();

    public long getId ( ) {
        return id;
    }

    public void setId ( long id ) {
        if( id ==0){
            System.out.println( " Invalid " );
        }
        else{
            this.id = id;
        }
    }

    public String getName ( ) {
        return name;
    }

    public void setName ( String name ) {

        if( name == null){
            System.out.println( " Invalid " );
        }
        else{
            this.name = name;
        }
    }

    public String getDriverTye ( ) {
        return driverTye;
    }

    public void setDriverTye ( String driverTye ) {
        if ( driverTye == null ){
            System.out.println( " Invalid " );
        }
        else{
            this.driverTye = driverTye;
        }
    }

    public ArrayList <String> getVehicles ( ) {
        return vehicles;
    }

    public void setVehicles ( ArrayList <String> vehicles ) {
        if( vehicles == null){
            System.out.println(" Invalid" );
        }
        else{
            this.vehicles = vehicles;
        }

    }

    public  String toString (){

        return  this.getId() + "  " + this.getName() + "  "+ this.getVehicles()+ "  " +this.getDriverTye();
    }
}
