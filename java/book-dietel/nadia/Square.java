
public class Square extends TwoDimensionalShape {

    public Square(double side) {
        super(side);
    }

    @Override
    public double areaOFShapes() {
        double side =getSide();
        return side * side;
    }

    @Override
    public String toString() {
        return super.toString() + " :Square";
    }
}
