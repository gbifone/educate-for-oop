/**
 * Created by TOSHIBA on 5/27/2017.
 */
import java.util.Scanner;
public class Patient {
    private int id;
    private String name, cnic, address, disease, hospitalOfAdmission;

    public Patient ( int id, String name, String cnic, String disease, String hostipalOfAdmission, String address ) {
        id = 0;
        name =" null";
        cnic ="  null";
        disease = " null";
        hostipalOfAdmission = " null";
        address = " null";
    }
    public  Patient( int id1,  String name1, String cnic1,  String hostipalOfAdmission1, String address1){
        id = id1;
        name = name1;
        cnic = cnic1;
        hostipalOfAdmission = hostipalOfAdmission1;
        address = address1;

    }

    public int getId ( ) {
        return id;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    public String getName ( ) {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public String getCnic ( ) {
        return cnic;
    }

    public void setCnic ( String cnic ) {
        this.cnic = cnic;
    }

    public String getAddress ( ) {
        return address;
    }

    public void setAddress ( String address ) {
        this.address = address;
    }

    public String getDisease ( ) {
        return disease;
    }

    public  void setDisease ( String disease ) {
        this.disease = disease;
    }

    public String getHospitalOfAdmission ( ) {
        return hospitalOfAdmission;
    }

    public void setHospitalOfAdmission ( String hospitalOfAdmission ) {
        this.hospitalOfAdmission = hospitalOfAdmission;
    }
     public class HospitalRecord {
        public void searchPatientswithDisease( String disease){
            String[ ] array ;

        }
     }

    public static void main ( String[] args ) {
        int id;
        String name, cnic, nameOfHospital, address;

        Scanner obj = new Scanner( System.in );
        System.out.println(" Enter the id = " );
        id = obj.nextInt();
        System.out.println(" Enter the name of the patient = " );
        name = obj.nextLine();
        System.out.println(" Enter the cnic of the patient = " );
        cnic = obj.nextLine();
        System.out.println(" Enter the name  of hospital = " );
        nameOfHospital = obj.nextLine();
        System.out.println(" Enter the address = " );
        address = obj.nextLine();


        Patient object1;




    }
}
