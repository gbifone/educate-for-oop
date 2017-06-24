import java.util.Arrays;

public class GenericMethodselectionSort21_4 {
    public static void main(String[] args) {
        Integer[] integers = {12,34,7,45,8};
        Float[] floats = {12.4f,56.6f,7f};
        System.out.println( "Unsorted array of integers:" );
        for(Integer num :integers) {
            System.out.println(num);
        }
        sort(integers);
        System.out.println( "Unsorted array of floats:" );
        for(Float num :floats) {
            System.out.println(num);
        }
        sort(floats);
    }
    public static <T extends Comparable<T> >void sort(T[] data ){
        int smallest;
        for(int i = 0; i < data.length-1 ; i++){
            smallest = i;
            for(int index = i+1; index <data.length; index++ ){
                if(data[index].compareTo(data[smallest]) < 0)
                    smallest = index;
                swap(i,smallest,data);
                printPass(i+1 ,smallest, data);
            }
        }
    }
    public static  <T> void swap( int first, int second ,  T[] data  ) {
        T temporary = data[ first ];
        data[ first ] = data[ second ];
        data[ second ] = temporary;
    }
    public static  <T> void printPass( int pass, int index ,T[] data){
        System.out.print( String.format( "after pass %2d: ", pass ) );
        for ( int i=0; i < index; i++ )
            System.out.print( data[ i ] + " ");
        System.out.print( data[ index ] + "* " );
        for( int i = index + 1; i < data.length; i++ )
            System.out.print( data[ i ] + "");
        System.out.print( "\n " );
        for ( int j=0; j < pass; j++ )
            System.out.print( "-- " );
        System.out.println( "\n" );
    }
}