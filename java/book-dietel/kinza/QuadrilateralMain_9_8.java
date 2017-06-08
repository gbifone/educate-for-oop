public class QuadrilateralMain_9_8 {
    public static void main ( String[] args ) {
       Quadrilateral q = new Quadrilateral( );
       Points points = new Points ( 5, 7.2 );
        Trapezoid     t = new Trapezoid ( points,6 );
        Parallelogram p = new Parallelogram ( points );
        Rectangle     r = new Rectangle( points );
        Square        s = new Square( points );


        System.out.println( "Quadrilateral        : " + q.toString() );
        System.out.println( "Area of Trapezoid    : " + t.areaOfShapes ( points ) );
        System.out.println( "Area of Parallelogram: " + p.areaOfShapes ( points ) );
        System.out.println( "Area of Rectangle    : " + r.areaOfShapes ( points ) );
        System.out.println( "Area of Square       : " + s.areaOfShapes ( points ) );
    }
}
