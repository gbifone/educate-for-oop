
/**
 * Created by TOSHIBA on 5/24/2017.
 */
import java.util.Scanner;

public class HackerRank_6 {
    public static void main ( String[] args )
    {
        Scanner object = new Scanner ( System.in );
        System.out.println ("Enter number: " );
        int N = object.nextInt ( );
        String s;
        for ( int i = 0 ; i <= N ; i++ )
        {
            System.out.println ("Enter string: " );
            s = object.next ( );
            for ( int j = 0 ; j < s.length ( ) ; j++ )
            {
                if ( j % 2 == 0 )
                {
                    System.out.print ( s.charAt ( j ) );
                }
            }
            System.out.print ( " " );
            for ( int j = 0 ; j < s.length ( ) ; j++ )
            {
                if ( j % 2 == 1 )
                {
                    System.out.print ( s.charAt ( j ) );
                }
            }
            System.out.println ( );
        }
    }

}
