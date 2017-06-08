public abstract class ThreeDimensionalShapes extends Shapes {

    public ThreeDimensionalShapes ( double s ) { super( s ); }

    public abstract double areaOf3DShapes( );

    public abstract  double volumeOf3DShapes();

    @Override
    public String toString ( ) {
        return "ThreeDimensionalShapes";
    }
}