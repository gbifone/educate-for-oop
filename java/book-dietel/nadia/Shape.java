
public abstract class Shape {
    private double side;

    public Shape(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public abstract double areaOFShapes();

    @Override
    public String toString() {
        return "Shape{" +
                "side=" + side +
                '}';
    }
}
