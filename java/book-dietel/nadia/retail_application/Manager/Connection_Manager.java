package Manager;

import java.sql.*;

public final class Connection_Manager  {

        public Connection connection;
        private Statement statement;
        private PreparedStatement prepst;
        public static  Connection_Manager db;

        public Connection_Manager() {
                String url = "jdbc:mysql://localhost:3306/?autoReconnect=true&useSSL=false";
                String dbName = "Retail_Application";
                String driver = "com.mysql.jdbc.Driver";
                String userName = "root";
                String password = "admin1122";
                try {
                        Class.forName(driver).newInstance();
                        this.connection = DriverManager.getConnection(url,userName, password);
                }
                catch (Exception sqle){
                        sqle.printStackTrace();
                }
        }
        public static synchronized Connection_Manager getDbCon() {
                if ( db == null ) {
                        db = new Connection_Manager();
                }
                return db;

        }
        public ResultSet query(String query) throws SQLException {
                statement = db.connection.createStatement();
                ResultSet res = statement.executeQuery(query);
                return res;
        }
        public int idCount(String query) throws SQLException {
                statement = db.connection.createStatement();
                ResultSet res = statement.executeQuery(query);
                res.next();
                int count = res.getInt("rowcount");
                res.close();
                return count;
        }

        public int insert(String insertQuery) throws SQLException {
                statement = db.connection.createStatement();
                int result = statement.executeUpdate(insertQuery);
                return result;

        }
        public PreparedStatement insertUsingPrepStatment(String insertQuery) throws SQLException {
                PreparedStatement pst = db.connection.prepareStatement(insertQuery);
                return pst;
        }
        public void queryexecution(PreparedStatement pst)throws Exception{
                pst.executeUpdate();
                //pst.close();
                //connection.close();
        }
}