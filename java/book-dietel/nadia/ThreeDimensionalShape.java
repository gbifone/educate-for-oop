
public abstract class ThreeDimensionalShape extends Shape {

    public ThreeDimensionalShape(double side) {
        super(side);
    }
    public abstract double areaOFShapes();

    public abstract double volumeOf3D();

    @Override
    public String toString() {
        return "ThreeDimensionalShape";
    }
}
