import java.util.Scanner;

public class DefiningYourOwnStringMethods_16_16 {
    public static void main ( String[] args ) {
        Scanner in = new Scanner ( System.in );

        System.out.println ("Enter a string:" );
        String string = in.next();
        System.out.println ("Enter character for which you want to search index: " );
        char character = in.next ().charAt ( 0 );

        int index = search ( character, string );

        System.out.println (character + " found on index "+ index );
    }

    public static int search( char ch ,String words){
        int location = -1;
        for( int i = 0; i < words.length (); i++ ){
            if ( ch == words.charAt ( i ) ){
                location = i;
            }
        }
        return location;
    }
}
