public class Points {
    public double x;
    public double y;

    public Points( double X, double Y ) {
        x = X;
        y = Y;
    }
    public double getX() { return x; }

    public double getY() { return y; }

    public String toString() {
        return ( getX() + ", " + getY() );
    }
}
