package Entities;

public class User {
    private int userId;
    private String userName;
    private String userCnic;

    public User(int userId, String userName, String userCnic) {
        this.userId = userId;
        this.userName = userName;
        this.userCnic = userCnic;
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

    @Override
    public String toString() {
        return "User{" +
                "user_ID=" + userId +
                ", userName='" + userName + '\'' +
                ", user_CNIC='" + userCnic + '\'' +
                '}';
    }
}
