import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SortingWordsWithTreeSet20_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<String> set = new TreeSet<>();
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        String[] tokens = str.split(" ");
        for(String token : tokens){
            set.add(token);
        }
        System.out.println("String in Ascending order is:");
        for(String string :set){
            System.out.println(string);
        }
    }
}
