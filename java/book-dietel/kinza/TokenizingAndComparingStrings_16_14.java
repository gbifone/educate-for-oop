import java.util.Scanner;

public class TokenizingAndComparingStrings_16_14 {
    public static void main ( String[] args ) {
        Scanner in = new Scanner ( System.in );

        System.out.println ("Enter a sentence: " );
        String sentence = in.nextLine ();

        String[] tokens = sentence.split ( " " );

        for(String token: tokens ) {
            if (token.endsWith ( "ED" ))
                System.out.printf( "\"%s\" ended with \"ED\"\n", token );
        }
    }
}
