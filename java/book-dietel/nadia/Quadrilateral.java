
public class Quadrilateral {
    protected Points Point;

    public Quadrilateral(Points point) {
        Point = point;
    }

    public Points getPoint() {
        return Point;
    }

    public void setPoint(Points point) {
        Point = point;
    }

    @Override
    public String toString() {
        return "points:" + getPoint();
    }
}
