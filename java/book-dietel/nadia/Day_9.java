/**
 * Created by Nadia on 5/25/2017.
 */
import java.util.Scanner;

public class Day_9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N;
        System.out.print("Enter a Number: ");
        N = in.nextInt();
        factorial(N);

    }
    public static void factorial (int n){
        int f=1;
        for(int i=1; i<= n; i++){
            f = f*i;
        }
        System.out.println("Factorial of the Number " + n + " is " + f);
    }
}
