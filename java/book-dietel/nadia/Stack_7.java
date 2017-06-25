import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack_7< T > {
    private ArrayList< T > elements;

    public Stack_7( ){
        this(10);
    }

    public Stack_7(int capacity ){
        int initCapacity = capacity > 0 ? capacity : 10 ;
        elements = new ArrayList < T > ( initCapacity );
    }

    public void push ( T pushValue ){
        elements.add ( pushValue );
    }

    public T pop(){
        if(elements.isEmpty ()){
            throw new EmptyStackException (  );
        }
        return elements.remove ( elements.size () - 1 );
    }
}
