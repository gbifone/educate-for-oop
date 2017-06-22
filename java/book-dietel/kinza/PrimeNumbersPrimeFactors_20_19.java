import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PrimeNumbersPrimeFactors_20_19 {
    public static void main ( String[] args ) {
        Scanner in = new Scanner ( System.in );
        System.out.println ( "Enter the number:" );
        Integer num = in.nextInt ( );
        Set<Integer> prime = primeFactors ( num );
        for( Integer p: prime){
            System.out.println ( p );
        }
    }

    public static Set<Integer> primeFactors(Integer number) {
            Set<Integer> primefactors = new HashSet <> ();
            long copyOfInput = number;
            for ( int i = 2 ; i <= copyOfInput; i++) {
                if ( copyOfInput % i == 0) {
                    primefactors.add ( i );
                    copyOfInput /= i;
                    i--;
                }
            }
            return primefactors;
    }
}
