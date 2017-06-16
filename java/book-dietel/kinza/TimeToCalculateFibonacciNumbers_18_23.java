import java.math.BigInteger;

public class TimeToCalculateFibonacciNumbers_18_23 {
        private static BigInteger TWO = BigInteger.valueOf ( 2 );

    public static void main ( String[] args ) {
        int count = 0;
        long startTime = System.currentTimeMillis();
        for ( int counter = 0; counter <= 40; counter++ ) {
            System.out.printf ( "Fibonacci of %d is: %d\n", counter, fibonacci ( BigInteger.valueOf ( counter ) ) );
            count++;
        }
        long endTime = System.currentTimeMillis();
        long timeRequired = endTime - startTime;
        System.out.println ( "Time required to perform calculation is: " + timeRequired + " milliseconds" );
        System.out.println ( "Number of calls made to method fibonacci is: " + count );
    }

    public static BigInteger fibonacci( BigInteger number ) {
        if(number.equals ( BigInteger.ZERO ) || number.equals ( BigInteger.ONE )){
            return number;
        } else {
            return fibonacci ( number.subtract ( BigInteger.ONE ) ).add ( fibonacci ( number.subtract ( TWO ) ) ) ;
        }
    }
}
