import java.util.Scanner;

public class SMSLanguage_16_28 {
    public static void main ( String[] args ) {
        Scanner in = new Scanner ( System.in );
        String[] smsString = {"THNX", "HAND", "CU", "CUL8R", "hh", "c", "NP", "n", "ATM", "BTW", "ASAP", "OMG", "LOL", "MSG",
                                "PLZ", "u", "IMO", "BFF", "JK", "k"};
        String[] string = {"Thanks", "Have A Nice Day", "See You", "See You Later", "Haha", "see", "No problem",
                            "and", "At The Moment", "By The Way", "As Soon As Possible", "Oh My God", "Laughing Out Loud", "Message",
                            "Please", "You", "In My Opinion", "Best Friend Forever", "Just Kidding", "okay"};

        System.out.println ("Enter your message in the range of 160 characters: " );
        String message = in.nextLine ();

        String[] tokens = message.split ( " " );

        for( int i = 0; i < tokens.length; i++ ){
            for ( int j = 0; j < smsString.length; j++ ) {
                if ( tokens[ i ].equalsIgnoreCase ( smsString[ j ] )){
                    System.out.print (string[ j ] + " " );
                }
            }
        }
    }
}
