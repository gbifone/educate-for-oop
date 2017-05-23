/**
 * Created by kinza mustafa on 5/21/2017.
 */
public class Cards {
    private String face;
    private String suit;

    public Cards( String cardFace, String cardSuit ) {
        face = cardFace;
        suit = cardSuit;
    }

    public String toString(){
        return face + " of " + suit;
    }

}
