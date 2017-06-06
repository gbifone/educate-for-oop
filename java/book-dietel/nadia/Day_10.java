/**
 * Created by Nadia on 5/25/2017.
 */
import java.util.Scanner;

public class Day_10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter a Decimal Number :");
        n = in.nextInt();
        int m = n;
        int max = 0;
        int count = 0;

        while(n > 0){
            if(n % 2 == 1){
                count++;
                if(count > max)
                    max = count;
            }
            else{
                count = 0;
            }
            n /= 2;
        }
        System.out.println("In the Binary of Decimal Number " + m + "  The Number of Consecutive 1's is " + max);
    }
}
