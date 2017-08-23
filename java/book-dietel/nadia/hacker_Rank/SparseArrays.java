import java.util.Scanner;

public class SparseArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of 1st String");
        int n = scan.nextInt();
        String[] stringArr = new String[n];

        System.out.println("Enter value in 1st string array");
        for (int i = 0; i < n; i++){
            stringArr[i] = scan.next();
        }

        System.out.println("Enter number of 2nd String");
        int q = scan.nextInt();
        System.out.println("Enter value in 2nd string array");
        for (int i = 0; i < q; i++){
            String stringQue = scan.next();

            int occNum = 0;
            for (int j = 0; j < n; j++){
                if (stringQue.equals(stringArr[j])) occNum++;
            }
            System.out.println(occNum);
        }
    }
}

