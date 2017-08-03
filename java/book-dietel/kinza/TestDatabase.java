import java.sql.*;

public class TestDatabase {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306?autoReconnect=true&useSSL=false";
        String uname = "root";
        String pass = "admin1122";
        String query = "SELECT * FROM books_schema.developers_record";
        Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        ResultSetMetaData metaData = rs.getMetaData();

        int numOfColumn = metaData.getColumnCount();

        for(int i = 1; i <= numOfColumn; i++ ){
            System.out.printf("%-10s\t", metaData.getColumnName(i));
        }
        System.out.println();

        while ( rs.next() ){
            for (int j = 1; j <= numOfColumn; j++ ){
                System.out.printf("%10s\t", rs.getObject(j));
            }
            System.out.println();
        }
        rs.close();;
        st.close();
        con.close();
    }
}
