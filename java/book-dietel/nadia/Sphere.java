
public class Sphere extends ThreeDimensionalShape{
    public Sphere(double side) {
        super(side);
    }

    @Override
    public  double areaOFShapes() {
        return 4 * Math.PI * getSide() *getSide();
    }

    @Override
    public double volumeOf3D() {
        return 4/3 * Math.PI *(Math.pow(getSide() ,3));
    }

    @Override
    public String toString() {
        return super.toString() + " :Sphere";
    }
}
