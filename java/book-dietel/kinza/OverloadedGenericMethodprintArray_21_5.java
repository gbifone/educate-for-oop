public class OverloadedGenericMethodprintArray_21_5 {
    public static void main ( String[] args ) {
        Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
        Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println( "Array integerArray contains:" );
        printArray ( integerArray , 3, 5);
        System.out.println( "\nArray doubleArray contains:" );
        printArray ( doubleArray , 1, 5);
        System.out.println( "\nArray characterArray contains:" );
        printArray ( characterArray , 1, 4);
    }

    public static < T > void printArray( T[] inputArray , int a, int b){
        try{
            if( b > inputArray.length ){
                throw new InvalidSubscriptException (  );
            } else {
                for ( int i = a ; i <= b ; i++ ) {
                    System.out.println ( inputArray[ i ] + " " );
                }
            }
        }
        catch (InvalidSubscriptException invalidSubscriptException ){
            System.out.println ( "InvalidSubscriptException " );
            invalidSubscriptException.printStackTrace ();
        }
    }
}
