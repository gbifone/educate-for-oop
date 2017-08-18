/**
 * Created by Aqsa on 5/23/2017.
 */
import java.util.Scanner;
public class HackerRankDay_5 {
    public static void main ( String[] args ) {
        Scanner obj = new Scanner ( System.in );
        int n;
        n = obj.nextInt ( );
        for ( int i = 1 ; i <= 10 ; i++ ) {
            System.out.println ( n + " " + 'x' + " " + i + " " + '=' + " " + n * i );
        }
    }
}

