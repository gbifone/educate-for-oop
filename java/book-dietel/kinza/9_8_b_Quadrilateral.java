
public class Quadrilateral {
    public Points p1;
    public Points p2;
    public Points p3;
    public Points p4;

    public Quadrilateral ( ) { }

    public Quadrilateral ( double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        this.p1 = new Points ( x1, y1  );
        this.p2 = new Points ( x2, y2  );
        this.p3 = new Points ( x3, y3  );
        this.p4 = new Points ( x4, y4  );
    }
    public Points getP1 ( ) { return p1; }

    public void setP1 ( Points p1 ) { this.p1 = p1; }

    public Points getP2 ( ) { return p2; }

    public void setP2 ( Points p2 ) { this.p2 = p2; }

    public Points getP3 ( ) { return p3; }

    public void setP3 ( Points p3 ) { this.p3 = p3; }

    public Points getP4 ( ) { return p4; }

    public void setP4 ( Points p4 ) { this.p4 = p4; }

    @Override
    public String toString ( ) {
        return ( "p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + ", p4=" + p4 );
    }
}
