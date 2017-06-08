public class Triangle extends TwoDimensionalShapes {
    private double height;
    public Triangle ( double s, double height) {
        super ( s );
        this.height = height;
    }

    public double getHeight ( ) { return height; }

    public void setHeight ( double height ) { this.height = height; }

    @Override
    public double areaOfShapes ( ){
        return  (getSide () * getHeight ()) / 2 ;
    }

    @Override
    public String toString ( ) {
        return super.toString () + "=> Triangle";
    }
}
