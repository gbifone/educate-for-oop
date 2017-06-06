import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Aqsa on 5/23/2017.
 */
public class HackerRankDay_1 {
    public static void main ( String[] args ) {

        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        int i2 = 12;
        double d2 = 4.0;
        String s2 = "is the best place to learn and practice coding!";
        int result;
        double result2;

        result = i + i2;
        result2 = d + d2;
        System.out.println ( result );
        System.out.printf ( "%.1f\n", result2 );
        System.out.println ( ( s + s2 ) );
    }
}
