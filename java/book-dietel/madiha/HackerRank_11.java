/**
 * Created by TOSHIBA on 5/26/2017.
 */
import java.util.Scanner;

public class HackerRank_11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] arr = new int[6][6];

        System.out.println("Enter value in the 2D Array");
        for(int arr_i = 0;arr_i < 6;arr_i++){
            for(int arr_j = 0;arr_j < 6;arr_j++){
                arr[arr_i][arr_j] = input.nextInt();
                if(arr_j  == 0){
                    System.out.println();
                }
            }
        }
        int maxSum = -21;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = arr[i    ][j] + arr[i    ][j + 1] + arr[i    ][j + 2]
                        + arr[i + 1][j + 1]
                        + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                if (maxSum < sum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println("Maximum Sum is " + maxSum);
    }
}
