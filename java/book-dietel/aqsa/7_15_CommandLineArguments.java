/**
 * Created by Aqsa on 5/22/2017.
 */
import java.util.Scanner;
public class CommandLineArguments_7_15
{
    public static void main ( String[] args )
    {
        Scanner in = new Scanner ( System.in );
        int[] array;

        System.out.println ("Enter size of array: " );
        int size = in.nextInt();

        if(size > 0 )
        {
            array = new int[size];
        }
        else
        {
            array = new int[10];
        }
        System.out.printf ("%s %8s\n", "Index", "Values" );

        for(int i = 0 ; i < array.length; i++){

            System.out.printf ("%d %8d\n", i , array[i] );
        }
    }
}

