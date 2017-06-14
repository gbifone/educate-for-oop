import java.util.Scanner;

public class DisplayingStringsinUppercaseandLowercase_16_10 {
    public static void main ( String[] args ) {
        Scanner in = new Scanner ( System.in );

        System.out.println ("Enter a sentence and press Enter: " );
        String sentence = in.nextLine ();

        System.out.println ("Sentence in UPPERCASE: " + sentence.toUpperCase () );
        System.out.println ("Sentence in lowercase: " + sentence.toLowerCase () );
    }
}
