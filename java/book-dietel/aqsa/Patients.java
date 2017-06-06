import java.util.Scanner;
/**
 * Created by Aqsa on 5/27/2017.
 */
public class Patients {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner (System.in);
        HospitalRecord p2 = new HospitalRecord ();

        PatientDetail[] recordOfPatients = new PatientDetail[5];
        PatientDetail[] searchPatients = new PatientDetail[5];
        String[] SearchDiseases = new String[5];
        //________________________________________________

        System.out.println ("Enter your detail: " );
        for(int i = 1; i <=5; i++)
        {
            recordOfPatients[i] = getDataFromUsers();
        }
        //____________________________________________________

        System.out.println ("Enter disease for searching : " );
        for(int j=0; j< SearchDiseases.length; j++)
        {
            SearchDiseases[j] = obj.next ();
        }
        //____________________________________________________

        for(int i = 0 ; i < searchPatients.length; i++)
        {
            System.out.println (searchPatients[i] = p2.searchPatientswithDisease ( recordOfPatients,SearchDiseases, i ) );
        }
    }
    public static PatientDetail getDataFromUsers()
    {
        Scanner obj = new Scanner (System.in);
        int id;
        String name;
        String cnic;
        String[] disease = new String[5];
        String hospitalOfAdmission;
        String address;
        System.out.println ("Enter id: ");
        id = obj.nextInt ( );
        PatientDetail arrayOfPatients;

        PatientDetail p1 = new PatientDetail ( );

        p1.setId (id);

        System.out.println ("Enter name: ");
        name = obj.next ( );
        p1.setName (name);

        System.out.println ("Enter cnic: ");
        cnic = obj.next ( );
        p1.setCnic (cnic);

        System.out.println ("Enter number of Disease: ");
        int number = obj.nextInt ( );

        for ( int i = 1; i <= number; i++ )
        {
            System.out.println ("Enter disease: " + i);
            disease[i] = obj.next ( );
            p1.setDisease (disease);
        }
        System.out.println ("Enter hospital of admission: ");
        hospitalOfAdmission = obj.next ( );
        p1.setHospitalOfAdmission (hospitalOfAdmission);

        System.out.println ("Enter address: ");
        address = obj.next ( );
        p1.setAddress (address);

        arrayOfPatients = p1;

        return arrayOfPatients;
    }
}

