
public class BasePlusCommissionEmployeeTest {
        public static void main(String[] args) {
            BasePlusCommissionEmployee employee = new BasePlusCommissionEmployee("Ali","Ashraf",
                    "333-33-333",5000,.04,300);
            System.out.println(  "Employee information obtained by get methods: \n" );
            System.out.printf( "%s %s\n", "First name is",
                    employee.getFirstName());
            System.out.printf( "%s %s\n", "Last name is",
                    employee.getLastName());
            System.out.printf( "%s %s\n", "Social security number is",
                    employee.getSocialSecurityNumber());
            System.out.printf( "%s %.2f\n", "Gross sales is",
                    employee.getGrossSales());
            System.out.printf( "%s %.2f\n", "Commission rate is",
                    employee.getCommissionRate());
            employee.setBaseSalary(1000);
            System.out.printf("\n%s:\n\n%s\n",
                    "Update employee information obtained by toString",employee);
        }
    }
