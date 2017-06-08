public class Rectangle extends Quadrilateral {
    public double width;
    public double height;

    public Rectangle ( double width, double height ) {
        this.width = width;
        this.height = height;
    }
    public double areaOfRectangle ( ) {
        double area;
        area = width * height;
        return area;
    }

}
