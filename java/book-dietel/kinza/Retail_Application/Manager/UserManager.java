package Manager;

import Entities.User;
import java.sql.*;

public class UserManager {
    ConnectionManager conn = null;

    public int getIdByDb() throws Exception{
        conn = ConnectionManager.getDbCon();
        String query = "SELECT COUNT(*) AS rowcount FROM retail_app_schema.user";
        int id = conn.idCount(query);
        return id;
    }

    public void addUser(User user ) throws  Exception {
        int userId = getIdByDb();
        userId++;
        conn = ConnectionManager.getDbCon();

        String insertUser = "INSERT INTO retail_app_schema.user VALUES ( ?, ?, ?, ? )";
        PreparedStatement ps = conn.insertUsingPreparedStatement(insertUser);
        ps.setInt   (1, userId);
        ps.setString(2, user.getUserName());
        ps.setString(3, user.getUserCnic());
        ps.setString(4, user.getUserEmail());

        conn.executePreparedStatement( ps );
    }

    public void updateUser(){

    }

    public ResultSet searchUserByEmail(String email) throws Exception {
        String query = "SELECT retail_app_schema.user.email FROM retail_app_schema.user WHERE email = ? ";
        conn = ConnectionManager.getDbCon();
        PreparedStatement ps = conn.insertUsingPreparedStatement(query);
        ps.setString(1, email);
        ResultSet rs = conn.executeQuery(ps);
        return rs;
    }

    public void deleteUser(){

    }

    public boolean emailVerification(String  email ) throws Exception{
        boolean b = true;
        ResultSet rs = searchUserByEmail( email );
        if( rs.next() ){
            if ( rs.getString("email") != null && rs.getString("email").equals(email)){
                 b = true;
            }
        } else {
             b = false;
        }
        return b;
    }
}
