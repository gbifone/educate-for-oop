import java.util.Scanner;

public class WordsReversed16_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String sentence = in.nextLine();
        String[] tokens = sentence.split(" ");
        for(String token :tokens){
            StringBuilder buffer = new StringBuilder( token );
            buffer.reverse();
            System.out.print(buffer.toString() + " ");
        }
    }
}
