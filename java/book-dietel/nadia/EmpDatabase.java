import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class EmpDatabase {
        public static void main(String[] args) throws Exception {
            Scanner obj = new Scanner(System.in);
        System.out.println("Enter SocialSecurityNumber:");
        int ssn = obj.nextInt();
        System.out.println("Enter employee FirstName");
        String fname = obj.next();
        System.out.println("Enter employee LastName");
        String lname = obj.next();
        System.out.println("Enter employee Date");
        String date = obj.next();
        System.out.println("Enter employee Type");
        String empType = obj.next();
        System.out.println("Enter employee DepartmentName");
        String deprtName = obj.next();
           /* int ssn = 1;
            String fname = "Nadia";
            String lname = "Gull";
            //Date date = 12-10-2017;
            String empType = "salariedemployees";
            String deprtName = "IT";*/

            String url = "jdbc:mysql://localhost:3306?autoReconnect=true&useSSL=false";
            String uname = "root";
            String passWord = "admin1122";
            String query = "INSERT INTO emp_schema.employees VALUES (?,?,?,?,?,?)";

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,passWord);
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1,ssn);
            pst.setString(2,fname);
            pst.setString(3,lname);
            pst.setDate(4,java.sql.Date.valueOf(date));
            pst.setString(5,empType);
            pst.setString(6,deprtName);
            pst.executeUpdate();

            if(empType.equals("salariedemployees")){
                System.out.println("Enter SocialSecurityNumber again:");
                int ssn1 = obj.nextInt();
                System.out.println("Enter employee WeeklySalary");
                int weeklySalary = obj.nextInt();
                System.out.println("Enter employee Bonas");
                float bonas = obj.nextFloat();

                String query1 = "INSERT INTO emp_schema.salariedemployees VALUES (?,?,?)";
                PreparedStatement ps = con.prepareStatement(query1);
                ps.setInt(1,ssn1);
                ps.setInt(2,weeklySalary);
                ps.setFloat(3,bonas);
                ps.executeUpdate();
            }
            else if(empType.equals("hourlyemployees")){
                System.out.println("Enter SocialSecurityNumber again:");
                int ssn2 = obj.nextInt();
                System.out.println("Enter employee Hours");
                int hours = obj.nextInt();
                System.out.println("Enter employee Wage");
                int wage = obj.nextInt();
                System.out.println("Enter employee Bonas");
                float bonas = obj.nextFloat();

                String query2 = "INSERT INTO emp_schema.hourlyemployees VALUES (?,?,?,?)";
                PreparedStatement ps = con.prepareStatement(query2);
                ps.setInt(1,ssn2);
                ps.setInt(2,hours);
                ps.setInt(3,wage);
                ps.setFloat(4,bonas);
                ps.executeUpdate();
            }
            else if(empType.equals("commissionemployees")){
                System.out.println("Enter SocialSecurityNumber again:");
                int ssn3 = obj.nextInt();
                System.out.println("Enter employee GrossSales");
                int gSales = obj.nextInt();
                System.out.println("Enter employee CommissionRate");
                float commissionRate = obj.nextFloat();
                System.out.println("Enter employee Bonas");
                float bonas = obj.nextFloat();

                String query3 = "INSERT INTO emp_schema.commissionemployees VALUES (?,?,?,?)";
                PreparedStatement ps = con.prepareStatement(query3);
                ps.setInt(1,ssn3);
                ps.setInt(2,gSales);
                ps.setFloat(3,commissionRate);
                ps.setFloat(4,bonas);
                ps.executeUpdate();

            }
            else if(empType.equals( "basepluscommissionemployees")){
                System.out.println("Enter SocialSecurityNumber again:");
                int ssn4 = obj.nextInt();
                System.out.println("Enter employee GrossSales");
                int gSales1 = obj.nextInt();
                System.out.println("Enter employee CommissionRate");
                float commissionRate1 = obj.nextFloat();
                System.out.println("Enter employee BaseSalary");
                int baseSalary = obj.nextInt();
                System.out.println("Enter employee Bonas");
                float bonas = obj.nextFloat();

                String query4 = "INSERT INTO emp_schema.basepluscommissionemployees VALUES (?,?,?,?,?)";
                PreparedStatement ps = con.prepareStatement(query4);
                ps.setInt(1,ssn4);
                ps.setInt(2,gSales1);
                ps.setFloat(3,commissionRate1);
                ps.setInt(4,baseSalary);
                ps.setFloat(5,bonas);
                ps.executeUpdate();
                ps.close();
            }
            pst.close();
            con.close();
        }
    }