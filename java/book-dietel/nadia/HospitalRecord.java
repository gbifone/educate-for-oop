/**
 * Created by Nadia on 5/27/2017.
 */
import java.util.Scanner;

public class HospitalRecord {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        HospitalRecord input = new HospitalRecord();
        Patient obj = new Patient();

        Patient obj1 = new Patient(1,"nadia","31303-246278-0",{"fever,Malaria"}, "Ali Hospital","shahi Road");

        System.out.println("Enter your id:");
        int id = in.nextInt();
        obj.setId(id);
        System.out.println("Enter your name:");
        String name = in.nextLine();
        obj.setName(name);
        System.out.println("Enter your CNIC:");
        String CNIC = in.nextLine();
        obj.setCNIC(CNIC);
        System.out.println("Enter your Disease:");
        String[] disease = new String[5];
        obj.setDisease(disease);
        System.out.println("Enter the Name of Hospital:");
        String hospital = in.nextLine();
        obj.setHospitalOfAdmission(hospital);
        System.out.println("Enter Address of the Hospital:");
        String address = in.nextLine();
        obj.setAddress(address);

    }
}
