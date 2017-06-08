
public class Triangle extends TwoDimensionalShape{
    private double height;

    public Triangle(double side , double height) {
        super(side);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double areaOFShapes() {
        double side = getSide();
        return (side * getHeight()) / 2;
    }

    @Override
    public String toString() {
        return super.toString() + " :Triangle{" +
                "height=" + height +
                '}';
    }
}
