import java.util.Scanner;

/**
 * Created by kinza mustafa on 5/23/2017.
 */
public class HackerRankDay_2 {
    public static void main ( String[] args ) {
        Scanner in = new Scanner ( System.in );
        double mealCost = 12;
        int tip = 20;
        int tax = 8;
        double tipPercent;
        double taxPercent;
        double totalCost;
        double Total;

        tipPercent = mealCost * tip / 100;
        taxPercent = mealCost * tax / 100;

        totalCost = mealCost + tipPercent + taxPercent;
        Total = Math.round(totalCost);

        System.out.println ( "The total meal cost is " + Total + " dollars.");
    }
}
