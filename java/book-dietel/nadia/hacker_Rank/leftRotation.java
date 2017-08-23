import java.util.Scanner;

public class leftRotation {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter size of array:");
            int n = in.nextInt();
            System.out.println("Enter number of rotation");
            int d = in.nextInt();
            int[] a = new int[n];
            System.out.println("Enter values in array");
            for(int a_i = 0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            int[] result = leftRotation(a, n, d);
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
            }
            System.out.println("");


            in.close();
        }
        public static int[] leftRotation(int[] a, int n, int d) {
            int[] out = new int[n];
            int newIndex;
            for(int i = 0; i < n; i++)
            {
                newIndex = (i + d) % n;
                out[i] = a[newIndex];
            }
            return out;
        }
    }
