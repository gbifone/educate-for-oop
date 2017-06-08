public class Trapezoid extends Quadrilateral {
    private double height;

    public Trapezoid ( Points p, double height ) {
        super( p );
        this.height = height;
    }
    @Override
    public double areaOfShapes ( Points p ){
        double area;
        double base1 = p.getX();
        double base2 = p.getY();
        area = (( base1 + base2  )/ 2 ) * height ;
        return area;
    }
}