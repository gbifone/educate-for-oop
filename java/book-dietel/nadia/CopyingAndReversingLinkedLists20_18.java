import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CopyingAndReversingLinkedLists20_18 {
    public static void main(String[] args) {
        Character[] characters = {'N' , 'A' , 'D' , 'I' , 'A'};
        List<Character> list = Arrays.asList(characters);
        System.out.println("List Before Reverse:");
        outputList(list);
        Collections.reverse(list);
        System.out.println("\nList After Reverse: ");
        outputList(list);

    }
    private static void outputList(List<Character> charList){
        for(Character listElement : charList){
            System.out.printf("%s\t" , listElement);
        }
    }
}
