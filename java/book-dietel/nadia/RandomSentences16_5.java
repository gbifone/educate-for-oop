import java.util.Random;

public class RandomSentences16_5 {
    private static String[] articles = {"the", "a", "one", "some", "any" };
    private static String[] nouns = {"boy", "girl", "dog", "town", "car"};
    private static String[] verb = { "drove", "jumped", "ran", "walked", "skipped" };
    private static String[] preposition = {"to", "from", "over", "under", "on"};
    public static void main(String[] args) {

        System.out.println("Sentence picked out at random ");
        for(int i=0; i < 20; i++){
            System.out.println(randomSentence());
        }
    }
    public static String randomSentence(){
        Random random = new Random();
        int[] index = new int[6];
        String sent = new String();

        for(int i = 0; i < 6; i++){
            index[i] = random.nextInt(5);
        }
        sent = sent.concat(articles[index[0]] .concat( " " .concat( nouns[index[1]] .concat( " " .concat( verb[index[2]]
                .concat(" " .concat(preposition[index[3]].concat(" " .concat( articles[index[4]] .concat(" "
                        .concat(nouns[index[5]].concat("."))))))))))));
        return sent;
    }
}
