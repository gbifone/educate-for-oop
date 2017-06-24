public class InvalidSubscriptException extends RuntimeException {
    public InvalidSubscriptException( ){
        this( " Invalid Subscript ");
    }

    public InvalidSubscriptException ( String message ){
        super( message );
    }
}
