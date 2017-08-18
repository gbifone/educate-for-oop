import java.util.Scanner;

public class Day_29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Number of test cases:");
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            System.out.println(solve(n, k));
        }

        in.close();
    }

    static int solve(int n, int k) {
        int result = 0;
        for (int A = 1; A <= n; A++) {
            for (int B = A + 1; B <= n; B++) {
                int current = A & B;
                if (current > result && current < k) {
                    result = current;
                }
            }
        }
        return result;
    }
}
