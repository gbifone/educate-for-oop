public abstract class TwoDimensionalShapes extends Shapes {

    public TwoDimensionalShapes ( double s ) {
        super( s );
    }

    public abstract double areaOf2DShapes();

    @Override
    public String toString ( ) {
        return "TwoDimensionalShapes";
    }

}
