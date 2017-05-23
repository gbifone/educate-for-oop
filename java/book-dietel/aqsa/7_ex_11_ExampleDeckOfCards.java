/**
 * Created by Aqsa on 5/22/2017.
 */
import java.util.Random;
public class ExampleDeckOfCards
{
    private Card[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;
    private static final Random randomNumbers = new Random();
    public ExampleDeckOfCards()
    {
        String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        deck = new Card[ NUMBER_OF_CARDS ];
        currentCard=0;
        for ( int count = 0; count < deck.length; count++ )
            deck[ count ] = new Card( faces[ count % 13 ], suits[ count / 13 ] );
    }
    public void shuffle()
    {
        currentCard = 0;
        for ( int first = 0; first < deck.length; first++ )
        {
            int second = randomNumbers.nextInt ( NUMBER_OF_CARDS );
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }
    public Card dealCard()
    {
        if(currentCard<deck.length)

            return  deck[currentCard++];
        else
            return null;
    }
    public static void main( String[] args )
    {
        ExampleDeckOfCards myDeckOfCards = new ExampleDeckOfCards ( );
        myDeckOfCards.shuffle ( );
        for ( int i=1; i <=52; i++ )
        {
            System.out.printf( "%-19s", myDeckOfCards.dealCard ( ) );
            if ( i % 4 == 0 )
                System.out.println ( );
        }
    }
}
