/**
 * Created by Nadia on 5/24/2017.
 */
import java.util.Scanner;

public class Day_6 {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        int n;
        System.out.println( "Enter a num :");
        n = obj.nextInt();
        String S;
        for( int i=0; i < n; i++)
        {
            System.out.println( "Enter a string :");
            S = obj.next();
            for( int j = 0; j < S.length(); j++)
            {
                if(j % 2 == 0)
                {
                    System.out.print( S.charAt (j));
                }
            }
            System.out.print( " " );
            for( int j = 0; j < S.length(); j++)
            {
                if(j % 2 == 1)
                {
                    System.out.print( S.charAt (j));
                }
            }
            System.out.println();
        }
    }
}
