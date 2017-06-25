import java.util.*;

public class CountingLetters20_14 {
    public static void main(String[] args) {
        Map<Character,Integer> myMap = new HashMap<>();
        createMap(myMap);
        displayMap(myMap);
    }

    private static void createMap(Map<Character,Integer> map) {
    Scanner in = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = in.next();
        for(char ch : input.toCharArray()) {
            if (map.containsKey(ch)){
                int count = map.get(ch);
                map.put(ch , count+1);
            }
            else
                map.put(ch , 1);
        }
    }
    private static void displayMap(Map<Character , Integer> map){
        Set<Character> keys = map.keySet();
        TreeSet< Character > sortedKeys = new TreeSet< Character >( keys );
        System.out.println( "\nMap contains:\nKey\t\tValue" );
        for ( Character key : sortedKeys )
            System.out.printf( "%-10s%2s\n", key,map.get(key) );
            System.out.printf(  "\nsize: %d\nisEmpty: %b\n",map.size() ,map.isEmpty() );

    }
}
