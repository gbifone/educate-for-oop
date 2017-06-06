import java.util.ArrayList;

/**
 * Created by Kinza Fatima on 6/1/2017.
 */
public class Driver {
    private long        id;
    private String      name;
    private String      driverType;
    private ArrayList<String> vehicles;

    public Driver(){
        this.id = 0;
        this.name = null;
        this.driverType = null;
        this.vehicles = null;
    }

    public long getId ( ) { return id; }

    public void setId ( long id ) { this.id = id; }

    public String getName ( ) { return name; }

    public void setName ( String name ) { this.name = name; }

    public String getDriverType ( ) { return driverType; }

    public void setDriverType ( String driverType ) { this.driverType = driverType; }

    public ArrayList <String> getVehicles ( ) { return vehicles; }

    public void setVehicles ( ArrayList <String> vehicles ) { this.vehicles = vehicles; }

    public String toString (){
        return ("You Should must enter all values i.e. id, name, driverType, and vehicles. ");
    }
}
