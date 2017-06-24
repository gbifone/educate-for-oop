import java.util.*;

public class Stack <T>{

        private ArrayList< T > elements;

        public Stack( ){
            this(10);
        }

        public Stack(int capacity ){
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
