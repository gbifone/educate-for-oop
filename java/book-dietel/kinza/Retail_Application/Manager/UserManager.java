package Manager;

import Entities.User;
import org.apache.log4j.Logger;

import java.sql.*;


public class UserManager {
    private final Logger logger = Logger.getLogger(this.getClass());
    private ConnectionManager conn = null;

    private int getUserIdFormDb() throws Exception {
        conn = ConnectionManager.getDbCon();
        String query = "SELECT MAX(user_ID) FROM retail_app_schema.user";
        ResultSet rs = conn.query(query);
        rs.next();
        int id = rs.getInt(1);
        return id;
    }

    public int addUser(User user) throws Exception {
        logger.info("Adding new user In Database");
        int userId = getUserIdFormDb();
        userId++;
        conn = ConnectionManager.getDbCon();

        String insertUser = "INSERT INTO retail_app_schema.user VALUES ( ?, ?, ?, ? )";
        PreparedStatement ps = conn.insertUsingPreparedStatement(insertUser);
        ps.setInt(1, userId);
        ps.setString(2, user.getUserName());
        ps.setString(3, user.getUserCnic());
        ps.setString(4, user.getUserEmail());

        int result = conn.executePrepStatement(ps);
        return result;
    }

    public boolean checkUserForEmptyValues(User user) {
        logger.info("Verifying user");
        boolean bool = false;
        if (user != null) {
            if (user.getUserName() != null && user.getUserCnic() != null && user.getUserEmail() != null) {
                bool = true;
            }
        } else {
            bool = false;
        }
        return bool;
    }

    public User getUserByEmail(String email) throws Exception {
        logger.info("Verifying user by email ");
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

    public User getUserByCnic(String cnic) throws Exception {
        logger.info("Verifying User by CNIC ");
        String query = "SELECT * FROM retail_app_schema.user WHERE cnic = ? ";
        conn = ConnectionManager.getDbCon();
        PreparedStatement ps = conn.insertUsingPreparedStatement(query);
        ps.setString(1, cnic);
        ResultSet rs = conn.executeQueryUsingPrepStatement(ps);
        User user = new User();
        if (rs.next()) {
            if (rs.getString("cnic") != null && rs.getString("cnic").equals(cnic)) {
                user.setUserId(rs.getInt("user_ID"));
                user.setUserName(rs.getString("name"));
                user.setUserCnic(rs.getString("cnic"));
                user.setUserEmail(rs.getString("email"));
            }
        }
        return user;
    }

    public int updateUser(int option, String input, User user) throws Exception {
        conn = ConnectionManager.getDbCon();
        String query = "";
        int result = 0;
        switch (option) {
            case 1:
                logger.info("Updating User By Name ");
                query = "UPDATE retail_app_schema.user SET name = ? WHERE email = ? ";
                PreparedStatement ps1 = conn.insertUsingPreparedStatement(query);
                ps1.setString(1, input);
                ps1.setString(2, user.getUserEmail());
                result = conn.executePrepStatement(ps1);
                break;
            case 2:
                logger.info("Updating User By CNIC ");
                query = "UPDATE retail_app_schema.user SET cnic = ? WHERE email = ? ";
                PreparedStatement ps2 = conn.insertUsingPreparedStatement(query);
                ps2.setString(1, input);
                ps2.setString(2, user.getUserEmail());
                result = conn.executePrepStatement(ps2);
                break;
            case 3:
                logger.info("Updating User By Email ");
                query = "UPDATE retail_app_schema.user SET email = ? WHERE email = ? ";
                PreparedStatement ps3 = conn.insertUsingPreparedStatement(query);
                ps3.setString(1, input);
                ps3.setString(2, user.getUserEmail());
                result = conn.executePrepStatement(ps3);
                break;
        }
        return result;
    }

    public int deleteUser(boolean bool, String userInput) throws Exception {
        logger.info("deleting User from Database");
        int result;
        if (bool) {
            String query = "DELETE FROM retail_app_schema.user WHERE email = ?";
            conn = ConnectionManager.getDbCon();
            PreparedStatement ps = conn.insertUsingPreparedStatement(query);
            ps.setString(1, userInput);
            result = conn.executePrepStatement(ps);

        } else {
            String query = "DELETE FROM retail_app_schema.user WHERE cnic = ? ";
            conn = ConnectionManager.getDbCon();
            PreparedStatement ps = conn.insertUsingPreparedStatement(query);
            ps.setString(1, userInput);
            result = conn.executePrepStatement(ps);
        }
        return result;
    }
}
