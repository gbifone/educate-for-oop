import java.util.InputMismatchException;
import java.util.Scanner;

public class OrderOfCatchBlocks_11_19 {
    public static int quotient ( int numerator, int denominator ){
        return numerator / denominator ;
    }

    public static void main ( String[] args ) {
        Scanner in           = new Scanner ( System.in );
        boolean continueLoop = true;

        do {
            try {
                int numerator = in.nextInt ();
                System.out.println ("Please enter an integer: " );
                int denominator = in.nextInt ();

                int result = quotient ( numerator, denominator );

                System.out.printf ( "\nResult: %d / %d = %d ", numerator, denominator , result );
                continueLoop = false;
            }catch (InputMismatchException inputMismatchException ){
                System.err.printf( "\nException: %s\n", inputMismatchException );
                in.nextLine();
                System.out.println( "You must enter integers. Please try again.\n" );
            }
            catch (ArithmeticException arithmeticException  ){
                System.err.printf( "\nException: %s\n", arithmeticException );
                System.out.println( "Zero is an invalid denominator. Please try again.\n" );
            }
        } while ( continueLoop );
    }
}
