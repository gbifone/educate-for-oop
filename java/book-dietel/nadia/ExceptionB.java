
public class ExceptionB extends ExceptionA {
    public ExceptionB()
    {

    }
    public ExceptionB( final String exceptionMessage )
    {
        super( exceptionMessage );
    }
    public void test() throws Exception
    {
        throw new Exception( "An Exception of type 'ExceptionB' has been thrown" );
    }
}
