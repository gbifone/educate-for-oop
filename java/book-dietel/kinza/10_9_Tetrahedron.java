public class Tetrahedron extends ThreeDimensionalShapes {

    public Tetrahedron ( double s) { super ( s ); }

    @Override
    public double areaOfShapes ( ){
        double edge = getSide ();
        return Math.sqrt(3) * edge * edge;
    }

    @Override
    public double volumeOf3DShapes(){
        return (Math.pow(getSide(),3))/ ( 6 * Math.sqrt(2) );
    }

    @Override
    public String toString ( ) {
        return super.toString () + "=> Tetrahedron";
    }
}
