package Entities;

public class User {
    private int id;
    private String name;
    private String CNIC;
    private String email;

    public User() {
    }

    public User(int id, String name, String CNIC ,String email) {
        this.id = id;
        this.name = name;
        this.CNIC = CNIC;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", CNIC='" + CNIC + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
