import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class InsertingElementsInLinkedListInSortedOrder_20_17 {
    public static void main ( String[] args ) {
        Random rand = new Random (  );
        List<Integer> list = new LinkedList <> (  );

        for ( int i = 0; i < 25; i++ ){
            int count = 0 + rand.nextInt (100);
            list.add ( count );
        }
        System.out.println ("\nList: " );
        printList ( list );
        System.out.println ("\nSorted List: " );
        Collections.sort ( list );
        printList ( list );

        Integer sum = sumList( list );
        System.out.println ("\nSum of elements in linkedList: "+ sum );
        float avg = sum/25 ;
        System.out.println ("\nAverage of elements in linkedList: "+ avg );
    }

    private static Integer sumList( List<Integer> list ){
        int sum = 0;
        for ( int i = 0; i < list.size (); i++ ) {
            sum += list.get ( i );
        }

        return sum;
    }

    private static void printList( List<Integer> list ){
        for ( Integer i : list ){
            System.out.printf ("%d\t", i );
        }
        System.out.println ( );
    }
}
