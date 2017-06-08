public class Square extends TwoDimensionalShapes {
    public Square ( double s ) {
        super ( s );
    }

    @Override
    public double areaOf2DShapes () {
        return getSide () * getSide ();
    }
    @Override
    public String toString ( ) {
        return super.toString () + "=> Square";
    }
}
