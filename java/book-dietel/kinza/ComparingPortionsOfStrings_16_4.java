import java.util.Scanner;

public class ComparingPortionsOfStrings_16_4 {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in );

        System.out.println ("Enter 1st string: " );
        String s1 = input.next ();
        System.out.println (" Enter 2nd string: " );
        String s2 = input.next ();
        System.out.println (" Enter the number of characters to be compared: " );
        int a = input.nextInt ( );
        System.out.println ("Enter the starting index of the comparison: " );
        int b = input.nextInt ();

        boolean bool = s1.regionMatches ( true, 0, s2, b, a );

        if ( bool == true ){
            System.out.println ("Strings are equal. " );
        }else{
            System.out.println ("Strings are not equal. " );
        }


    }
}
