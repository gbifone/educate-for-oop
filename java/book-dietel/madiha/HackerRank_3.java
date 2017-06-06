/**
 * Created by TOSHIBA on 5/23/2017.
 */
import java.util.Scanner;

public class HackerRank_3 {
    public static void main ( String[] args ) {
        Scanner in = new Scanner ( System.in );
        System.out.println(" Enter the value = " );
        int N;
        N = in.nextInt ();
        if ( N % 2 != 0 || (6 <= N && N <= 20)){
            System.out.println ( "Weird");
        }
        else{
            System.out.println ("Not Weird");
        }
    }
}


