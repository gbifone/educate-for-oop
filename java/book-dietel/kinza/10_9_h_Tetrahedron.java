public class Tetrahedron extends ThreeDimensionalShapes {

    public Tetrahedron ( double s) { super ( s ); }

    @Override
    public double areaOf3DShapes ( ){
        return Math.sqrt(3) * getSide() * getSide();
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
