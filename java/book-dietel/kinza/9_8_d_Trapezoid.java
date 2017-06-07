public class Trapezoid extends Quadrilateral {
    public double height;
    public double base1;
    public double base2;

    public Trapezoid ( double height, double base1, double base2 ) {
        this.height = height;
        this.base1 = base1;
        this.base2 = base2;
    }
    public double areaOfTrapezoid ( ){
        Double area;
        area = (( base1 + base2  )/ 2 ) * height ;
        return area;
    }
}