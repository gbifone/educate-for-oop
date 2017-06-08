public class Square extends TwoDimensionalShapes {
    public Square ( double s ) {
        super ( s );
    }

    @Override
    public double areaOfShapes () {
        double side = getSide ();
        return side * side;
    }
    @Override
    public String toString ( ) {
        return super.toString () + "=> Square";
    }
}
