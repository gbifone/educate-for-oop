public class DefiningYourOwnStringMethods_16_16 {
    public static void main ( String[] args ) {

        String string = "this is a string";

        System.out.printf( "'i' is located at index %d\n", string.indexOf ( 'i' ));
        System.out.printf( "Last \"def\" is located at index %d\n", string.lastIndexOf ( "t" ) );
    }
}
