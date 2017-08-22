package Manager;

import java.sql.*;

public final class ConnectionManager {
    public Connection conn;
    private Statement statement;
    public static ConnectionManager db;

    public ConnectionManager() {
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
        if (db == null) {
            db = new ConnectionManager();
        }
        return db;
    }

    // use to select data from database
    public ResultSet query( String query ) throws SQLException {
        statement = db.conn.createStatement();
        ResultSet res = statement.executeQuery(query);
        return res;
    }

    // use to count total number of rows in database
    public int idCount( String query ) throws SQLException {
        statement = db.conn.createStatement();
        ResultSet res = statement.executeQuery(query);
        res.next();
        int count = res.getInt("rowcount");
        return count;
    }

    // use to manualy insert data in database
    public int insert( String insertQuery ) throws SQLException {
        statement = db.conn.createStatement();
        int result = statement.executeUpdate(insertQuery);
        return result;

    }

    // use to create object of prepared statement
    public PreparedStatement insertUsingPreparedStatement( String insertQuery ) throws SQLException {
        PreparedStatement preparedStatement = db.conn.prepareStatement(insertQuery);
        return preparedStatement;
    }

    // use pst object to insert data in database
    public void executePreparedStatement( PreparedStatement ps ) throws Exception {
        ps.executeUpdate();
    }

    // use pst object to select data from database
    public ResultSet executeQueryUsingPrepStatement( PreparedStatement ps ) throws SQLException {
        ResultSet rs = ps.executeQuery();
        return rs;
    }
}
