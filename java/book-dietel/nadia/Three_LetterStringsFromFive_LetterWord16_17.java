import java.util.Scanner;

public class Three_LetterStringsFromFive_LetterWord16_17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a five-letter word:");
        String str = in.nextLine();
        int j = 3;
        for(int i = 0; i < 3; i++){
            String word =str.substring(i,j);
            System.out.printf("%s%s%s\t",word.charAt(0), word.charAt(1), word.charAt(2));
            System.out.printf("%s%s%s\t",word.charAt(0), word.charAt(2),word.charAt(1));
            System.out.printf("%s%s%s\t",word.charAt(1), word.charAt(0),word.charAt(2));
            System.out.printf("%s%s%s\t",word.charAt(1), word.charAt(2),word.charAt(0));
            System.out.printf("%s%s%s\t",word.charAt(2), word.charAt(0),word.charAt(1));
            System.out.printf("%s%s%s\t",word.charAt(2), word.charAt(1),word.charAt(0));
            j++;
            System.out.println();
        }
    }
}
