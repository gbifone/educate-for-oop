
public class Cube extends ThreeDimensionalShape{
    public Cube(double side) {
        super(side);
    }

    double side = getSide();
    @Override
    public double areaOFShapes() {
        return 6 * side * side;
    }

    @Override
    public double volumeOf3D() {
        return Math.pow(getSide(),3);
    }

    @Override
    public String toString() {
        return super.toString() + " :Cube";
    }
}
