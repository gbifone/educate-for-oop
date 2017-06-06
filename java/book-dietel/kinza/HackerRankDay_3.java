import java.util.Scanner;

/**
 * Created by kinza mustafa on 5/23/2017.
 */
public class HackerRankDay_3 {
    public static void main ( String[] args ) {
        Scanner in = new Scanner ( System.in );
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
