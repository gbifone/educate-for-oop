import java.util.Calendar;

public class PayRollEmployees_10_8 {
    public static void main ( String[] args ) {

        Date birthDate  = new Date ( 6, 5, 1972 );
        Date birthDate1 = new Date ( 7,6,2017 );
        Date birthDate2 = new Date ( 6, 21,1974 );
        Date birthDate3 = new Date ( 8, 2 ,1975 );
        Date birthDate4 = new Date ( 11, 2 ,1975 );

        Calendar c            = Calendar.getInstance ( );
        int          currentMonth = c.get(Calendar.MONTH) + 1;

        Employee           salariedEmployee           = new SalariedEmployee ( "John", "Smith", "111-11-1111", birthDate  , 800.00 );
        Employee             hourlyEmployee             = new HourlyEmployee ( "Karen", "Price", "222-22-2222", birthDate1, 16.75,  40 );
        Employee         commissionEmployee         = new CommissionEmployee ( "Sue", "Jones", "333-33-3333", birthDate2, 10000, .06 );
        Employee basePlusCommissionEmployee = new BasePlusCommissionEmployee ( "Bob", "Lewis", "444-44-4444", birthDate3, 5000, .04, 300 );
        Employee                pieceWorker                = new PieceWorker("James", "Stanly", "555-55-5555", birthDate4, 30.17, 100);

        System.out.println ( "Employees processed individually:\n" );
        System.out.printf ( "%s\n%s: $%,.2f\n\n", salariedEmployee, "earned", salariedEmployee.earnings ( ) );
        System.out.printf ( "%s\n%s: $%,.2f\n\n", hourlyEmployee, "earned", hourlyEmployee.earnings ( ) );
        System.out.printf ( "%s\n%s: $%,.2f\n\n", commissionEmployee, "earned", commissionEmployee.earnings ( ) );
        System.out.printf ( "%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings ( ) );
        System.out.printf ( "%s\n%s: $%,.2f\n\n", pieceWorker, "earned", pieceWorker.earnings ( ) );

        Employee[] employees = new Employee[ 5 ];

        employees[ 0 ] = salariedEmployee;
        employees[ 1 ] = hourlyEmployee;
        employees[ 2 ] = commissionEmployee;
        employees[ 3 ] = basePlusCommissionEmployee;
        employees[ 4 ] = pieceWorker;

        System.out.println ( "Employees processed polymorphically:\n" );

        for ( Employee currentEmployee : employees ) {
            System.out.println ( currentEmployee );
            if ( currentEmployee instanceof BasePlusCommissionEmployee ) {
                BasePlusCommissionEmployee employee = ( BasePlusCommissionEmployee ) currentEmployee;

                employee.setBaseSalary ( 1.10 * employee.getBaseSalary ( ) );

                System.out.printf ( "new base salary with 10%% increase is: $%,.2f\n", employee.getBaseSalary ( ) );
            }
            if( currentEmployee.getBirthDay ().getMonth () == currentMonth ){
                System.out.printf ( "earned $%,.2f with 10%% bonus \n\n", ( currentEmployee.earnings ( ) + 100 ) );
            } else {
                System.out.printf ( "earned $%,.2f\n\n", currentEmployee.earnings ( ) );
            }
        }
    }
}
