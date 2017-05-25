/**
 * Created by Aqsa on 5/23/2017.
 */
import java.util.Scanner;
public class HackerRankDay_2
{
    public static void main ( String[] args )
    {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        double mealCost=0;
        int tipPercent=0;
        int taxPercent=0;

        Scanner obj = new Scanner ( System.in );

        double tip, tax, totalCost;
        mealCost = obj.nextDouble ();
        tipPercent= obj.nextInt ();
        taxPercent = obj.nextInt ();
        tip = mealCost * (tipPercent/100.0);
        tax = mealCost * (taxPercent/100.0);
        totalCost = mealCost + tip + tax;

        double y = Math.floor(totalCost+.5);
        System.out.println ("The total meal cost is"+ y +" dollars.");
    }
}
