/**
 * Created by Aqsa on 5/25/2017.
 */
import java.util.Scanner;
public class HackerRankDay_10
{
    public static void main ( String[] args )
    {
        Scanner obj= new Scanner(System.in);
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
