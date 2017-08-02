import java.sql.*;
import java.util.*;

public class EmployeeDatabaseTest {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner( System.in );

        System.out.println("Enter Social Security Number: ");
        String ssn = input.next();
        System.out.println("Enter First Name: ");
        String fname = input.next();
        System.out.println("Enter Last Name: ");
        String lname = input.next();
        System.out.println("Enter Birthday: ");
        String bday = input.next();
        System.out.println("Enter Employee Type: ");
        String empType = input.next();
        System.out.println("Enter Department: ");
        String depName = input.next();

        String url = "jdbc:mysql://localhost:3306?autoReconnect=true&useSSL=false";
        String uName = "root";
        String pass = "admin1122";
        String query = "INSERT INTO employee_schema.employee VALUES (?,?,?,?,?,?)";

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, uName, pass );
        PreparedStatement ps = connection.prepareStatement( query );

        ps.setString(1, ssn);
        ps.setString(2, fname);
        ps.setString(3, lname);
        ps.setDate(4, java.sql.Date.valueOf(bday));
        ps.setString(5, empType);
        ps.setString(6, depName);
        ps.executeUpdate();

        if( empType.equals("salariedEmployee")){

            System.out.println("Enter Info. For SalariedEmployee: ");

            System.out.println("Enter Social Security Number again: ");
            String ssn1 = input.next();
            System.out.println("Enter weekly salary: ");
            int weeklySalary = input.nextInt();
            System.out.println("Enter bonus: ");
            float bonus = input.nextFloat();

            String query1 = "INSERT INTO employee_schema.salariedemployees VALUES (?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query1);
            preparedStatement.setString(1, ssn1);
            preparedStatement.setInt(2, weeklySalary);
            preparedStatement.setFloat(3, bonus);
            preparedStatement.executeUpdate();

        } else if ( empType.equals("hourlyEmployee")){

            System.out.println("Enter Social Security Number again: ");
            String ssn1 = input.next();
            System.out.println("Enter hours: ");
            int hours = input.nextInt();
            System.out.println("Enter hourly salary: ");
            int wages = input.nextInt();
            System.out.println("Enter bonus: ");
            float bonus = input.nextFloat();

            String query1 = "INSERT INTO employee_schema.hourlyemployees VALUES (?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query1);
            preparedStatement.setString(1, ssn1);
            preparedStatement.setInt(2, hours);
            preparedStatement.setInt(3, wages);
            preparedStatement.setFloat(4, bonus);
            preparedStatement.executeUpdate();

        } else if ( empType.equals("commissionEmployee")){

            System.out.println("Enter Social Security Number again: ");
            String ssn1 = input.next();
            System.out.println("Enter Gross Sales: ");
            int grossSales = input.nextInt();
            System.out.println("Enter Commission Rate: ");
            float commissionRate = input.nextFloat();
            System.out.println("Enter bonus: ");
            float bonus = input.nextFloat();

            String query1 = "INSERT INTO employee_schema.commissionemployees VALUES (?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query1);
            preparedStatement.setString(1, ssn1);
            preparedStatement.setInt(2, grossSales);
            preparedStatement.setFloat(3, commissionRate);
            preparedStatement.setFloat(4, bonus);
            preparedStatement.executeUpdate();

        } else if( empType.equals("basePlusCommissionEmployee")){

            System.out.println("Enter Social Security Number again: ");
            String ssn1 = input.next();
            System.out.println("Enter Gross Sales: ");
            int grossSales = input.nextInt();
            System.out.println("Enter Commission Rate: ");
            float commissionRate = input.nextFloat();
            System.out.println("Enter bonus: ");
            float bonus = input.nextFloat();
            System.out.println("Enter Base Salary: ");
            int baseSalary = input.nextInt();

            String query1 = "INSERT INTO employee_schema.basepluscommissionemployees VALUES (?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query1);
            preparedStatement.setString(1, ssn1);
            preparedStatement.setInt(2, grossSales);
            preparedStatement.setFloat(3, commissionRate);
            preparedStatement.setFloat(4, bonus);
            preparedStatement.setInt(5, baseSalary);
            preparedStatement.executeUpdate();

        }

        ps.close();
        connection.close();
    }
}
