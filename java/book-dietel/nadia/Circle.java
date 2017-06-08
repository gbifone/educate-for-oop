
public class Circle extends TwoDimensionalShape{
    public Circle(double side) {
        super(side);
    }

    @Override
    public double areaOFShapes() {
        double side = getSide();
        return Math.PI * (side * side);
    }

    @Override
    public String toString() {
        return super.toString() + " :Circle";
    }
}
