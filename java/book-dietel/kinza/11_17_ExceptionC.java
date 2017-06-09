public class ExceptionC extends ExceptionB {
    public ExceptionC (){
    }

    public ExceptionC ( String eMessage ){
        super(eMessage);
    }
    public void throwException () throws ExceptionC {
        throw new ExceptionC ( "Exception thrown from ExceptionB" );
    }
}
