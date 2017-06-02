import java.util.ArrayList;

/**
 * Created by Nadia on 6/1/2017.
 */

public class Driver {

    private long id;
    private String name;
    private String driverType;
    private ArrayList<String> vehicles;

    public Driver() {
        this.id = 0;
        this.name = null;
        this.driverType = null;
        this.vehicles = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        if(id == 0){
            System.out.println("Invalid id");
        }
        else
         this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null){
            System.out.println("");
        }
        this.name = name;
    }

    public String getDriverType() {
        return driverType;
    }

    public void setDriverType(String driverType) {
        this.driverType = driverType;
    }

    public ArrayList<String> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<String> vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public String toString() {
        return this.getId()+"\n"+
                this.getName()+"\n"+
                this.getDriverType()+"\n"+
                this.getVehicles();
    }
}
