/**
 * Created by Aqsa on 5/23/2017.
 */
import java.util.Scanner;
public class HackerRankDay_4
{

    public
    int age;
    public HackerRankDay_4(int initialAge)
    {
        // Add some more code to run some checks on initialAge
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
        // Do some computations in here and print out the correct statement to the console
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
        // Increment the age of the person in here
        age ++;
    }

    public static void main ( String[] args )
    {
        Scanner obj = new Scanner ( System.in );
        int t;
        int age;
        t = obj.nextInt ();
        for(int i=0; i < t; i++)
        {
            age = obj.nextInt ();
            HackerRankDay_4 object= new HackerRankDay_4( 0);
            object.amIOld();
            for(int j=0; j < 3; j++)
            {
                object.yearPasses();
            }
            object.amIOld();
            System.out.println ( );
        }
    }
}
