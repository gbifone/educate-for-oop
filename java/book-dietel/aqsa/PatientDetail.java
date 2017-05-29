import java.util.Scanner;
/**
 * Created by Aqsa on 5/27/2017.
 */
public class PatientDetail {
    private int id;
    private String name;
    private String cnic;
    public String [] disease;
    private String hospitalOfAdmission;
    private String address;

    public PatientDetail( )
    {
        id = 0;
        name = null;
        cnic = null;
        disease = null;
        hospitalOfAdmission = null;
        address = null;
    }
    public PatientDetail(int id, String name, String cnic, String[] disease, String hospitalOfAdmission, String address) {
        this.id = id;
        this.name = name;
        this.cnic = cnic;
        this.disease = disease;
        this.hospitalOfAdmission = hospitalOfAdmission;
        this.address = address;
    }
    public int getId( ) {
        return id;
    }

    public void setId(int id) {
        if ( id == 0 ) {
            id = 0;
        } else
            this.id = id;
    }
    public String getName( ) {
        return name;
    }

    public void setName(String name) {
        if(name == null)
            name = null;
        else
            this.name = name;
    }
    public String getCnic( ) {
        return cnic;
    }

    public void setCnic(String cnic) {
        if(cnic==null)
            cnic = null;
        else
            this.cnic = cnic;
    }
    public String[] getDisease( ) {
        return disease;
    }

    public void setDisease(String[] disease) {
        if(disease==null)
            disease =null;
        else
            this.disease = disease;
    }
    public String getHospitalOfAdmission( ) {
        return hospitalOfAdmission;
    }

    public void setHospitalOfAdmission(String hospitalOfAdmission) {
        if(hospitalOfAdmission==null)
            hospitalOfAdmission=null;
        else
            this.hospitalOfAdmission = hospitalOfAdmission;
    }
    public String getAddress( ) {
        return address;
    }
    
    public void setAddress(String address) {
        if(address==null)
            address=null;
        else
            this.address = address;
    }
}
