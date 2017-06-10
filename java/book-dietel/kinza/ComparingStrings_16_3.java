import java.util.Scanner;

public class ComparingStrings_16_3 {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in );

        System.out.println ("Enter first string: " );
        String s1 = input.next();
        System.out.println ("Enter second string: " );
        String s2 = input.next ();

        int a = s1.compareTo ( s2 );

        if( a == 0 ){
            System.out.println ("Both strings are equal." );
        } else if( a < 0 ){
            System.out.println ("First string is less. " );
        } else if( a > 0){
            System.out.println (" First string is greater. " );
        }
    }
}
