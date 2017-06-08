
public class Sphere extends ThreeDimensionalShape{
    public Sphere(double side) {
        super(side);
    }

    double side = getSide();
    @Override
    public  double areaOFShapes() {

        return 4 * Math.PI * side * side;
    }

    @Override
    public double volumeOf3D() {
        return 4/3 * Math.PI *(Math.pow(side ,3));
    }

    @Override
    public String toString() {
        return super.toString() + " :Sphere";
    }
}
