public class RationalNumberMain {
    public static void main ( String[] args ) {
        Rational rational = new Rational (2, 4);

        rational.addRational (4,6,3,8  );
        rational.subtractRational ( 3,5,7,4 );
        rational.multiplyRational ( 4,6,7,3 );
        rational.divideRational ( 8,5,7,3 );
    }
}
