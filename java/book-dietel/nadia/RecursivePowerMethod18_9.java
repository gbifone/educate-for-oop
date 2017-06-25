import java.util.Scanner;

public class RecursivePowerMethod18_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base:");
        int base = input.nextInt();
        System.out.println("Enter exponent: ");
        int exponent = input.nextInt();
        int result = power(base ,exponent);
        System.out.println("The result of power method is : " + result);
    }
    public  static int power( int base, int exponent)  {
        if ( exponent == 1 )
            return base;
        else
            return base * power( base, exponent - 1 );
    }
}
