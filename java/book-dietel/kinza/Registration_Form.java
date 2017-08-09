import com.mysql.jdbc.*;

import java.security.PublicKey;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Registration_Form {
    Scanner input = new Scanner(System.in );
    int user_id = 1;

    public Registration_Form() throws SQLException {
    }

    public void personal_Details() throws Exception {
        user_id++;
        System.out.println("Enter First Name: ");
        String firstName = input.nextLine();
        System.out.println("Enter Last Name: ");
        String lastName = input.nextLine();
        System.out.println("Enter Phone no.: ");
        String phoneNo = input.nextLine();
        System.out.println("Enter Address: ");
        String address = input.nextLine();
        System.out.println("Enter Bank Name: ");
        String bankName = input.nextLine();
        System.out.println("Enter Bank Account Number: ");
        String bankAccountNo = input.nextLine();
        register_User(user_id, firstName, lastName, phoneNo, address, bankName, bankAccountNo);

    }

    public void register_User(int user_id, String firstName, String lastName, String phoneNo, String address, String bankName,
                              String bankAccountNo) throws Exception {
         ClassConnection conn = ClassConnection.getDbCon();
         PreparedStatement ps = null;

        String reg_Query = "INSERT INTO retail_app_schema.registration_form VALUES ( ?, ?, ?, ?, ?, ?)";

        conn.insert_Using_PreparedStatement(reg_Query);

        ps.setInt   (1, user_id);
        ps.setString(2, firstName);
        ps.setString(3, lastName);
        ps.setString(4, phoneNo);
        ps.setString(5, address);
        ps.setString(6, bankName);
        ps.setString(7, bankAccountNo);

        conn.execute_PreperedStatement( ps );


    }
}
