/**
 * Created by Nadia on 5/17/2017.
 */
public class Table6_34 {
        public static void main(String[] args) {


            System.out.printf ("%-20s\t\t%-20s\t\t%-20s\t\t%-20s\n","Decimal","Binary","Octal","Hexadecimal");


            for (int i = 1; i <= 256; i++) {
                String binary  = BinaryForm ( i );
                String octal = OctalForm(i );
                String hexa = HexadecimalForm( i );

                System.out.printf ("%-22s\t\t%-22s\t\t%-22s\t\t%-24s\n",i, binary, octal, hexa);


            }
        }
    private static String BinaryForm ( int a){
        return (Integer.toBinaryString( a ));

    }
    private static String OctalForm ( int a){
        return  Integer.toOctalString( a );

    }
    private static String HexadecimalForm ( int a){
        return Integer.toHexString( a );

    }
}




