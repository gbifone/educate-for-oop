public class Cube extends ThreeDimensionalShapes {
    public Cube ( double s ) {
        super ( s );
    }

    @Override
    public double areaOfShapes( ){
        double edge = getSide ();
        return  6 * edge * edge ;
    }
    @Override
    public double volumeOf3DShapes(){
        return Math.pow(getSide(),3);
    }

    @Override
    public String toString ( ) {
        return super.toString () + "=> Cube";
    }
}
