import java.util.ArrayList;

public class TotalNumbers_21_exm_13 {
    public static void main ( String[] args ) {
        Number[] numbers = {1, 2.4, 3, 2.1};
        ArrayList<Number> numberList = new ArrayList <> (  );

        for ( Number elements: numbers ){
            numberList.add(elements);
        }
        System.out.printf( "numberList contains: %s\n", numberList);
        System.out.printf( "Total of the elements in numberList: %.1f\n", sum ( numberList ));
    }

    public static double sum( ArrayList<Number> list ){
        double total = 0;

        for ( Number elements: list){
            total += elements.doubleValue ();
        }
        return total;
    }
}
