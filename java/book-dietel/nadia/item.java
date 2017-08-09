import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Scanner;

public class item {
    Scanner in = new Scanner(System.in);
    private int itemId = 3;

    public void item_Detail()throws Exception{
        myConnection conn = myConnection.getDbCon();
        String selectQuery = "SELECT itemName, itemPrice,itemcode FROM retail_schema.item ";
        ResultSet rs=conn.query(selectQuery);
        ResultSetMetaData metaData = rs.getMetaData();
        int numberOfColumns = metaData.getColumnCount();

        System.out.println( "Items Details:\n" );
        for ( int i=1; i <= numberOfColumns; i++ )
            System.out.printf( "%-8s\t\t", metaData.getColumnName(i));
        System.out.println();
        while (rs.next()) {
            for (int i = 1; i <= numberOfColumns; i++)
                System.out.printf("%-8s\t\t", rs.getObject(i));
            System.out.println();
        }
    }

    public void insetNewItemDetail()throws Exception{
        itemId++;
        System.out.println("Enter item name:");
        String itemName = in.next();
        System.out.println("Enter item Price");
        int itemPrice = in.nextInt();
        System.out.println("Enter item Code");
        int itemCode = in.nextInt();
        intestItem(itemId,itemName,itemPrice,itemCode);
    }
    public void intestItem(int itemId, String itemName,int itemPrice,int itemCode )throws Exception{
        myConnection conn = myConnection.getDbCon();
        String ins_query = "INSERT INTO retail_schema.item VALUES(?,?,?,?) ";

        PreparedStatement pst = conn.insertUsingPrepStatment(ins_query);
        pst.setInt(1,itemId);
        pst.setString(2,itemName);
        pst.setInt(3,itemPrice);
        pst.setInt(4,itemCode);
        conn.queryexecution(pst);
    }
}
