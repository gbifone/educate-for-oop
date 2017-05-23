/**
 * Created by kinza mustafa on 5/21/2017.
 */

public class DeckOfCards7_10 {
    public static void main ( String[] args ) {
        DeckOfCards myDeckOfCards = new DeckOfCards ( );
        myDeckOfCards.shuffle ( );
        for ( int i = 1 ; i <= 52 ; i++ ) {
            System.out.printf( "%-19s", myDeckOfCards.dealCard() );
            if (i%4 == 0 )
                System.out.println();

        }
    }
}
