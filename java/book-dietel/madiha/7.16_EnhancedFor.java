/**
 * Created by TOSHIBA on 5/22/2017.
 */
import java.util.Scanner;

public class EnhancedFor {
     public static void main ( String[] args ) {
            Scanner in = new Scanner ( System.in );

            double sum = 0.0;

            double[] array = new double[5];

            System.out.println ("Enter 5 strings: " );
            for(int i=0; i < array.length; i++){
                array[i] = in.nextInt ();
            }

            for(double d : array) {

                sum +=  d;
            }

            System.out.println ("sum of a Double type array is: "+ sum );

        }
    }
