import java.util.*;

public class CountingDuplicateWords_20_16 {
    public static void main ( String[] args ) {
        String sentence = "hello i am here hi hello i am here";
        Set<String> duplicates = duplicateWords( sentence );
        System.out.println ( "Duplicates words : " );
        for ( String str: duplicates ){
            System.out.print ( str + "\t" );
        }
    }

    public static Set<String> duplicateWords ( String input ){
        Set<String> duplicates = new HashSet<>();
        String[] words = input.split ( " " );
        Set<String> set = new HashSet<>( );
        for(String word : words){
            if(!set.add ( word )){
                duplicates.add ( word );
            }
        }
        return duplicates;
    }

}
