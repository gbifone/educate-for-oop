
public class Tetrahedron extends ThreeDimensionalShape{
    public Tetrahedron(double side) {
        super(side);
    }

    double side = getSide();
    @Override
    public double areaOFShapes() {
        return Math.sqrt(3) * side * side;
    }

    @Override
    public double volumeOf3D() {
        return (Math.pow(side,3))/ ( 6 * Math.sqrt(2) );
    }

    @Override
    public String toString() {
        return super.toString() + " :Tetrahedron";
    }
}
