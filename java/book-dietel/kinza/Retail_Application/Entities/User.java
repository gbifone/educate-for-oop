package Entities;

public class User {
    private int userId;
    private String userName;
    private String userCnic;
    private String userEmail;

    public User(){

    }

    public User(int userId, String userName, String userCnic, String userEmail) {
        this.userId = userId;
        this.userName = userName;
        this.userCnic = userCnic;
        this.userEmail = userEmail;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserCnic() {
        return userCnic;
    }

    public void setUserCnic(String userCnic) {
        this.userCnic = userCnic;
    }

    public String getUserEmail() { return userEmail; }

    public void setUserEmail(String userEmail) { this.userEmail = userEmail; }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userCnic='" + userCnic + '\'' +
                ", userEmail='" + userEmail + '\'' +
                '}';
    }
}
