package Manager;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class Item_Manager {
    Connection_Manager con = null;
    public void addItem(){

    }

    public void updateItem(){

    }

    public void getItem(){

    }

    public void deleteItem(){

    }

    public void getAllItem()throws Exception {
        con = Connection_Manager.getDbCon();
        String query = "SELECT * FROM retail_schema.item";
        ResultSet rs = con.query(query);
        ResultSetMetaData metaData = rs.getMetaData();
        int numberOfColumns = metaData.getColumnCount();

        System.out.println("*********************");
        System.out.println("  List of All Items ");
        System.out.println("*********************\n");
        for (int i = 1; i <= numberOfColumns; i++)
            System.out.printf("%-8s\t", metaData.getColumnName(i));
        System.out.println();
        while (rs.next()) {
            for (int i = 1; i <= numberOfColumns; i++)
                System.out.printf("%-8s\t", rs.getObject(i));
            System.out.println();

        }
    }
}

