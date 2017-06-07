public class Quadrilateral {
    protected Points p;

    public Quadrilateral ( ) { }

    public Quadrilateral ( Points p) {
        this.p = p;
    }
    public Points getP ( ) { return p; }

    public void setP ( Points p ) { this.p = p; }

    @Override
    public String toString ( ) {
        return "Quadrilateral{" + "p = " + p + '}';
    }

    public double areaOfShapes( Points p ) {
        double area;
        double base = p.getX();
        double height = p.getY();
        area = base * height;
        return area;
    }
}
