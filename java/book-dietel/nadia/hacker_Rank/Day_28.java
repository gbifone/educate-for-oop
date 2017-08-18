import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Day_28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        ArrayList<String> names = new ArrayList<>();

        for(int i = 0; i < N; i++){
            System.out.println("Enter FirstName:");
            String firstName = in.next();
            System.out.println("Enter Email:");
            String emailID = in.next();

            if(emailID.contains("@gmail.com")){
                names.add(firstName);
            }
        }
        Collections.sort(names);
        for(String name : names){
            System.out.println(name);
        }
    }
}
