package Manager;

import Entities.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import org.apache.log4j.Logger;

public class UserManager {
    private   final Logger log = Logger.getLogger(this.getClass());
    ConnectionManager con = null;

    public int getuserId() throws Exception {
        con = ConnectionManager.getDbCon();
        String query = "Select COUNT(*) AS rowcount FROM retail_schema.user";
        int id = con.idCount(query);
        return id;
    }

    public User addUser(List<String> strings) throws Exception {
        log.info("Adding user in the Database");
        int userId = getuserId();
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

    public User getUserByEmail(String email) throws Exception {
        log.info("Verify user by email");
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

    public void deleteUser() {

    }

    public void getUserById() {

    }

}
