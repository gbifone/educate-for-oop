import java.util.*;

public class AsListMethod_20_12 {
    public static void main ( String[] args ) {
        String[]       colors = { "black", "yellow", "green", "blue", "violet", "silver" };
        List< String > list1  = new LinkedList <> ( Arrays.asList ( colors ));

        String[] colors2 = { "gold", "white", "brown", "blue", "gray", "silver" };
        List< String > list2 = new LinkedList<>( Arrays.asList ( colors2 ));

        list1.addAll ( list2 );
        printList( list1 );

        convertToUppercaseStrings( list1 );
        printList( list1 );

        System.out.print( "\nDeleting elements 4 to 6..." );
        removeItems( list1, 4, 7 );
        printList( list1 );
        printReversedList( list1 );
    }

    private static void printList( List<String> list ) {
        System.out.println( "\nlist: " );
        for ( String color : list )
            System.out.printf( "%s ", color );

        System.out.println();
    }

    private static void convertToUppercaseStrings( List<String> list ) {
        ListIterator< String > iterator = list.listIterator ( );

        while ( iterator.hasNext () )
        {
            String color = iterator.next ();
            iterator.set ( color.toUpperCase () );
        }
    }

    private static void removeItems( List<String> list , int start, int end ) {
        list.subList( start, end ).clear();
    }

    private static void printReversedList( List<String> list ) {
        ListIterator< String > iterator = list.listIterator( list.size() );
        System.out.println( "\nReversed List:" );

        while ( iterator.hasPrevious () ) {
            System.out.printf( "%s ", iterator.previous ());
        }
    }

}
