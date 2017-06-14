
import java.util.Scanner;
public class ComparingStrings16_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st String");
        String s1 = scanner.nextLine();
        System.out.println("Enter 2nd String");
        String s2 = scanner.nextLine();
        int result = s1.compareTo(s2);
        System.out.println(result);
        if(result > 0) {
            System.out.println("1st String is grater than 2nd String");
        }
        else if(result == 0){
            System.out.println("1st String is equal to 2nd String");}
        else if(result < 0) {
            System.out.println("1st String is less than 2nd String");
        }
    }
}
