/**
 * Created by Aqsa on 5/23/2017.
 */
import java.util.Scanner;
public class HackerRankDay_3
{
    public static void main ( String[] args )
    {
        Scanner obj = new Scanner ( System.in );
        int N;
        N = obj.nextInt ( );
        if ( N % 2 != 0 ) {
            System.out.println ( "Weird" );
        } else if ( N >= 2 && N <= 5 ) {
            System.out.println ( "Not Weird" );
        } else if ( N >= 6 && N <= 20 ) {
            System.out.print ( "Weird" );
        } else if ( N > 20 ) {
            System.out.print ( "Not Weird" );
        }
    }
}
