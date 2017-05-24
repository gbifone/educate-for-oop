/**
 * Created by Nadia on 5/19/2017.
 */
import java.util.Scanner;

public class DuplicateElimination7_12 {

        public static void main ( String[] args ) {
            Scanner in = new Scanner ( System.in );

            int a[] = new int[10];
            int b[] = new int[10];


            System.out.print ("Enter 10 integers: " );
            for(int i = 0 ; i < 10; i++){
                a[i] = in.nextInt ();
                b[i] = a[i];
            }

            for (int i = 0; i < 10; i++ ){

                System.out.printf ("  %d", b[i] );

            }

            System.out.println("\n Unique values are: ");

            for (int i = 0; i < a.length; i++ ) {
                int count = 0;
                for( int j = 0; j < i; j++) {

                    if (  b[j] == a[i]) {
                        count++;
                    }
                }
                if(count == 0) {
                    System.out.printf ( "\t %d", a[i] );
                }
            }


        }
}

