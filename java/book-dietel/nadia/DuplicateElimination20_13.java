import java.util.*;

public class DuplicateElimination20_13 {
    public static void main(String[] args) {
        String[] name = { "nadia" , "sadia" , "ali" , "aniqa" , "nadia" , "anas" , "aniqa"};
        List<String> names = new LinkedList<>(Arrays.asList(name));
        System.out.printf("%s\t", names);
        printNoDuplicates(names);
    }
    private static void printNoDuplicates(List<String> values){
        Set<String> set = new HashSet<>(values);
        System.out.println("\nNo Duplicates");
        for(String value :set){
            System.out.printf("%s\t" , value);
            System.out.println();
        }
    }
}
