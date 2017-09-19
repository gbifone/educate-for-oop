package Manager;

import java.sql.*;
import org.apache.log4j.Logger;

public final class ConnectionManager {
    private   final Logger log = Logger.getLogger(this.getClass());
    public Connection connection;
    private Statement statement;
    private PreparedStatement prepst;
    public static ConnectionManager db;

    public ConnectionManager() {
        log.info("Creating Database connection");
        String url = "jdbc:mysql://localhost:3306/?autoReconnect=true&useSSL=false";
        String dbName = "Retail_Application";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "admin1122";
        try {
            Class.forName(driver).newInstance();
            this.connection = DriverManager.getConnection(url, userName, password);
        } catch (Exception sqle) {
            sqle.printStackTrace();
        }
    }

    public static synchronized ConnectionManager getDbCon() {
        try {
            if (db == null) {
                db = new ConnectionManager();
            }
        } catch (Exception ex){
            System.err.println("Database connection Failed");
        }
        return db;
    }

        // used to select data from Database
    public ResultSet query(String query) throws SQLException {
        statement = db.connection.createStatement();
        ResultSet res = statement.executeQuery(query);
        return res;
    }

        //used to count total number of rows in Dtabase
    public int idCount(String query) throws SQLException {
        statement = db.connection.createStatement();
        ResultSet res = statement.executeQuery(query);
        res.next();
        int count = res.getInt("rowcount");
        res.close();
        return count;
    }

        // used to manually insert data in Database
    public int insert(String insertQuery) throws SQLException {
        statement = db.connection.createStatement();
        int result = statement.executeUpdate(insertQuery);
        return result;
    }

        //used to create object of prepared Statement
    public PreparedStatement insertUsingPrepStatement(String insertQuery) throws SQLException {
        PreparedStatement pst = db.connection.prepareStatement(insertQuery);
        return pst;
    }

        //used pst object to select from Database
    public ResultSet queryExecution(PreparedStatement pst) throws Exception {
        ResultSet rs = pst.executeQuery();
        return rs;
    }

        //used pst object to insert data in Database
    public int queryExecutionUsingPrepStat(PreparedStatement pst) throws Exception {
        return pst.executeUpdate();
    }

    public void closeConnection() throws Exception {
        statement.close();
        connection.close();
    }
}