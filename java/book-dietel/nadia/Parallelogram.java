
public class Parallelogram  extends Quadrilateral{
    public Parallelogram(Points point) {
        super(point);
    }

    public double areaOfShapes(Points point) {
        double base = point.getX();
        double height = point.getY();
        double area = (base * height);
        return area;
    }
}
