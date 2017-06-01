/**
 * Created by Nadia on 5/27/2017.
 */
public class HospitalRecord {

    public Patient[] searchPatientsWithDisease(Patient[] arrOfPatient, String[] disease){

        Patient[] matchDisease = new Patient[2];

        for(int i = 0; i < arrOfPatient.length ; i++) {

            String[]  tempDisease = arrOfPatient[i].getDisease();

            for(int j = 0; j < disease.length; j++ ) {

                for(int k = 0; k < tempDisease.length ; k++) {

                    if (disease[j].equals(tempDisease[k])) {

                        matchDisease[i] = arrOfPatient[i];
                    }
                }
            }
        }
        return matchDisease;
    }
}
