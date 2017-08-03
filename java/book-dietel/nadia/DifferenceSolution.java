import java.util.Scanner;

public class DifferenceSolution {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter length of array: ");
            int n = sc.nextInt();
            int[] a = new int[n];
            System.out.println("Enter values: ");
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            sc.close();
            Difference difference = new Difference(a);
            difference.computeDifference();
            System.out.print(difference.maximumDifference);
        }
}
