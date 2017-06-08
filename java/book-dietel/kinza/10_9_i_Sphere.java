public class Sphere extends ThreeDimensionalShapes {

    public Sphere ( double s ) {
        super ( s );
    }

    @Override
    public double areaOf3DShapes ( ){
        double radius = getSide ();
        return  4 * Math.PI * radius * radius ;
    }
    @Override
    public double volumeOf3DShapes(){
        return  4/3 * Math.PI *(Math.pow(getSide() ,3));
    }

    @Override
    public String toString ( ) {
        return super.toString () + "=> Sphere";
    }
}
