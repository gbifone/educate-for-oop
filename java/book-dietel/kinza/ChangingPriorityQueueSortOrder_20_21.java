import java.util.*;

public class ChangingPriorityQueueSortOrder_20_21 {
    public static void main ( String[] args ) {
        PriorityQueue< Double > queue = new PriorityQueue<>();

        queue.offer( 3.2 );
        queue.offer( 9.8 );
        queue.offer( 5.4 );
        queue.offer( 4.7 );

        List<Double> list = new ArrayList <> (  );
        list.addAll ( queue );
        Collections.reverse ( list );

        System.out.println ("PriorityQueue in descending order: " );
        for ( Double d: list ) {
            System.out.printf ( "%.2f\t", d );
        }
    }
}
