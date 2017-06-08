public class Circle extends TwoDimensionalShapes {

    public Circle ( double s ) {
        super ( s );
    }

    @Override
    public double areaOf2DShapes(){
        return  6 * getSide() * getSide();
    }

    @Override
    public String toString ( ) {
        return super.toString ()+ "=> Circle";
    }
}
