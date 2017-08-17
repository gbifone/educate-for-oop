package Manager;

import java.sql.*;
import java.sql.DriverManager;

public final class ConnectionManager {
    public Connection conn;
    private Statement statement;
    private PreparedStatement preparedStatement;
    public static ConnectionManager db;
    private ConnectionManager () {
        String url= "jdbc:mysql://localhost:3306?autoReconnect=true&useSSL=false";
        String dbName = "Retail_Application";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "admin1122";
        try {
            Class.forName(driver).newInstance();
            this.conn = (Connection)DriverManager.getConnection(url, userName, password);
        } catch (Exception sqle) {
            sqle.printStackTrace();
        }
    }

    public static synchronized ConnectionManager getDbCon() {
        if ( db == null ) {
            db = new ConnectionManager();
        }
        return db;
    }

    public ResultSet query(String query) throws SQLException{
        statement = db.conn.createStatement();
        ResultSet res = statement.executeQuery(query);
        return res;
    }

    public int regId(String query) throws SQLException{
        statement = db.conn.createStatement();
        ResultSet res = statement.executeQuery(query);
        Integer reg = (Integer) res.getObject("firstName");
        return reg;
    }

    public int idCount(String query) throws SQLException{
        statement = db.conn.createStatement();
        ResultSet res = statement.executeQuery(query);
        res.next();
        int count = res.getInt("rowcount");
        return count;
    }

    public int insert(String insertQuery) throws SQLException {
        statement = db.conn.createStatement();
        int result = statement.executeUpdate(insertQuery);
        return result;

    }
    public PreparedStatement insertUsingPreparedStatement(String insertQuery) throws SQLException {
        PreparedStatement preparedStatement = db.conn.prepareStatement(insertQuery);
        return preparedStatement;
    }

    public void executePreparedStatement(PreparedStatement ps) throws Exception {
        ps.executeUpdate();
            }
}
