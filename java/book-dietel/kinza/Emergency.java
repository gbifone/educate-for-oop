public class Emergency {
    private String name;
    private String address;
    private String phoneNumber;
    private String emergencyType;
    private String levelOfEmergency;
    private String statusType;
    Emergency(){
    }
    public Emergency(String fName, String location, String phone, String emergency, String emergencyLevel , String status) {
        name = fName;
        address = location;
        phoneNumber = phone;
        emergencyType = emergency;
        levelOfEmergency = emergencyLevel;
        statusType = status;
    }

    public String getName ( ) { return name; }

    public void setName ( String name ) { this.name = name; }

    public String getAddress ( ) { return address; }

    public void setAddress ( String address ) { this.address = address; }

    public String getPhoneNumber ( ) { return phoneNumber; }

    public void setPhoneNumber ( String phoneNumber ) { this.phoneNumber = phoneNumber; }

    public String getEmergencyType ( ) { return emergencyType; }

    public void setEmergencyType ( String emergencyType ) { this.emergencyType = emergencyType; }

    public String getLevelOfEmergency ( ) { return levelOfEmergency; }

    public void setLevelOfEmergency ( String levelOfEmergency ) { this.levelOfEmergency = levelOfEmergency; }

    public String getResponseType ( ){
        return "OK. We give response to your emergency as soon as possible!";
    }

}
