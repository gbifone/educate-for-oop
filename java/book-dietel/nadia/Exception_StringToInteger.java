import java.util.Scanner;

public class Exception_StringToInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String S = in.next();
        try{
            int s = Integer.parseInt(S);
            System.out.println(s);

        }
        catch(Exception e){
            System.out.println("Bad String");
        }
    }
}
