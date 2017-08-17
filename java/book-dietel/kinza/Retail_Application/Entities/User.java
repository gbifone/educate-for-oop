package Entities;

public class User {
    private int user_ID;
    private String userName;
    private String user_CNIC;

    public User(int user_ID, String userName, String user_CNIC) {
        this.user_ID = user_ID;
        this.userName = userName;
        this.user_CNIC = user_CNIC;
    }

    public int getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(int user_ID) {
        this.user_ID = user_ID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUser_CNIC() {
        return user_CNIC;
    }

    public void setUser_CNIC(String user_CNIC) {
        this.user_CNIC = user_CNIC;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_ID=" + user_ID +
                ", userName='" + userName + '\'' +
                ", user_CNIC='" + user_CNIC + '\'' +
                '}';
    }
}
