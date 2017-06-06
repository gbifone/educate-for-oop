import java.util.Scanner;

/**
 * Created by kinza mustafa on 5/23/2017.
 */
public class HackerRankDay_5 {
    public static void main ( String[] args ) {
        Scanner in = new Scanner ( System.in );
        int n;
        n = in.nextInt ( );
        for ( int i = 1 ; i <= 10 ; i++ ) {
            System.out.println ( n + " " + 'x' + " " + i + " " + '=' + " " + n * i );
        }
    }
}
