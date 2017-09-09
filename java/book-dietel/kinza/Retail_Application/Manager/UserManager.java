package Manager;

import Entities.User;

import java.sql.*;

public class UserManager {
    ConnectionManager conn = null;

    public int getUserId() throws Exception {
        conn = ConnectionManager.getDbCon();
        String query = "SELECT COUNT(*) AS rowcount FROM retail_app_schema.user";
        int id = conn.idCount(query);
        return id;
    }

    public void addUser(User user) throws Exception {
        int userId = getUserId();
        userId++;
        conn = ConnectionManager.getDbCon();

        String insertUser = "INSERT INTO retail_app_schema.user VALUES ( ?, ?, ?, ? )";
        PreparedStatement ps = conn.insertUsingPreparedStatement(insertUser);
        ps.setInt(1, userId);
        ps.setString(2, user.getUserName());
        ps.setString(3, user.getUserCnic());
        ps.setString(4, user.getUserEmail());

        conn.executePreparedStatement(ps);
    }

    public void updateUser() {

    }

    public User getUserByEmail(String email) throws Exception {
        String query = "SELECT * FROM retail_app_schema.user WHERE email = ? ";
        conn = ConnectionManager.getDbCon();
        PreparedStatement ps = conn.insertUsingPreparedStatement(query);
        ps.setString(1, email);
        ResultSet rs = conn.executeQueryUsingPrepStatement(ps);
        User user = new User();
        if (rs.next()) {
            if (rs.getString("email") != null && rs.getString("email").equals(email)) {
                user.setUserId(rs.getInt("user_ID"));
                user.setUserName(rs.getString("name"));
                user.setUserCnic(rs.getString("cnic"));
                user.setUserEmail(rs.getString("email"));
            }
        }
        return user;
    }

    public void deleteUser() {

    }
}
