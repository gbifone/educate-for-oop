/**
 * Created by TOSHIBA on 5/22/2017.
 */
import java.util.Scanner;

public class AirLineReservationSystem {

    public static void main ( String[] args ) {
        Scanner scan = new Scanner ( System.in );
        boolean running = true;

        while ( running ) {
            booking ( );
            System.out.println ( "Type '-1' to quit, else any key to continue." );
            int quit = scan.nextInt ( );
            if ( quit == - 1 )
                running = false;
            else
                running = true;
        }
    }

    public static void booking ( ) {
        Scanner in = new Scanner ( System.in );

        System.out.println ( "Press 1 for first and 2 for economy class." );
        int choice = in.nextInt ( );
        if ( choice == 1 )
            firstClass ();
        else if ( choice == 2 )
            economyClass ();
        else
            System.out.println ( "Invalid selection" );
    }

    public static void firstClass ( ) {
        Scanner in = new Scanner ( System.in );
        boolean[] firstClass = new boolean[ 5 ];
        int FirstClassSeat= 0;
        int EconomyClassSeat = 0;


        if ( FirstClassSeat < 5 ) {
            for ( int i = 0 ; i < firstClass.length ; i++ ) {
                if ( ! firstClass[ i ] ) {
                    firstClass[ i ] = true;
                    System.out.println ( "First Class. Seat number: " + ( i + 1 ) );
                    FirstClassSeat++;
                    break;
                }
            }
        } else if ( EconomyClassSeat < 5 ) {
            System.out.println ( "No more 1st class. Press 2 if you would like to book an economy class ticket." );
            int choice = in.nextInt ( );
            if ( choice == 2 )
                economyClass ( );
            else
                System.out.println ( "The next flight leaves in 3 hours." );
        }
    }

    public static void economyClass ( ) {
        Scanner in = new Scanner ( System.in );
        boolean[] economyClass = new boolean[ 5 ];
        int EconomyClassSeat = 0;
        int FirstClassSeat = 0;

        if ( EconomyClassSeat < 5 ) {
            for ( int i = 0 ; i < economyClass.length ; i++ ) {
                if ( ! economyClass[ i ] ) {
                    economyClass[ i ] = true;
                    System.out.println ( "Economy Class. Seat number: " + ( i + 6 ) );
                    EconomyClassSeat++;
                    break;
                }
            }
        } else if ( FirstClassSeat < 5 ) {
            System.out.println ( "No more economy. Press 1 if you would like to book an first class ticket." );
            int choice = in.nextInt ( );
            if ( choice == 1 )
                firstClass ( );
            else
                System.out.println ( "The next flight leaves in 3 hours." );
        }
    }

}