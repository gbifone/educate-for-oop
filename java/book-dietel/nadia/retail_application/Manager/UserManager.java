package Manager;

import Entities.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import org.apache.log4j.Logger;

public class UserManager {
    private final Logger log = Logger.getLogger(this.getClass());
    private ConnectionManager con = null;

    public int getUserId() throws Exception {
        con = ConnectionManager.getDbCon();
        String query = "Select MAX(Id) FROM retail_schema.user";
        ResultSet rs = con.query(query);
        rs.next();
        int id = rs.getInt(1);
        return id;
    }

    public User addUser(List<String> strings) throws Exception {
        log.info("Adding user in the Database");
        int userId = getUserId();
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

    public User getUserByEmail(String email) throws Exception {
        log.info("Verifying user by email");
        String query = "SELECT * FROM  retail_schema.user WHERE Email = ? ";
        con = ConnectionManager.getDbCon();
        PreparedStatement ps = con.insertUsingPrepStatement(query);
        ps.setString(1, email);
        ResultSet rs = con.queryExecution(ps);
        User user = new User();
        if (rs.next()) {
            if (rs.getString("Email") != null && rs.getString("Email").equals(email)) {
                user.setId(rs.getInt("Id"));
                user.setName(rs.getString("Name"));
                user.setCNIC(rs.getString("CNIC"));
                user.setEmail(rs.getString("Email"));

            }
        }
        return user;
    }

    public User getUserByCNIC(String cnic) throws Exception {
        log.info("Verifying user by CNIC");
        String query = "SELECT * FROM  retail_schema.user WHERE CNIC = ? ";
        con = ConnectionManager.getDbCon();
        PreparedStatement ps = con.insertUsingPrepStatement(query);
        ps.setString(1, cnic);
        ResultSet rs = con.queryExecution(ps);
        User user = new User();
        if (rs.next()) {
            if (rs.getString("CNIC") != null && rs.getString("CNIC").equals(cnic)) {
                user.setId(rs.getInt("Id"));
                user.setName(rs.getString("Name"));
                user.setCNIC(rs.getString("CNIC"));
                user.setEmail(rs.getString("Email"));

            }
        }
        return user;
    }

    public int updateUser(int option, String input, User user) throws Exception {
        con = ConnectionManager.getDbCon();
        String query;
        int res = 0;
        switch (option) {
            case 1:
                query = "UPDATE retail_schema.user SET Name = ?  WHERE CNIC = ? ";
                PreparedStatement ps1 = con.insertUsingPrepStatement(query);
                ps1.setString(1, input);
                ps1.setObject(2, user.getCNIC());
                res = con.queryExecutionUsingPrepStat(ps1);
                break;
            case 2:
                query = "UPDATE retail_schema.user SET CNIC = ?  WHERE CNIC = ? ";
                PreparedStatement ps2 = con.insertUsingPrepStatement(query);
                ps2.setString(1, input);
                ps2.setObject(2, user.getCNIC());
                res = con.queryExecutionUsingPrepStat(ps2);
                break;
            case 3:
                query = "UPDATE retail_schema.user SET Email = ?  WHERE CNIC = ? ";
                PreparedStatement ps3 = con.insertUsingPrepStatement(query);
                ps3.setString(1, input);
                ps3.setObject(2, user.getCNIC());
                res = con.queryExecutionUsingPrepStat(ps3);
                break;
        }
        return res;
    }

    public int deleteUser(Boolean bool, String inputDataForDeletion) throws Exception {
        log.info("Delete User from Database");
        int result;
        if (bool) {
            String query = "DELETE  FROM  retail_schema.user WHERE Email = ? ";
            con = ConnectionManager.getDbCon();
            PreparedStatement ps = con.insertUsingPrepStatement(query);
            ps.setString(1, inputDataForDeletion);
            result = con.queryExecutionUsingPrepStat(ps);
        } else {
            String query = "DELETE  FROM  retail_schema.user WHERE CNIC = ? ";
            con = ConnectionManager.getDbCon();
            PreparedStatement ps = con.insertUsingPrepStatement(query);
            ps.setString(1, inputDataForDeletion);
            result = con.queryExecutionUsingPrepStat(ps);
        }
        return result;
    }

}
