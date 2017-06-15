public class RethrowingExceptions_11_21 {
    public static void main ( String[] args ) {
        try{
            System.out.println (" Exception handled in main " );
            someMethod();
        } catch (Exception exception ){
            System.err.printf ( "%s\n\n", exception.getMessage () );
            exception.printStackTrace ();

            StackTraceElement[] traceElements = exception.getStackTrace ();

            System.out.println( "\nStack trace from getStackTrace:" );
            System.out.printf( "\n %s %25s %20s %10s\n","Class","File","Line","Method" );

            for ( StackTraceElement element: traceElements ){
                System.out.printf( "%s\t", element.getClassName () );
                System.out.printf( "%s\t", element.getFileName  () );
                System.out.printf( "%s\t", element.getLineNumber() );
                System.out.printf( "%s\n", element.getMethodName() );
            }
        }

    }

    public static void someMethod ( ) throws Exception {
        try{
            someMethod2 ();
            throw new Exception ( "Exception in someMethod " );
        } catch (Exception exception) {
            System.err.println ( "Exception handled in someMethod" );
            throw exception;
        }

    }

    public static void someMethod2 ( ) throws Exception {
        try{
            throw new Exception ( "Exception in someMethod2 " );
        } catch (Exception exception) {
            System.err.println ( "Exception handled in someMethod2" );
            throw exception;
        }
    }
}
