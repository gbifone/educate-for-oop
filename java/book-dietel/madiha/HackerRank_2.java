import java.util.Scanner;

/**
 * Created by TOSHIBA on 5/23/2017.
 */
public class HackerRank_2 {
    public static void main ( String[] args ) {
        Scanner hack = new Scanner( System.in );
        double meal;

        double tipPercent, taxPercent, total;
        System.out.println(" Enter the value of meal= " );
        meal = hack.nextDouble();
        System.out.println(" Enter the value of tip percent = " );
        tipPercent = hack.nextDouble();
        System.out.println(" Enter the value of tax percent = " );
        taxPercent = hack.nextDouble();
        tipPercent = ( meal * tipPercent ) / 100;
        taxPercent = ( meal * taxPercent ) / 100;
        total = meal + tipPercent + taxPercent;
        System.out.println( "The total meal cost is " + (total + 1 ) +" dollars.");

    }
}
