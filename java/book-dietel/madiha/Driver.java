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
        this.id = id;
    }

    public String getName ( ) {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public String getDriverTye ( ) {
        return driverTye;
    }

    public void setDriverTye ( String driverTye ) {
        this.driverTye = driverTye;
    }

    public ArrayList <String> getVehicles ( ) {
        return vehicles;
    }

    public void setVehicles ( ArrayList <String> vehicles ) {
        this.vehicles = vehicles;
    }

    public String toString (){

        return  this.getId() + this.getName() + this.getVehicles() +this.getDriverTye();
    }
}
