
public class Circle extends TwoDimensionalShape{
    public Circle(double side) {
        super(side);
    }

    @Override
    public double areaOFShapes() {
        return Math.PI * (getSide() * getSide());
    }

    @Override
    public String toString() {
        return super.toString() + " :Circle";
    }
}
