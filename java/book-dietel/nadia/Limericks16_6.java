import java.util.Random;

public class Limericks16_6 {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] index = new int[5];
        String[] ranVerse = new String[5];
        String[] verse ={"There was an Old Man with a beard" ,
                        "Who said, 'It is just as I feared" ,
                        "Two Owls and a Hen," ,
                        "Four Larks and a Wren," ,
                        "Have all built their nests in my beard" };
        for(int i = 0; i < 5; i++){
            index[i] = ran.nextInt(4);
            System.out.println(index[i]);
        }
            if (verse[index[0]].endsWith("ed")) {
                ranVerse[0] = verse[index[0]];
            if (verse[index[1]].endsWith("ed"))
                ranVerse[1] = verse[index[1]];
            if(verse[index[2]].endsWith("ed"))
                ranVerse[2] = verse[index[2]];
            if (verse[index[3]].endsWith("en"))
                ranVerse[3] = verse[index[3]];
            if(verse[index[4]].endsWith("en"))
                ranVerse[4] = verse[index[4]];
            }
        for(int i = 0; i < 5; i++){
            System.out.println(ranVerse[i]);
        }
    }
}
