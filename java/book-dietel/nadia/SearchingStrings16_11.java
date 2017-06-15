import java.util.Scanner;

public class SearchingStrings16_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a text");
        String text = in.nextLine();
        System.out.println("Enter character to search");
        char ch = in.next().charAt(0);
        System.out.println(text.indexOf(ch,2));
    }
}
