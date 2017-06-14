import java.util.Random;

public class RandomSentences_16_5 {
    public static void main(String[] ar) {
        Random rand = new Random (  );

    String[] article = { "the", "a", "one", "some" };
    String[] noun = { "boy", "girl", "dog", "town", "car" };
    String[] verb = { "drove", "jumped", "ran", "walked", "skipped" };
    String[] preposition = { "to", "from", "over", "under", "on" };

    String[] s = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",};

    for ( int i = 0 ; i < 20 ; i++ ) {
        int a = 0 + rand.nextInt (3);
        int n = 0 + rand.nextInt (3);
        int v = 0 + rand.nextInt (3);
        int p = 0 + rand.nextInt (3);

            s[ i ] = s[ i ] + article[ a ];
            s[ i ] = s[ i ] + " " + noun[ n ];
            s[ i ] = s[ i ] + " " + verb[ v ];
            s[ i ] = s[ i ] + " " + preposition[ p ];

            a = 0 + rand.nextInt (3);
            n = 0 + rand.nextInt (3);

            s[ i ] = s[ i ] + " " + article[ a ];
            s[ i ] = s[ i ] + " " + noun[ n ];
        }

        for ( int i = 0; i < 20; i++ ) {
            System.out.print( Character.toUpperCase( s[i].charAt(0) ) );
            for ( int j = 1; j < s[i].length() ; j++ )
                System.out.print( s[i].charAt(j) );
            System.out.println( "." );
        }
    }
}
