
public class ExceptionC extends ExceptionB{
    public ExceptionC()
    {
    }
    public ExceptionC( final String exceptionMessage )
    {
        super( exceptionMessage );
    }

    @Override
    public void test() throws Exception
    {
        throw new Exception( "An Exception of type 'ExceptionC' has been thrown" );
    }
}
