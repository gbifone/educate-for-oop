import java.sql.*;
import java.util.Scanner;

public class Registration_Form {
        Scanner in = new Scanner(System.in);
        int userid = 1;
        public Registration_Form() throws SQLException {
        }
        public void personal_Detail()throws Exception{
            userid++;
            System.out.println("Enter FirstName:");
            String fname = in.next();
            System.out.println("Enter LastName:");
            String lname = in.next();
            System.out.println("Enter PhoneNo:");
            String phoneNo = in.next();
            System.out.println("Enter Address:");
            String address = in.next();
            System.out.println("Enter email:");
            String email = in.next();
            System.out.println("Enter BankName:");
            String bankName = in.next();
            System.out.println("Enter AccountNo:");
            String accountNo = in.next();
            register_User(userid,fname,lname,phoneNo,address,email,bankName,accountNo);
        }

        public void register_User (int userid,String fname,String lname,String phoneNo,String address,
                                   String email,String bankName,String accountNo) throws Exception{
            myConnection conn = myConnection.getDbCon();
            String ins_query = "INSERT INTO retail_schema.registration VALUES(?,?,?,?,?,?,?,?) ";

            PreparedStatement pst = conn.insertUsingPrepStatment(ins_query);
            pst.setInt(1,userid);
            pst.setString(2,fname);
            pst.setString(3,lname);
            pst.setString(4,phoneNo);
            pst.setString(5,address);
            pst.setString(6,bankName);
            pst.setString(7,accountNo);
            pst.setString(8,email);
            conn.queryexecution(pst);


        }
}