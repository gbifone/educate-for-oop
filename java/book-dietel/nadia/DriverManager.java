
import java.util.Collections;
import java.util.ArrayList;
public class DriverManager {
    private static ArrayList<Driver> drivers = new ArrayList<>();
    public static void main(String[] args) {
        if (args.length > 0) {
                for(int j = 0; j < 7; j+=6) {
                    Driver d1 = new Driver();
                    d1.setId(Long.parseLong(args[j]));
                    d1.setName(args[j+1]);
                    d1.setDriverType(args[j+2]);
                    ArrayList<String> vehicles = new ArrayList<>();
                    for (int i = j+3; i <= j+5; i++) {
                        vehicles.add(args[i]);
                    }
                    d1.setVehicles(vehicles);
                    drivers.add(d1);
                }
        }
        for (Driver driver : drivers) {
            System.out.println(driver.toString());
        }
        System.out.println();
        ArrayList<String> toSearch = new ArrayList<>();
        toSearch.add("mehran");
        toSearch.add("cultus");
        toSearch.add("swift");
        System.out.println (searchDriversWithVehicles(toSearch));

    }
    public static ArrayList<Driver> searchDriversWithVehicles(ArrayList<String> arrayOfVehicles) {
        ArrayList<Driver> driverList = new ArrayList<>();
        for (Driver drv : drivers) {
            ArrayList<String> vehicles = drv.getVehicles();
            int count = 0;
            for (int i = 0; i < arrayOfVehicles.size(); i++) {
                for (int j = 0; j < vehicles.size(); j++) {
                    if (arrayOfVehicles.get(i).equals (vehicles.get (j) )) {
                        count++;
                    }
                }
            }
            if(count == 3)
            driverList.add(drv);
        }
        return driverList;
    }
}