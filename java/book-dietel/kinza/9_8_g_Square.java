public class Square extends Quadrilateral {
    public double side;

    public Square ( double side ) {
        this.side = side;

    }
    public double areaOfSquare ( ) {
        double area;
        area = side * side;
        return area;
    }
}
