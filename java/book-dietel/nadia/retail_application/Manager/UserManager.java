package Manager;

import Entities.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Scanner;


public class UserManager {
    Scanner in = new Scanner(System.in);
    ConnectionManager con = null;

    public int userId() throws Exception {
        con = ConnectionManager.getDbCon();
        String query = "Select COUNT(*) AS rowcount FROM retail_schema.user";
        int id = con.idCount(query);
        return id;
    }

    public User addUser(List<String> strings)  throws Exception {
        int userId = userId();
        userId++;
        con = ConnectionManager.getDbCon();
        String query = "INSERT INTO retail_schema.user VALUES (? , ? , ? , ?)";
        PreparedStatement ps = con.insertUsingPrepStatment(query);
        ps.setInt(1, userId);
        ps.setString(2, strings.get(0));
        ps.setString(3, strings.get(1));
        ps.setString(4, strings.get(2));
        con.queryExecutionUsingPrepStat(ps);
        return null;
    }

    public void updateUser() {

    }

    public boolean getUser(String email) throws Exception {
        String query = "SELECT Email FROM  retail_schema.user WHERE Email = ? ";
        con = ConnectionManager.getDbCon();
        PreparedStatement ps = con.insertUsingPrepStatment(query);
        ps.setString(1, email);
        ResultSet rs = con.queryExecution(ps);
        if (rs.next()) {
            if (rs.getString("Email") != null && rs.getString("Email").equals(email)) {
            }
            return true;
        } else
            return false;
    }

    public void deleteUser() {

    }
}
