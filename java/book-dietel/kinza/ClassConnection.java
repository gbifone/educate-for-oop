import java.sql.*;
import java.sql.DriverManager;

public final class ClassConnection {
    public Connection conn;
    private Statement statement;
    private PreparedStatement preparedStatement;
    public static ClassConnection db;
    private ClassConnection () {
        String url= "jdbc:mysql://localhost:3306?autoReconnect=true&useSSL=false";
        String dbName = "Retail_Application";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String password = "admin1122";
        try {
            Class.forName(driver).newInstance();
            this.conn = (Connection)DriverManager.getConnection(url, userName, password);
        }catch (Exception sqle) {
            sqle.printStackTrace();
        }
    }

    public static synchronized ClassConnection getDbCon() {
        if ( db == null ) {
            db = new ClassConnection();
        }
        return db;
    }

    public ResultSet query(String query) throws SQLException{
        statement = db.conn.createStatement();
        ResultSet res = statement.executeQuery(query);
        return res;
    }

    public int insert(String insertQuery) throws SQLException {
        statement = db.conn.createStatement();
        int result = statement.executeUpdate(insertQuery);
        return result;

    }
    public PreparedStatement insert_Using_PreparedStatement(String insertQuery) throws SQLException {
        PreparedStatement preparedStatement = db.conn.prepareStatement(insertQuery);
        return preparedStatement;
    }

    public void execute_PreperedStatement(PreparedStatement ps) throws Exception {
        ps.executeUpdate();
        ps.close();
        conn.close();
    }
}
