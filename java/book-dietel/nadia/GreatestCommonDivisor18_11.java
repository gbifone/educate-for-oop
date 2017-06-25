import java.util.Scanner;

public class GreatestCommonDivisor18_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st valve: ");
        int x = in.nextInt();
        System.out.println("Enter 2nd value: ");
        int y = in.nextInt();
        int result = gcd(x,y);
        System.out.println("The GCD of " + x + " and " + y + " is:  " + result);

    }
    public static int gcd(int x,int y){
        if(y == 0)
            return x;
        else
            return   gcd(y,x%y);
    }
}
