import java.util.Scanner;

/**
 * Created by kinza mustafa on 5/23/2017.
 */
public class HackerRankDay_4 {

    public static void main ( String[] args ) {
        Scanner in = new Scanner ( System.in );
        int t;
        int age;
        t = in.nextInt ( );
        for ( int i = 0 ; i < t ; i++ ) {
            age = in.nextInt ( );
            HackerRankDay_4 object = new HackerRankDay_4 ( 0 );
            object.amIOld ( );
            for ( int j = 0 ; j < 3 ; j++ ) {
                object.yearPasses ( );
            }
            object.amIOld ( );
            System.out.println ( );
        }
    }
    public int age;
        public HackerRankDay_4(int initialAge) {

            if(initialAge < 0)
            {
                System.out.println ( "Age is not Valid, setting age to 0.");
                age = 0;
                System.out.println ( );
            }
            else
            {
                age = initialAge;
            }
        }

        public void amIOld()
        {

            if(age < 13)
            {
                System.out.println ("You are young.");
                System.out.println ( );
            }
            else if(age >= 13 && age < 18)
            {
                System.out.println ("You are a teenager.");
                System.out.println ( );
            }
            else if(age >= 18)
            {
                System.out.println ( "You are old.");
                System.out.println ( );
            }
        }

        public void yearPasses()
        {
            age ++;
        }


}
