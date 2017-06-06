/**
 * Created by TOSHIBA on 5/26/2017.
 */
import java.util.Scanner;
public class FibonacciSeries_7_29
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = obj.nextInt();
        fibonacci(number);
    }

    public static void fibonacci(int n)
    {
        if (n == 0)
        {
            System.out.println("0");
        }
        else if (n == 1)
        {
            System.out.println("0 1");
        }
        else
        {
            System.out.print("0 1 ");
            int num1 = 0;
            int num2 = 1;
            for (int i = 1; i < n; i++)
            {
                int num3 = num1 + num2;
                System.out.print(num3 + " ");
                num1 = num2;
                num2 = num3;
            }
        }
    }
}
