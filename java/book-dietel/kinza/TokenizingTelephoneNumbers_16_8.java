import java.util.Scanner;

public class TokenizingTelephoneNumbers_16_8 {
    public static void main ( String[] args ) {
        Scanner in = new Scanner (System.in );

        System.out.println ("Enter telephone number: " );
        String s = in.next ();

        String[] tokens = s.split( "-" );

        for(String token: tokens){
            System.out.println ( token );
        }
    }
}
