public class ExceptionA extends Exception {
    public ExceptionA ( ){

    }
    public ExceptionA ( String eMessage ){
        super(eMessage);
    }
    public void throwException ( ) throws ExceptionA{
        throw new ExceptionA ( "Exception occured in ExceptionA" );
    }

}
