import java.util.Scanner;

public class SearchingStrings_16_11 {
    public static void main ( String[] args ) {
        Scanner in = new Scanner ( System.in );
        int count = 0;

        System.out.println ("Enter an sentence: " );
        String sentence = in.nextLine ();
        System.out.println ("Enter a character to search: " );
        char c = in.next ().charAt ( 0 );

        for(int i = 0 ; i < sentence.length () ; i++) {
            if ( sentence.charAt ( i ) == c ) {
                count++;
            }
        }
        System.out.printf ("\"%c\" occur \"%d\" times in the given sentence ", c, count );
    }
}
