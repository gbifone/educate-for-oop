/**
 * Created by TOSHIBA on 5/26/2017.
 */
import java.util.Scanner;
public class HackerRank_10
{
    public static void main ( String[] args )
    {
        Scanner obj= new Scanner(System.in);
        System.out.println(" Enter the number = " );
        int n;
        n = obj.nextInt ();
        int current=0;
        int max=0;
        while(n > 0)
        {
            if(n % 2 == 1)
            {
                current++;
                if(current > max)
                    max++;
            }
            else
            {
                current = 0;
            }
            n /= 2;
        }
        System.out.println ( max );
    }
}
