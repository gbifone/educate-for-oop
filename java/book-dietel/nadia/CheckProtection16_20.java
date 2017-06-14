import java.util.Scanner;

public class CheckProtection16_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 9-digit amount");
        String amount = in.nextLine();
        int len = 9 - amount.length();
        System.out.println("Protected amount is: ");
        for(int i = 0; i < len; i++){
            System.out.print("*");
        }
        System.out.print(amount);
    }
}
