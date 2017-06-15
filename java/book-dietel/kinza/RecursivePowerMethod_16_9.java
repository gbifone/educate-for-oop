import java.util.Scanner;

public class RecursivePowerMethod_16_9 {
    public static void main ( String[] args ) {
        Scanner in = new Scanner ( System.in );

        System.out.println ("Enter base: " );
        int base = in.nextInt ();
        System.out.println ("Enter exponent: " );
        int exponent = in.nextInt ();

        System.out.printf ( "Base: %d and Exponent: %d = %d", base, exponent, power ( base, exponent ) );
    }

    public static int power( int b, int e ){
        if ( e == 1 ){
            return b;
        }
        else {
            return b * power ( b, e - 1 );
        }
    }
}
