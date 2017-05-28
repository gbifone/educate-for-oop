import java.util.Scanner;

/**
 * Created by TOSHIBA on 5/27/2017.
 */

    public class HospitalRecord {
    public void searchPatientswithDisease ( Patient[] list, String[] searchDisease ) {
        Patient[] foundPatient = new Patient[2];

        for (int i = 0; i < 2; i++) {
            if (list[4].disease[i] == searchDisease[i]) {
            foundPatient[i] = list[i];
            }
            System.out.println( foundPatient[i] );
        }
}
}