import java.util.ArrayList;

/**
 * Created by Aqsa on 6/2/2017.
 */
public class Driver
{
    private long id;
    private String name;
    private String driverType;
    private ArrayList<String> vehicles;

    public Driver() {

    }

    public long getId( ) {
        return id;
    }

    public void setId(long id) {
        if(id == 0)
            this.id = id;
    }

    public String getName( ) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDriverType( ) {
        return driverType;
    }

    public void setDriverType(String driverType) {
        this.driverType = driverType;
    }

    public ArrayList <String> getVehicles( ) {
        return vehicles;
    }

    public void setVehicles(ArrayList <String> vehicles) {
        this.vehicles = vehicles;


    }

    public String toString( ) {
        return this.getId ()+"\n"
                + this.getName ()+"\n"
                + this.getDriverType ()+"\n"
                + this.getVehicles ();
    }
}
