/**
 * Created by Nadia on 5/27/2017.
 */
public class Patient {

    private int id;
    private String name;
    private String CNIC;
    private String[] disease;
    private String hospitalOfAdmission;
    private String address;

    public Patient (){
        this.id = 0;
        this.name = null;
        this.CNIC = null;
        this.disease = null;
        this.hospitalOfAdmission = null;
        this.address = null;
    }

    public Patient(int id, String name, String CNIC, String[] disease, String hospitalOfAdmission, String address) {
        this.id = id;
        this.name = name;
        this.CNIC = CNIC;
        this.disease = disease;
        this.hospitalOfAdmission = hospitalOfAdmission;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCNIC() {
        return CNIC;
    }

    public void setCNIC(String CNIC) {
        this.CNIC = CNIC;
    }

    public String[] getDisease() {
        return disease;
    }

    public void setDisease(String[] disease) {
        //for(int i =0; i < disease.length ; i++){
            this.disease = disease;
           // System.out.println(this.disease[i]);
        //}
    }
    public String getHospitalOfAdmission() {
        return hospitalOfAdmission;
    }

    public void setHospitalOfAdmission(String hospitalOfAdmission) {
        this.hospitalOfAdmission = hospitalOfAdmission;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString(){
        return ( "id:" + this.id + "name:" + this.name + "CNIC" + this.CNIC  + "disease:" + this.disease +
                "hospitalOfAdmission:" + this.hospitalOfAdmission + "address:" + this.address);
    }
}
