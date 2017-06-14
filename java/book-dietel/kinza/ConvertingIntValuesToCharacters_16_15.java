import java.util.Scanner;

public class ConvertingIntValuesToCharacters_16_15 {
    public static void main ( String[] args ) {
        Scanner in = new Scanner ( System.in );

        System.out.println( "Enter three digit integer in the range of 000 - 255:" );
        int digit = in.nextInt();

        if( digit > 000 && digit <= 255 ) {
            System.out.printf ( "Convert digit to character: %s\n", String.valueOf ( (char)digit ) );
        }
    }
}
