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

    public void setId ( long id ) {
        if( id == 0 ){
            System.out.println ("Invalid ID." );
        } else {
            this.id = id;
        }
    }

    public String getName ( ) { return name; }

    public void setName ( String name ) {
        if( name == null ){
            System.out.println ("Invalid name. " );
        } else {
            this.name = name;
        }
    }

    public String getDriverType ( ) { return driverType; }

    public void setDriverType ( String driverType ) {
        if(driverType == null){
            System.out.println ("Invalid Datatype." );
        } else {
            this.driverType = driverType;
        }
    }

    public ArrayList <String> getVehicles ( ) { return vehicles; }

    public void setVehicles ( ArrayList <String> vehicles ) {
        if(vehicles == null ){
            System.out.println ("Invalid Vehicles. " );
        }else {
            this.vehicles = vehicles;
        }
    }

    public String toString (){
        return (this.getId () +"  "+ this.getName () +"  "+ this.getDriverType () +"  "+ this.getVehicles ());
    }
}
