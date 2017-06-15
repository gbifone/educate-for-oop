public class CatchingExceptionsUsingOuterScopes_11_22 {

    public static void main(String[] args) {
        try {
            try {
                throw new Exception ( "First exception" );
            } finally {
                System.out.println("Normal completion finally block");
            }
        } catch (Exception e) {
            System.out.println("In outer try's catch, catching " + e);
        }
    }
}
