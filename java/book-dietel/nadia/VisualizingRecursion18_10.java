
public class VisualizingRecursion18_10 {
    public static void main(String[] args) {
        for ( int counter = 0; counter <= 21; counter++ )
            System.out.printf( "%d! = %d\n", counter,factorial(counter));
    }
    public static long factorial(long number){
        if(number <= 1)
            return 1;
        else
            System.out.printf( "%d! = factorial (%d)\n", number ,number-1);
        return number * factorial(number-1);
    }
}
