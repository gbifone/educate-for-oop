package Manager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

    public void addUser(String name, String CNIC, String email) throws Exception {
        int userId = userId();
        userId++;
        con = ConnectionManager.getDbCon();
        String query = "INSERT INTO retail_schema.user VALUES (? , ? , ? , ?)";
        PreparedStatement ps = con.insertUsingPrepStatment(query);
        ps.setInt(1, userId);
        ps.setString(2, name);
        ps.setString(3, CNIC);
        ps.setString(4, email);
        con.queryExecutionUsingPrepStat(ps);
    }

    public void updateUser() {

    }

    public ResultSet getUser(String email) throws Exception {
        String query = "SELECT Email FROM  retail_schema.user WHERE Email = ? ";
        con = ConnectionManager.getDbCon();
        PreparedStatement ps = con.insertUsingPrepStatment(query);
        ps.setString(1, email);
        ResultSet rs = con.queryExecution(ps);
        return rs;

    }

    public void deleteUser() {

    }
}
