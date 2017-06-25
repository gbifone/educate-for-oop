import java.util.*;

public class DuplicateElimination_20_13 {
    public static void main ( String[] args ) {
        String[] first = {"Kinza", "Nadia", "Madiha", "Aqsa", "Kinza", "Nadia", "Laraib", "Hira", "Kinza"};

        List< String > list = new ArrayList <> ( Arrays.asList ( first ) );

        Set<String> nonDuplicate = new HashSet <> ( list );
        System.out.println (" Non Duplicates are : " );
        for ( String str: nonDuplicate ){
            System.out.printf ("%s\t", str );
        }
    }
}
