package Entities;

public class User {
    private int id;
    private String name;
    private String cnic;
    private String email;

    public User() {
    }

    public User(int id, String name, String cnic ,String email) {
        this.id = id;
        this.name = name;
        this.cnic = cnic;
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
        return cnic;
    }

    public void setCNIC(String CNIC) {
        this.cnic = CNIC;
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
                ", CNIC='" + cnic + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
