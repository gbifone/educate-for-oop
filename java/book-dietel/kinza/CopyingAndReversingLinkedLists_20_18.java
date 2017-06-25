import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CopyingAndReversingLinkedLists_20_18 {
    public static void main ( String[] args ) {
        Character[] characters = {'a', 'b', 'c', 'd'};
        List<Character> list1 = new LinkedList <> ( Arrays.asList ( characters ) );
        System.out.print ("\nList1: " );
        printList ( list1 );

        Character[] characters1 = new Character[4];
        List<Character> list2 = new LinkedList <> ( Arrays.asList ( characters1 ) );
        Collections.reverse ( list1 );
        Collections.copy ( list2, list1 );
        System.out.println ("\nReversed and Copied list: " );
        printList ( list2 );
    }

    private static void printList( List<Character> list){
        for ( Character ch: list ){
            System.out.printf ("%s\t", ch );
        }
    }
}
