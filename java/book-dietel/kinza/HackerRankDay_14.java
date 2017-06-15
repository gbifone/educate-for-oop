import java.util.Scanner;

public class HackerRankDay_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}

class Difference {
    private int[] elements;
    public  int   maximumDifference;

    Difference( int[] elements){
        this.elements = elements;
    }

    public int computeDifference(){
        int max = 0;
        for (int i = 0; i < elements.length-1; i++) {
            for (int j = i+1; j < elements.length; j++) {
                int difference = Math.abs(elements[i] - elements[j]);
                if (difference > max)
                    max = difference;
            }
        }
        maximumDifference = max;
        return maximumDifference;
    }
}