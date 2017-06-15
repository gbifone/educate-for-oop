import java.util.Scanner;

public class PigLatin_16_7 {
    public static void main ( String[] args ) {
        Scanner in = new Scanner(System.in);

        System.out.println ("Enter a sentence: " );
        String sentence = in.nextLine ();
        String[] tokens = sentence.split ( " " );

        for(String token: tokens) {
            System.out.print ( printLatinWord ( token ) );
        }
    }

    public static String printLatinWord( String string ){
        String str = "";

        str += new StringBuilder (  ).append ( str ).append ( string.substring ( 1 ) ).append ( string.charAt ( 0 ) ).append ( "ay" ).append ( " " );

        return str;
    }
}
