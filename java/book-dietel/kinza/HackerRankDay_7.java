/**
 * Created by Kinza Fatima on 5/24/2017.
 */
import java.util.Scanner;
public class HackerRankDay_7 {
    public static void main(String[] args) {
        Scanner obj = new Scanner ( System.in );
        int n;
        System.out.println ("Enter number: " );
        n = obj.nextInt ();
        int[] arr = new int[n];
        for ( int i = 0 ; i < n ; i++ )
        {
            arr[i] = obj.nextInt ();
        }
        for ( int j = n - 1 ; j >= 0 ; j-- )
        {
            System.out.print ("\n"+ arr[j] + " ");
        }
    }

}
