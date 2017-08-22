package Manager;

import Entities.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class UserManager {
    ConnectionManager con = null;

    public int userId() throws Exception {
        con = ConnectionManager.getDbCon();
        String query = "Select COUNT(*) AS rowcount FROM retail_schema.user";
        int id = con.idCount(query);
        return id;
    }

    public User addUser(List<String> strings) throws Exception {
        int userId = userId();
        userId++;
        con = ConnectionManager.getDbCon();
        String query = "INSERT INTO retail_schema.user VALUES (? , ? , ? , ?)";
        PreparedStatement ps = con.insertUsingPrepStatement(query);
        ps.setInt(1, userId);
        ps.setString(2, strings.get(0));
        ps.setString(3, strings.get(1));
        ps.setString(4, strings.get(2));
        int result = con.queryExecutionUsingPrepStat(ps);
        User user = new User();
        if (result == 1) {
            user.setName(strings.get(0));
            user.setCNIC(strings.get(1));
            user.setEmail(strings.get(2));
        }
        return user;
    }

    public void updateUser() {

    }

    public boolean getUserByEmail(String email) throws Exception {
        boolean bool = false;
        String query = "SELECT Email FROM  retail_schema.user WHERE Email = ? ";
        con = ConnectionManager.getDbCon();
        PreparedStatement ps = con.insertUsingPrepStatement(query);
        ps.setString(1, email);
        ResultSet rs = con.queryExecution(ps);
        if (rs.next()) {
            if (rs.getString("Email") != null && rs.getString("Email").equals(email)) {
                bool = true;
            }
        } else {
            bool = false;
        }
            return bool;
    }

    public void deleteUser() {

    }

    public void getUserById() {

    }

}
