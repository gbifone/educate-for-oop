
public class Square extends TwoDimensionalShape {

    public Square(double side) {
        super(side);
    }

    @Override
    public double areaOFShapes() {
        return getSide() * getSide();
    }

    @Override
    public String toString() {
        return super.toString() + " :Square";
    }
}
