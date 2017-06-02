/**
 * Created by Nadia on 6/1/2017.
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class DriverManager {
    private static ArrayList<Driver> drivers = new ArrayList<>();

    public static void main(String[] args) {

        ArrayList<String> vehicles = new ArrayList<>();


        if (args.length > 0) {
            Driver d1 = new Driver();

            d1.setId(Long.parseLong(args[0]));
            d1.setName(args[1]);
            d1.setDriverType(args[2]);

            for (int i = 3; i < args.length; i++)
                vehicles.add(args[i]);

            d1.setVehicles(vehicles);
            drivers.add(d1);
        }

        for (Driver driver : drivers) {
            System.out.println(driver.toString());
        }
        System.out.println();

        ArrayList<String> toSearch = new ArrayList<>();
        toSearch.add("cycle1");
        toSearch.add("mazda");

        System.out.println(searchDriversWithVehicles(toSearch));

    }

    public static ArrayList<Driver> searchDriversWithVehicles(ArrayList<String> arrayOfVehicles) {
        ArrayList<Driver> driverList = new ArrayList<>();
        for (Driver drv : drivers) {
            if (!Collections.disjoint(drv.getVehicles(), arrayOfVehicles))      //checks for common elemets in both lists, if any of valus is common
                driverList.add(drv);
        }

        return driverList;
    }
}
