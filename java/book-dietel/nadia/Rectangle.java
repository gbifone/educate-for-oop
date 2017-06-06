
public class Rectangle extends Quadrilateral {
    public Rectangle(Points point) {
        super(point);
    }

    public double areaOfShapes(Points point) {
        double length = point.getX();
        double width = point.getY();
        double area = length * width;
            return area;
    }
}
