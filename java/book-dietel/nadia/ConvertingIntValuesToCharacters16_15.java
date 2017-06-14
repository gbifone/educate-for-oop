import java.util.Scanner;

public class ConvertingIntValuesToCharacters16_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the radix");
        int radix = scanner.nextInt();
        System.out.println( "Enter a digit:" );
         int digit = scanner.nextInt();
         System.out.printf( "Convert digit to character: %s\n",
                 Character.forDigit(digit,radix));
    }

}
