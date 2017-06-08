public abstract class Shapes {
    protected double side;

    public Shapes ( double side ) {
        this.side = side;
    }

    public double getSide ( ) { return side; }

    public void setSide ( double x ) { this.side = side; }

    @Override
    public String toString ( ) {
        return "Shapes{" + "side=" + side + '}';
    }
}
