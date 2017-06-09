
public class ExceptionTest {
    public static void main( String [] args )
    {
        ExceptionA a = new ExceptionA();
        ExceptionB b = new ExceptionB();

        try
        {
            a.test();
        }
        catch( ExceptionA e )
        {
            e.printStackTrace( System.err );
        }
        try
        {
            b.test();
        }
        catch( ExceptionA e )
        {
            e.printStackTrace( System.err );
        }
    }
}
