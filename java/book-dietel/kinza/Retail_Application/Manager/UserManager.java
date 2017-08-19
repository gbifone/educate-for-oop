package Manager;

import java.sql.*;

public class UserManager {
    ConnectionManager conn = null;

    public int userId() throws Exception{
        conn = ConnectionManager.getDbCon();
        String query = "SELECT COUNT(*) AS rowcount FROM retail_app_schema.user";
        int id = conn.idCount(query);
        return id;
    }

    public void addUser(String userName, String userCnic, String userEmail ) throws  Exception {
        int userId = userId();
        userId++;
        conn = ConnectionManager.getDbCon();

        String insertUser = "INSERT INTO retail_app_schema.user VALUES ( ?, ?, ?, ? )";
        PreparedStatement ps = conn.insertUsingPreparedStatement(insertUser);
        ps.setInt   (1, userId);
        ps.setString(2, userName);
        ps.setString(3, userCnic);
        ps.setString(4, userEmail);

        conn.executePreparedStatement( ps );
    }

    public void updateUser(){

    }

    public ResultSet searchUser(String email) throws Exception {
        String query = "SELECT retail_app_schema.user.email FROM retail_app_schema.user WHERE email = ? ";
        conn = ConnectionManager.getDbCon();
        PreparedStatement ps = conn.insertUsingPreparedStatement(query);
        ps.setString(1, email);
        ResultSet rs = conn.executeQuery(ps);
        return rs;
    }

    public void deleteUser(){

    }
}
