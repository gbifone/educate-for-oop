import java.util.Scanner;

public class SearchingStrings_16_12 {
    public static void main ( String[] args ) {
        Scanner in    = new Scanner ( System.in );
        int[] countArr = new int[26];
        char[] alphabets = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        System.out.println ("Enter an sentence: " );
        String sentence = in.nextLine ();


        for(int i = 0 ; i < sentence.length () ; i++) {
            if( sentence.charAt ( i ) == 'A' || sentence.charAt ( i ) == 'a' ){
                countArr[0]++;
            }
            else if( sentence.charAt ( i ) == 'B' || sentence.charAt ( i ) == 'b' ){
                countArr[1]++;
            }
            else if( sentence.charAt ( i ) == 'C' || sentence.charAt ( i ) == 'c' ){
                countArr[2]++;
            }
            else if( sentence.charAt ( i ) == 'D' || sentence.charAt ( i ) == 'd' ){
                countArr[3]++;
            }
            else if( sentence.charAt ( i ) == 'E' || sentence.charAt ( i ) == 'e' ){
                countArr[4]++;
            }
            else if( sentence.charAt ( i ) == 'F' || sentence.charAt ( i ) == 'f' ){
                countArr[5]++;
            }
            else if( sentence.charAt ( i ) == 'G' || sentence.charAt ( i ) == 'g' ){
                countArr[6]++;
            }
            else if( sentence.charAt ( i ) == 'H' || sentence.charAt ( i ) == 'h' ){
                countArr[7]++;
            }
            else if( sentence.charAt ( i ) == 'I' || sentence.charAt ( i ) == 'i' ) {
                countArr[8]++;
            }
            else if( sentence.charAt ( i ) == 'J' || sentence.charAt ( i ) == 'j' ){
                countArr[9]++;
            }
            else if( sentence.charAt ( i ) == 'K' || sentence.charAt ( i ) == 'k' ){
                countArr[10]++;
            }
            else if( sentence.charAt ( i ) == 'L' || sentence.charAt ( i ) == 'l' ){
                countArr[11]++;
            }
            else if( sentence.charAt ( i ) == 'M' || sentence.charAt ( i ) == 'm' ){
                countArr[12]++;
            }
            else if( sentence.charAt ( i ) == 'N' || sentence.charAt ( i ) == 'n' ){
                countArr[13]++;
            }
            else if( sentence.charAt ( i ) == 'O' || sentence.charAt ( i ) == 'o' ){
                countArr[14]++;
            }
            else if( sentence.charAt ( i ) == 'P' || sentence.charAt ( i ) == 'p' ){
                countArr[15]++;
            }
            else if( sentence.charAt ( i ) == 'Q' || sentence.charAt ( i ) == 'q' ){
                countArr[16]++;
            }
            else if( sentence.charAt ( i ) == 'R' || sentence.charAt ( i ) == 'r' ){
                countArr[17]++;
            }
            else if( sentence.charAt ( i ) == 'S' || sentence.charAt ( i ) == 's' ){
                countArr[18]++;
            }
            else if( sentence.charAt ( i ) == 'T' || sentence.charAt ( i ) == 't' ){
                countArr[19]++;
            }
            else if( sentence.charAt ( i ) == 'U' || sentence.charAt ( i ) == 'u' ){
                countArr[20]++;
            }
            else if( sentence.charAt ( i ) == 'V' || sentence.charAt ( i ) == 'v' ){
                countArr[21]++;
            }
            else if( sentence.charAt ( i ) == 'W' || sentence.charAt ( i ) == 'w' ){
                countArr[22]++;
            }
            else if( sentence.charAt ( i ) == 'X' || sentence.charAt ( i ) == 'x' ){
                countArr[23]++;
            }
            else if( sentence.charAt ( i ) == 'Y' || sentence.charAt ( i ) == 'y' ){
                countArr[24]++;
            }
            else if( sentence.charAt ( i ) == 'Z' || sentence.charAt ( i ) == 'z' ){
                countArr[25]++;
            }
        }
        System.out.println ( sentence );
        System.out.println ("\nOccurrence of each alphabet in given sentence:\n " );
        for( int i = 0 ; i < alphabets.length; i++ ){
            System.out.println ( alphabets[i] + " comes " + countArr[i] +" times in the given sentence.");
        }


    }
}
