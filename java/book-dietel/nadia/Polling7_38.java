/**
 * Created by Nadia on 5/25/2017.
 */
import java.util.Scanner;

public class Polling7_38 {
    public static void main ( String[] args ) {

        Scanner poll = new Scanner( System.in );
        int[][] response = new int[5][10];
        int sum = 0;
        double avg = 0.0;
        double max = response[0][8];
        double min = response[0][8];

        for (int i = 0; i < 5; i++) {  // rows
            for (int j = 0; j < 9; j++) {  // columns
                response[i][j] = poll.nextInt( );
            }
        }
        String[] topics = {"Environmental ", "Education     ", "Corruption    ", "Unemployment", "Health      "};
        System.out.printf( "%13s %15s %12s %10s %10s %10s %10s %10s %10s %10s %10s \n", "Issues", "user 1", "user 2", "user 3"
                , "user 4", "user 5", "user 6", "user 7", "user 8", "user 9", "Average" );
        for (int rows = 0; rows < 5; rows++) {
            System.out.print( topics[rows] + "\t" );
            for (int columns = 0; columns < 9; columns++) {
                System.out.printf( " %10d", response[rows][columns] );
                sum = sum + response[rows][columns];
            }
            avg = sum / 9;
            System.out.printf( "%16f \n", avg );
            if (response[rows][8] > max) {
                max = response[rows][8];
            } else {
                min = response[rows][8];
            }
        }
        System.out.println( " highest average is = " + max );
        System.out.println( " minimum average is = " + min );

    }
}

