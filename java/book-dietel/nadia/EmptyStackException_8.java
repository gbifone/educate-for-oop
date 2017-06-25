public class EmptyStackException_8 extends RuntimeException {

    public EmptyStackException_8( ){
        this( "Stack is empty" );
    }

    public EmptyStackException_8( String message ){
        super( message );
    }
}
