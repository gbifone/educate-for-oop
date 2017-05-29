/**
 * Created by Nadia on 5/27/2017.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        HospitalRecord input = new HospitalRecord();
        Patient[] arrOfPatient = new Patient[2];

        for(int j = 0; j < 2; j++) {
            Patient p = new Patient();

            System.out.println("Enter your id:");
            p.setId( in.nextInt() );

            System.out.println("Enter your name:");
            p.setName( in.next() );

            System.out.println("Enter your CNIC:");
            p.setCNIC( in.next() );

            System.out.println("Enter your Disease:");
            String[] disease = new String[2];
            for (int i = 0; i < 2; i++) {
                disease[i] = in.next();
            }
            p.setDisease( disease );

            System.out.println("Enter the Name of Hospital:");
            p.setHospitalOfAdmission( in.next() );

            System.out.println("Enter Address of the Hospital:");
             p.setAddress( in.next() );
            arrOfPatient[j] = p;
            System.out.println("\n");
        }

        System.out.println("Enter Disease You want to find:");
        String[] disease = new String[2];
        for (int i = 0; i < 2; i++) {
            disease[i] = in.next();
        }

        System.out.println("Patient whose Disease is match with the given Diseases");
        Patient[] foundPatient = input.searchPatientsWithDisease(arrOfPatient,disease);
        for(Patient s : foundPatient){
            System.out.println(s);

        }
    }
}
