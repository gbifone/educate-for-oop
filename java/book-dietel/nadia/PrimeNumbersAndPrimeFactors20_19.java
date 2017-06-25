import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PrimeNumbersAndPrimeFactors20_19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<Integer> set = new TreeSet<>();
        int i = 0 , d = 2;
        System.out.println("Enter a whole number");
        int num = in.nextInt();
        for (i = 2; i <= num; i++) {
            if (num % i == 0){
                break;
            }
        }
        if(num == i){
            System.out.println("You enter Prime number");
        }
        else{
            while (num > 1){
                if(num % d == 0){
                    set.add(d);
                    num = num / d;
                }
                else
                    d++;
            }
        }
            System.out.println("Prime factor of the given number is: " + set);
    }
}
