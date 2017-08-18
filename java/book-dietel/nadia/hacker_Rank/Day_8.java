/**
 * Created by Nadia on 5/24/2017.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day_8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=in.nextInt();
        in.nextLine();

        Map<String,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the name: ");
            String name=in.nextLine();
            System.out.println("Enter the Phone Number");
            int phone=in.nextInt();
            in.nextLine();
            map.put(name, phone);
        }
        System.out.println("Enter the name to search");
        String s=in.nextLine();
        while(in.hasNext(s))
        {

            if (map.get(s) == null){
                System.out.println("Not found");
            } else {
                System.out.println(s+ "=" + map.get(s));
            }
        }

        in.close();
    }
}

