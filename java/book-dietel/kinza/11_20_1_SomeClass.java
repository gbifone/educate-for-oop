public class SomeClass_11_20 {
    public static void main ( String[] args ) {
        try{
            SomeClass someClass = new SomeClass ( "SomeClass here" );
        } catch (Exception exception){
            System.out.println ("Exception Message: "+ exception.getMessage () );
        }
    }
}
