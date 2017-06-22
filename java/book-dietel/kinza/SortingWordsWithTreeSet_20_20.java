import java.util.*;

public class SortingWordsWithTreeSet_20_20 {
    public static void main ( String[] args ) {
        Scanner in = new Scanner ( System.in );

        System.out.println ("Enter a sentence: " );
        String sentence = in.nextLine ();
        String[] tokens = sentence.split ( " " );

        Set<String> set = new TreeSet <> (Arrays.asList ( tokens ) );

        System.out.println ("Sentence in TreeSet: " );
        for ( String str: set ){
            System.out.printf ("%s\t", str );
        }
    }
}
