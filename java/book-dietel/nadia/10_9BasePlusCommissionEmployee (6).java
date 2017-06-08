import java.util.Calendar;

public class PayrollSystemTest {
    public static void main ( String[] args ) {
        Date date = new Date(10,29,1993);
        Date D = new Date(6,7,2017);

        Employee    salariedEmployee           = new SalariedEmployee ( "John", "Smith", "111-11-1111",date, 800.00 );
        Employee    hourlyEmployee             = new HourlyEmployee ( "Karen", "Price", "222-22-2222", D,16.75, 40 );
        Employee    commissionEmployee         = new CommissionEmployee ( "Sue", "Jones", "333-33-3333", date ,10000, .06 );
        Employee    basePlusCommissionEmployee = new BasePlusCommissionEmployee ( "Bob", "Lewis", "444-44-4444", D ,5000, .04, 300 );
        Employee    pieceWorker                = new PieceWorker("Ali","Naveed","876-08-333",D,100,500);

        System.out.println ( "Employees processed individually:\n" );
        System.out.printf ( "%s\n%s: $%,.2f\n\n", salariedEmployee, "earned", salariedEmployee.earnings ( ) );
        System.out.printf ( "%s\n%s: $%,.2f\n\n", hourlyEmployee, "earned", hourlyEmployee.earnings ( ) );
        System.out.printf ( "%s\n%s: $%,.2f\n\n", commissionEmployee, "earned", commissionEmployee.earnings ( ) );
        System.out.printf ( "%s\n%s: $%,.2f\n\n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings ( ) );
        System.out.printf( "%s\n%s: $%,.2f\n\n", pieceWorker ,"earned" ,pieceWorker.earnings());

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
            if (currentEmployee.getBirthDate().getMonth() == Calendar.getInstance().get(Calendar.MONTH)+1) {
                System.out.printf( "earned $%,.2f\n\n", currentEmployee.earnings ()  + 100.00);
            }else
                System.out.printf( "earned $%,.2f\n\n", currentEmployee.earnings () );
        }
    }
}

