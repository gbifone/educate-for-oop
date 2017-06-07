
public class Tetrahedron extends ThreeDimensionalShape{
    public Tetrahedron(double side) {
        super(side);
    }

    @Override
    public double areaOFShapes() {
        return Math.sqrt(3) * getSide() * getSide();
    }

    @Override
    public double volumeOf3D() {
        return (Math.pow(getSide(),3))/ ( 6 * Math.sqrt(2) );
    }

    @Override
    public String toString() {
        return super.toString() + " :Tetrahedron";
    }
}
