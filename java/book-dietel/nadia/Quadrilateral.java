
public class Quadrilateral {
    protected Points Point;

    public Quadrilateral(){

    }

    public Quadrilateral(Points point) {
        Point = point;
    }

    public Points getPoint() {
        return Point;
    }

    public void setPoint(Points point) {
        Point = point;
    }


    public double areaOfShapes(Points point) {
        double base = point.getX();
        double height = point.getY();
        double area = (base * height);
        return area;
    }

    @Override
    public String toString() {
        return "points:" + getPoint();
    }
}
