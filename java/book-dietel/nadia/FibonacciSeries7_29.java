/**
 * Created by Nadia on 5/26/2017.
 */
import java.util.Scanner;

public class FibonacciSeries7_29 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        System.out.println("Enter  number of terms ");
        int n = in.nextInt();
        fibonacci1(n);

        System.out.println("Enter  number of terms ");
        int m = in.nextInt();

        double[] arr = new double[m];
         arr[m] = fibonacci(m);
         for(int i = 0; i <= m; i++){
             System.out.print(arr[i]);
         }
    }

    public static void fibonacci1(int N){
        int a = 1;
        int b = 0 , next = 0 ,max = 0;
        System.out.print(next);
        for(int i = 1; i <= N-1 ; i++){
            next = a + b;
            System.out.print("\t" + next  );
            a = b;
            b = next;
            if(max < next) {
                max = next;
            }
        }
        System.out.println("\n The maximum value is this fibonacci Series is " + max);
    }

    public static double fibonacci(int x){
        int a = 1;
        int b = 0 , next = 0;
        double[] fib = new double[x];
        System.out.print(next);
        for(int i = 1; i <= x-1 ; i++){
            next = a + b;
            for(int j = 0; j < x; j++) {
                fib[j] = next;
            }
            a = b;
            b = next;
        }
        return fib[x];
    }
}
