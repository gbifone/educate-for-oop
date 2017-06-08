public class Circle extends TwoDimensionalShapes {

    public Circle ( double s ) {
        super ( s );
    }

    @Override
    public double areaOfShapes(){
        double radius = getSide ();
        return  6 * radius * radius;
    }

    @Override
    public String toString ( ) {
        return super.toString ()+ "=> Circle";
    }
}
