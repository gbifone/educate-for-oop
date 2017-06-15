public class ExceptionB extends ExceptionA {
    public ExceptionB ( ){

    }
    public ExceptionB ( String eMessage ){
        super(eMessage);
    }

    public void throwException ( ) throws ExceptionA{
        throw new ExceptionA ( "Exception occured in ExceptionB" );

    }
}
