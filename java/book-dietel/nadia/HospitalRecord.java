/**
 * Created by Nadia on 5/27/2017.
 */
public class HospitalRecord {

    public Patient[] searchPatientsWithDisease(Patient[] arrOfPatient, String[] disease){
        Patient[] matchDisease = new Patient[2];
        for(int i = 0; i < 2 ; i++) {
            for(int j = 0; j < 2; j++ ) {
                if (arrOfPatient[i].getDisease()[j] == disease[i]) {

                    matchDisease[i] = arrOfPatient[i];
                }
            }
        }
        return matchDisease;
    }
}
