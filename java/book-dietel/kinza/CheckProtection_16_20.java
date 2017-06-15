import java.util.Scanner;

public class CheckProtection_16_20 {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in );

        StringBuilder builder = new StringBuilder ( 9 );

        System.out.println ("Enter max 9 digit amount for check: " );
        String amount = input.next ();

        StringBuilder builder1 = new StringBuilder ( amount );

        int length = builder1.length ();
        int count = 9 - length;

        for( int i = 0; i < count; i++ ){
            System.out.print ("*" );
        }
        System.out.println ( amount );
    }
}
