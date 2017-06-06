/**
 * Created by Kinza Fatima on 5/27/2017.
 */
public
class HospitalRecord {
    public Paitent searchPatientswithDisease ( Paitent[] paitient, String[] disease, int i ) {
        Paitent getPaitient = null;
        for ( int j = 0 ; j < 5 ; j++ )
            if ( paitient[ i ].disease == disease ) {
                getPaitient = paitient[ i ];
            }
        return getPaitient;
    }


}
