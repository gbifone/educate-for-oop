import java.util.Scanner;

public class HackerRankDay_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in);
        System.out.println("Enter a string:");
        String S = in.next();
        try{
            int n = Integer.parseInt(S);
            System.out.println( n );

        }
        catch(Exception e){
            System.out.println("Bad String");
        }
    }
}
