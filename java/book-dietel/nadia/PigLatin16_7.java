import java.util.Scanner;

public class PigLatin16_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sent = scanner.nextLine();
        System.out.println(pigLatin(sent));
    }
    public static String pigLatin(String sent){
        String latin = "";
        String[] tokens = sent.split(" ");
        for(int i = 0; i < tokens.length; i++) {
            latin =  new StringBuilder().append (latin).append(tokens[i].substring(1) ) .append( tokens[i].charAt(0) )+  "ay" .concat(" ");
        }
        return latin;
    }
}
