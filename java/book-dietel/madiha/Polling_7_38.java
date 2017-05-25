/**
 * Created by TOSHIBA on 5/24/2017.
 */
import java.util.Scanner;

public class Polling_7_38 {
    public static void main ( String[] args ) {

        Scanner poll = new Scanner( System.in );
         int[][] response = new int[5][10];
         int sum = 0;
         double avg = 0.0;

        for( int i = 0; i < 5; i++ ){  // rows
            for ( int j = 0; j < 5; j++){  // columns
                response[i][j] = poll.nextInt();
            }
        }
        String[] topics = {"Environmental" , "Education", "Corruption", "Unemployment", "Health"};

        for ( int rows = 0; rows < 5; rows++){
            System.out.print( topics[rows] + "\t");
            for( int columns = 0; columns < 9; columns++) {
                System.out.print( response[columns][rows] + "\t" );

            }
            System.out.println("");
        }
    }
}
