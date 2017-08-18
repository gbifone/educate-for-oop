package Manager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;


public class User_Manager {
    Scanner in = new Scanner(System.in);
    Connection_Manager con = null;

    public int userId()throws Exception{
        con = Connection_Manager.getDbCon();
        String query = "Select COUNT(*) AS rowcount FROM retail_schema.user";
        int id = con.idCount(query);
        return id;
    }

    public void addUser()throws Exception{
        System.out.println("Enter your Name:");
        String name = in.nextLine();
        System.out.println("Enter your CNIC:");
        String CNIC = in.next();
        System.out.println("Enter your Email:");
        String email = in.next();

        int userId = userId();
        userId++;
        con = Connection_Manager.getDbCon();
        String query = "INSERT INTO retail_schema.user VALUES (? , ? , ? , ?)";
        PreparedStatement ps = con.insertUsingPrepStatment(query);
        ps.setInt(1,userId);
        ps.setString(2,name);
        ps.setString(3,CNIC);
        ps.setString(4,email);
        con.queryExecution(ps);
    }

    public void updateUser(){

    }

    public ResultSet getUser(String email)throws Exception{
        String query = "SELECT Email FROM  retail_schema.user WHERE Email = ? ";
        con = Connection_Manager.getDbCon();
        PreparedStatement ps = con.insertUsingPrepStatment(query);
        ps.setString(1, email);
        ResultSet rs = con.queryExecution(ps);
        return rs;

    }

    public void deleteUser(){

    }
}
