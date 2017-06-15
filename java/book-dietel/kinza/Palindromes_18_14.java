import java.util.Scanner;

public class Palindromes_18_14 {
    public static void main ( String[] args ) {
        Scanner in = new Scanner ( System.in );
        System.out.println ("Enter word to check it is palindrome: " );
        String string = in.nextLine ();

        boolean result = testPalindrome ( string );
        if( result ){
            System.out.println ("it is palindrome" );
        } else {
            System.out.println ("it is not a palindrome" );
        }

    }

    public static boolean testPalindrome( String str ){
        if(str.length() == 0 || str.length() == 1) {
            return true;
        }
        if(str.charAt(0) == str.charAt(str.length()-1)) {
            return testPalindrome ( str.substring ( 1, str.length ( ) - 1 ) );
        }
        return false;
    }
}
