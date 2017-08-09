import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class login {
    Scanner in = new Scanner(System.in);
    private int coustomerid = 0;

    public void login_Detail() throws Exception {
        coustomerid++;
        System.out.println("Enter userid");
        String userid = in.next();
        System.out.println("Enter password");
        String password = in.next();
        login_user(coustomerid,userid,password);
    }
    public void login_user(int coustomerid,String userid, String password)throws Exception{
        myConnection conn = myConnection.getDbCon();
        String ins_query = "INSERT INTO retail_schema.login VALUES(?,?,?) ";
        PreparedStatement pst = conn.insertUsingPrepStatment(ins_query);

        pst.setInt(1,coustomerid);
        pst.setString(2,userid);
        pst.setString(3,password);
        conn.queryexecution(pst);
    }
}
