
public class ExceptionB extends ExceptionA{
    public ExceptionB()
    {

    }
    public ExceptionB( final String exceptionMessage )
    {
        super( exceptionMessage );
    }
    public void test() throws ExceptionB
    {
        throw new ExceptionB( "An Exception of type 'IO Exception' has been thrown" );
    }
}
