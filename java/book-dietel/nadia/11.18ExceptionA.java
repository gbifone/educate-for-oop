
public  class ExceptionA  extends Exception{
    public ExceptionA()
    {
    }
    public ExceptionA( final String exceptionMessage )
    {
        super( exceptionMessage );
    }

    public  void test() throws ExceptionA{
        throw new ExceptionB( "An Exception of type ' NullPointerException ' has been thrown" );
    }

}
