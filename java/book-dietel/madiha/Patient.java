/**
 * Created by TOSHIBA on 5/27/2017.
 */

public class Patient {
    private int id;
    private String name, cnic, address, hospitalOfAdmission;
     public   String[] disease;


    public Patient ( ) {
        id = 0;
        name = null;
        cnic = null;
        disease = null;
        hospitalOfAdmission = null;
        address = null;
    }

    public Patient ( int id1, String name1, String cnic1, String[] disease1, String hospitalOfAdmission1, String address1 ) {
        id = id1;
        name = name1;
        disease = disease1;
        hospitalOfAdmission = hospitalOfAdmission1;
        cnic = cnic1;
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

    public String[] getDisease ( ) {
        return disease;
    }

    public void setDisease ( String[] disease ) {
        this.disease = disease;
    }

    public String gethospitalOfAdmission ( ) {
        return hospitalOfAdmission;
    }

    public void sethospitalOfAdmission ( String hospitalOfName1 ) {
        this.hospitalOfAdmission = hospitalOfName1;
    }

}

