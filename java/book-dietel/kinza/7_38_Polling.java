/**
 * Created by Kinza Fatima on 5/24/2017.
 */
import java.util.Scanner;
public class Polling_7_38 {
    public static void main(String[] args) {

        Scanner in = new Scanner( System.in );
        String[] topics = {"Environmental" , "Education", "Corruption", "Unemployment", "Health"};
        int[][] response = new int[5][10];
        int sum = 0;
        double avg = 0.0;

        for( int r = 0; r < 5; r++ ){
            for ( int c = 0; c < 9; c++){
                response[r][c] = in.nextInt();
            }
        }


        for ( int rows = 0; rows < 5; rows++){
            System.out.print( topics[rows] + "\t");
            for( int columns = 0; columns < 10; columns++){
                System.out.print(  response [columns][rows] + "\t\t" );
                sum = sum + response[columns][rows];
            }

            System.out.println("");
        }
    }
}
