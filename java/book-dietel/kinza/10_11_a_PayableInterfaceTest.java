public class PayableInterfaceTest_10_11 {
    public static void main ( String[] args ) {
        Payable[] payableObjects = new Payable[ 6 ];

        payableObjects [ 0 ] = new Invoice ( "01234", "seat", 2, 375.00 );
        payableObjects [ 1 ] = new Invoice ( "56789", "tire", 4, 79.95 );
        payableObjects [ 2 ] = new SalariedEmployee (  "John", "Smith", "111-11-1111", 800.00  );
        payableObjects [ 3 ] = new HourlyEmployee ( "Lisa", "Barnes", "888-88-8888", 12.00, 39);
        payableObjects [ 4 ] = new CommissionEmployee ( "Sue", "Jones", "333-33-3333",  10000, .06 );
        payableObjects [ 5 ] = new BasePlusCommissionEmployee ( "Bob", "Lewis", "444-44-4444",5000, .04, 300 );

        System.out.println( "Invoices and Employees processed polymorphically:\n" );

        for ( Payable currentPayable : payableObjects ){
            System.out.printf( currentPayable.toString ());
            if ( currentPayable instanceof BasePlusCommissionEmployee ) {
                BasePlusCommissionEmployee employee = ( BasePlusCommissionEmployee ) currentPayable;

                employee.setBaseSalary ( 1.10 * employee.getBaseSalary ( ) );

                System.out.printf ( "new base salary with 10%% increase is: $%,.2f\n", employee.getBaseSalary ( ) );
            }
            System.out.printf( "earned $%,.2f\n\n", currentPayable.getPaymentAmount () );
        }
    }
}
