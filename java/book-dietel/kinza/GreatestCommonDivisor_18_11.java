import java.util.Scanner;

public class GreatestCommonDivisor_18_11 {
    public static void main ( String[] args ) {
        Scanner in = new Scanner ( System.in );

        System.out.println ("Enter first value: " );
        int x = in.nextInt ();
        System.out.println ("Enter second value: " );
        int y = in.nextInt ();
        int gcd = gcd ( x, y );

        System.out.printf ("gcd of "+ y +" and "+x+" = " + gcd );
    }

    public static int gcd( int x, int y ){
        if( y == 0 ){
            return x;
        } else {
            return gcd ( y, x%y );
        }
    }
}
