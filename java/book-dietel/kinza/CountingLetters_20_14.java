import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class CountingLetters_20_14 {
    public static void main ( String[] args ) {
        Map< String, Integer > myMap = new HashMap <> ();
        createMap ( myMap );
        displayMap ( myMap );
    }

    private static void createMap( Map< String, Integer > map ) {
        Scanner scanner = new Scanner ( System.in );
        System.out.println ( "Enter a string:" );
        String   input  = scanner.nextLine ( );

        String[] tokens = input.split ( "" );

        for ( String token : tokens ) {
            String ch = token.toLowerCase ( );

            if(map.containsKey ( ch )){
                int count = map.get ( ch );
                map.put ( ch, count + 1 );
            }
            else {
                map.put ( ch, 1 );
            }
        }
    }

    private static void displayMap( Map< String, Integer > map ){
        Set< String > keys = map.keySet ( );
        TreeSet< String > sortedKeys = new TreeSet<>( keys );
        System.out.println( "\nMap contains:\nKey\t\t\tValue" );
        for ( String key : sortedKeys ) {
            System.out.printf( "%-10s%5s\n", key, map.get ( key ));
        }
        System.out.printf( "\nsize: %d\nisEmpty: %b\n", map.size (), map.isEmpty ());
    }
}
