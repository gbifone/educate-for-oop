import java.util.Scanner;

public class Day_27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("5");
        System.out.println("4 3");
        System.out.println("-1 0 4 2");
        System.out.println("5 3");
        System.out.println("0 1 -2 -6 9");
        System.out.println("6 4");
        int t;
        t = in.nextInt();

        while(t--){
               long  nos;
               int pw;
               int students[10000];

               int arrived=0,notarrived=0;
               nos = in.nextInt();
               pw = in.nextInt();
            for(int i=0;i<nos;i++) {
                in.nextInt(students[i]);
            }
            for(int j=0;j<nos;j++) {
                if(students[j]<=0){
                    arrived++;
                }else{
                    notarrived++;
                }
            }
            if(arrived>=pw){
                System.out.println("NO"); // Class not cancelled
            }else{
                System.out.println("YES");// Class Cancelled
            }
        }
    }
}
