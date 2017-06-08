public class Points {
    private double x;
    private double y;

    public Points( double X, double Y ) {
        this.x = X;
        this.y = Y;
    }
    public double getX() { return x; }

    public void setX ( double x ) { this.x = x; }

    public void setY ( double y ){ this.y = y; }

    public double getY ( ) { return y; }

    @Override
    public String toString() {
        return ( getX() + ", " + getY() );
    }
}
