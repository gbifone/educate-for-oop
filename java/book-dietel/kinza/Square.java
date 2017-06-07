public class Square extends Quadrilateral {

    public Square ( Points p ) { super( p ); }

    @Override
    public double areaOfShapes ( Points p ) {
        double area;
        double side = p.getX ();
        area = side * side;
        return area;
    }
}
