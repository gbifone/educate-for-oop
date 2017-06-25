public class OverloadingGenericMethodWithNongenericMethod_21_6 {
    public static void main ( String[] args ) {
        String[] stringsArray = { "one", "two", "three", "four", "five", "six", "seven", "eight"};

        System.out.println( "Array stringArray contains:" );
        printArray ( stringsArray );
    }

    public static < T > void printArray( T[] inputArray ){
        for (int i = 0; i < inputArray.length; i++) {
            System.out.printf ( "%10s ", inputArray[i] );
            if( i == 3 ){
                System.out.println ( );
            }
        }
        System.out.println ( );
    }
}
