import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

//@Configuration
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
//@Profile ("client_app_profile_name")
public class Database {
    static final String DATABASE_URL = "jdbc:mysql://localhost:3306?autoReconnect=true&useSSL=false";

    public static void main(String[] args) throws Exception {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection( DATABASE_URL, "root", "admin1122" );
            statement = connection.createStatement();
            resultSet = statement.executeQuery( "SELECT Author_ID, FirstName, LastName FROM books_schema.authors" );
            ResultSetMetaData metaData = resultSet.getMetaData();
            int numberOfColumns = metaData.getColumnCount();

            System.out.println( "Authors Table of Books Database:\n" );
            for ( int i=1; i <= numberOfColumns; i++ )
                System.out.printf( "%-8s\t", metaData.getColumnName(i));
            System.out.println();
            while (resultSet.next()){
                for ( int i=1; i <= numberOfColumns; i++ )
                    System.out.printf( "%-8s\t", resultSet.getObject(i) );
                System.out.println();
            }


                resultSet.close();
                statement.close();
                connection.close();


    }
}
