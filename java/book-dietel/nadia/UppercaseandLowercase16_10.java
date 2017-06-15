import java.util.Scanner;

public class UppercaseandLowercase16_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter some text");
        String text = in.nextLine();
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
    }
}
