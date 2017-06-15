public abstract class ExceptionA extends Exception {
    public ExceptionA ( ){

    }
     public ExceptionA ( String eMessage ){
        super(eMessage);
     }
     public abstract void throwException ( ) throws ExceptionA;
}
