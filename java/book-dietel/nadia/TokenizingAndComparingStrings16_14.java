import java.util.Scanner;

public class TokenizingAndComparingStrings16_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a line of text");
        String text = in.nextLine();
        String[] tokens = text.split(" ");
        for(String token :tokens) {
            if (token.endsWith("ed"))
                System.out.print(token + " ");
        }
    }
}
