import java.util.Scanner;

public class TokenizingTelephoneNumbers16_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a telephone number");
        String number = in.nextLine();
        String[] tokens = number.split("-");
        for(String token :tokens){
            System.out.println( token );
        }
    }

}
