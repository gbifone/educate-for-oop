import java.util.Scanner;

public class ComparingPortionsOfStrings16_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st String.");
        String s1 = in.nextLine();
        System.out.println("Enter 2nd String.");
        String s2 = in.nextLine();

        if(s1.regionMatches(0,s2,0,3))
            System.out.println("First 3 character of s1 match to s2");
        else
            System.out.println("First 3 character of s1 does not match to s2");
        if(s1.equalsIgnoreCase(s2))
            System.out.printf( "%s equals %s with case ignored\n", s1, s2 );
        else
            System.out.println( "s3 does not equal s4" );
    }
}
