
public class Trapezoid extends Quadrilateral {
    private int h;

    public Trapezoid(Points point, int h) {
        super(point);
        this.h = h;
    }
    @Override
    public double areaOfShapes(Points point){
        double area = (point.getX()+ point.getY())/h;
        return area;
    }

}
