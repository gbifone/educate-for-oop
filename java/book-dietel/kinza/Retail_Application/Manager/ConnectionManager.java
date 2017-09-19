package Manager;

import java.sql.*;
import org.apache.log4j.Logger;

public final class ConnectionManager {
    private final Logger logger = Logger.getLogger(this.getClass());
    public Connection conn;
    private Statement statement;
    public static ConnectionManager db;

    public ConnectionManager() {
        logger.info("Creating connection with Database");
        String url = "jdbc:mysql://localhost:3306?autoReconnect=true&useSSL=false";
        String dbName = "Retail_Application";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "admin1122";
        try {
            Class.forName(driver).newInstance();
            this.conn = (Connection) DriverManager.getConnection(url, userName, password);
        } catch (Exception sqle) {
            sqle.printStackTrace();
        }
    }

    public static synchronized ConnectionManager getDbCon() {
        try {
            if (db == null) {
                db = new ConnectionManager();
            }
        } catch (Exception e ) {
            System.err.println(" Database connection failed !! ");
        }
        return db;
    }

    // used to select data from database
    public ResultSet query( String query ) throws SQLException {
        statement = db.conn.createStatement();
        ResultSet res = statement.executeQuery(query);
        return res;
    }

    // used to count total number of rows in database
    public int idCount( String query ) throws SQLException {
        statement = db.conn.createStatement();
        ResultSet res = statement.executeQuery(query);
        res.next();
        int count = res.getInt("rowcount");
        return count;
    }

    // used to manually insert data in database
    public int insert( String insertQuery ) throws SQLException {
        statement = db.conn.createStatement();
        int result = statement.executeUpdate(insertQuery);
        return result;

    }

    // used to create object of prepared statement to insert data
    public PreparedStatement insertUsingPreparedStatement( String insertQuery ) throws SQLException {
        PreparedStatement preparedStatement = db.conn.prepareStatement(insertQuery);
        return preparedStatement;
    }

    // used pst object to insert user data in database
    public void executePreparedStatement( PreparedStatement ps ) throws Exception {
        ps.executeUpdate();
    }

    // used pst object to insert data in database
    public int executePrepStatement( PreparedStatement ps ) throws Exception {
        return ps.executeUpdate();
    }

    // used pst object to select data from database
    public ResultSet executeQueryUsingPrepStatement( PreparedStatement ps ) throws SQLException {
        ResultSet rs = ps.executeQuery();
        return rs;
    }
}
