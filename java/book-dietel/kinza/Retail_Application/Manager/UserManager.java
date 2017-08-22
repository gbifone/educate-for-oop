package Manager;

import Entities.User;

import java.sql.*;

public class UserManager {
    ConnectionManager conn = null;

    public int getIdByDb() throws Exception {
        conn = ConnectionManager.getDbCon();
        String query = "SELECT COUNT(*) AS rowcount FROM retail_app_schema.user";
        int id = conn.idCount(query);
        return id;
    }

    public void addUser(User user) throws Exception {
        int userId = getIdByDb();
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

    public boolean searchUserByEmail(String email) throws Exception {
        boolean bool = true;
        String query = "SELECT retail_app_schema.user.email FROM retail_app_schema.user WHERE email = ? ";
        conn = ConnectionManager.getDbCon();
        PreparedStatement ps = conn.insertUsingPreparedStatement(query);
        ps.setString(1, email);
        ResultSet rs = conn.executeQuery(ps);
        if (rs.next()) {
            if (rs.getString("email") != null && rs.getString("email").equals(email)) {
                bool = true;
            }
        } else {
            bool = false;
        }
        return bool;
    }

    public void deleteUser() {

    }

}
