public class CatchingExceptionsWithSuperclasses_11_17 {
    public static void main ( String[] args ) {
        ExceptionB b = new ExceptionB();
        ExceptionC c = new ExceptionC();
        try
        {
            b.throwException();
        }
        catch( ExceptionA e )
        {
            System.out.println ("Exception in ExceptionB "+ e.getMessage () );
        }
        try
        {
            c.throwException();
        }
        catch( ExceptionA e )
        {
            System.out.println ("Exception in ExceptionC "+ e.getMessage () );
        }
    }

}
