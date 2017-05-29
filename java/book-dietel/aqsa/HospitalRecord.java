/**
 * Created by Aqsa on 5/27/2017.
 */
public class HospitalRecord
{
    public PatientDetail searchPatientswithDisease(PatientDetail[] searchPatients, String[] searchDiseases, int index)
    {
        PatientDetail getPatient = null;

        for ( int j = 0 ; j < 5 ; j++ )

            if ( searchPatients[ index ].disease == searchDiseases )
            {
            getPatient = searchPatients[ index ];
            }
        return getPatient;
    }
}
