/**
 * Created by Nadia on 5/24/2017.
 */
import java.util.Scanner;

public class Day_7 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int n;
        System.out.println( "Enter th size of array");
         n = obj.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0;arr_i < n;arr_i++){
             arr[arr_i] = obj.nextInt();
        }
        for(int arr_i = n-1; arr_i >= 0; arr_i--){
            System.out.print( arr[arr_i]);
            System.out.print(" ");
        }
    }
}
