import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int N = in.nextInt();
        System.out.println("Enter number of queries");
        int Q = in.nextInt();
        List<Integer>[] sequences = new List[N];
        for (int n_i = 0; n_i < N; n_i++) {
            sequences[n_i] = new ArrayList<>();
        }
        int lastAnswer = 0;
        for (int i = 0; i < Q; i++) {
            System.out.println("Enter index of sequence(1 or 2)");
            int t = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            List<Integer> sequence = sequences[(x^lastAnswer)%N];
            switch (t) {
                case 1:
                    sequence.add(y);
                    break;
                case 2:
                    lastAnswer = sequence.get(y%sequence.size());
                    System.out.println(lastAnswer);
                    break;
            }
        }
    }
}
