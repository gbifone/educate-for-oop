package Manager;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class ItemManager {
    ConnectionManager conn = null;

    public void addItem(){

    }

    public void updateItem(){

    }

    public void searchItem(){

    }

    public void deleteItem(){

    }

    public void getAllItems() throws Exception {
        conn = ConnectionManager.getDbCon();
        String query = "SELECT * FROM retail_app_schema.item ";

        ResultSet resultSet = conn.query( query );

        ResultSetMetaData metaData = resultSet.getMetaData();
        int numberOfColumns = metaData.getColumnCount();
        System.out.println( "List of all items:\n" );
        for ( int i=1; i <= numberOfColumns; i++ )
            System.out.printf( "%-8s\t", metaData.getColumnCount());
        System.out.println();

        while (resultSet.next()) {
            for ( int i=1; i <= numberOfColumns; i++ )
                System.out.printf( "%-8s\t", resultSet.getObject(i));
            System.out.println();
        }
    }
}
