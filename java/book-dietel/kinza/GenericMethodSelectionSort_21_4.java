public class GenericMethodSelectionSort_21_4 {
    public static void main ( String[] args ) {
        Integer[] integerArray = {1, 4, 3, 6, 8, 9, 7, 2, 5 };
        Float[] floatArray = {1.1f , 3.3f, 5.5f, 7.7f, 9.9f, 2.2f, 4.4f, 6.6f, 8.8f };
        System.out.println ("Integer array " );
        selectionSort ( integerArray );
        System.out.println ("\nFloat array" );
        selectionSort ( floatArray );
    }
    public static < T extends  Comparable< T > > void selectionSort ( T[] array ){
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j].compareTo(array[index]) < 0){
                    index = j;
                }
            }
            T smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }
        for ( T element: array ){
            System.out.printf ("%s ", element );
        }
    }
}
