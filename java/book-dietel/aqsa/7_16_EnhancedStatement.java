/**
 * Created by Aqsa on 5/22/2017.
 */
public class EnhancedStatement_7_16
{
    public static void main(String[] args)
    {
        double sum = 0.0;
        double[] array = { 8.7, 6.8, 9.4, 10.0, 8.3, 7.8, 8.5, 9.1, 7.6, 8.7 };
        for ( double number : array )
            sum += number;
        System.out.printf ( "The sum is %f ", sum );

    }
}


