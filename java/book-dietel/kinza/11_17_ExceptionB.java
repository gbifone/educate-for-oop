public class ExceptionB extends ExceptionA{

    public ExceptionB (){

    }

    public ExceptionB ( String eMessage ){
        super(eMessage);
    }
    public void throwException () throws ExceptionB {
        throw new ExceptionC ( "Exception thrown from ExceptionB" );
    }
}
