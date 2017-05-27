/**
 * Created by Aqsa on 5/27/2017.
 */
import java.util.Scanner;
public class Patient
{
    private int id;
    private String name;
    private int cnic;
    private String disease;
    private int hospitalOfAdmission;
    private String address;

   // public Patient( ) {
    //}
    public Patient(int id1, String name1, int cnic1,String disease1, int hospitalOfAdmission1, String address1)
    {
        id = id1;
        name = name1;
        cnic = cnic1;
        disease = disease1;
        hospitalOfAdmission = hospitalOfAdmission1;
        address = address1;
    }

    public int getId( ) {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName( ) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCnic( ) {
        return cnic;
    }

    public void setCnic(int cnic) {
        this.cnic = cnic;
    }

    public String getDisease( ) {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public int getHospitalOfAdmission( ) {
        return hospitalOfAdmission;
    }

    public void setHospitalOfAdmission(int hospitalOfAdmission) {
        this.hospitalOfAdmission = hospitalOfAdmission;
    }

    public String getAddress( ) {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args)
    {

        Patient object = new Patient (12, "aqsa", 345, "fiver",1,"ryk");
        System.out.println ("Enter your id: "+ object.getId ()  );
        System.out.println ("Enter your name: "+ object.getName() );
        System.out.println ("Enter your cnic: " + object.getCnic() );
        System.out.println ("Enter your disease: " + object.getDisease ());
        System.out.println ("Enter address: " + object.getAddress ());
    }
}
