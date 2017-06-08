public class Parallelogram extends Quadrilateral {
    public double base;
    public double height;

    public Parallelogram ( double base, double height ) {
        this.base = base;
        this.height = height;
    }
    public double areaOdParallelogram( ) {
        double area;
        area = base * height;
        return area;
    }
}
