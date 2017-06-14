import java.util.Scanner;

public class DisplayingSentenceWithItsWordsReversed_16_9 {
    public static void main ( String[] args ) {
        Scanner in = new Scanner ( System.in );
        String ss = "" ;

        System.out.println ("Enter a sentence and press Enter: " );
        String s = in.nextLine ();

        String[] tokens = s.split ( " " );

        for( int i = tokens.length - 1 ; i >= 0; i -- ){
            ss += tokens[i] + " ";
        }

        System.out.println ( ss );
    }
}
