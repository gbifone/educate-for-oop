import java.util.Random;

/**
 * Created by kinza mustafa on 5/21/2017.
 */
public class DeckOfCards {
    private Cards[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;

    private static final Random randomNumbers = new Random();

    public DeckOfCards() {
        currentCard = 0;
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        deck = new Cards[ NUMBER_OF_CARDS ];
        currentCard = 0;

        for ( int count = 0; count < deck.length; count++ ) {
            deck[ count ] = new Cards( faces[ count % 13 ], suits[ count / 13 ] );
        }
    }

    public void shuffle() {
        currentCard = 0;

        for ( int first = 0 ; first < deck.length ; first++ ) {
            int second = randomNumbers.nextInt( NUMBER_OF_CARDS );
            Cards temp = deck[ first ];
            deck[ first ] = deck[ second ];
            deck[ second ] = temp;
        }
    }

    public Cards dealCard()  {
        if (currentCard < deck.length) {
            return deck[ currentCard++ ];
        }
        else {
            return null;
        }
    }
}
