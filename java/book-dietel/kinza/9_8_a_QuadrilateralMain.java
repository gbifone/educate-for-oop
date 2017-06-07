public class QuadrilateralMain_9_8 {
    public static void main ( String[] args ) {
        Quadrilateral q = new Quadrilateral( 3, 2, 1, 4, 5, 7, 2, 4);
        Trapezoid     t = new Trapezoid ( 5,6,10 );
        Parallelogram p = new Parallelogram ( 8.6, 10.3 );
        Rectangle     r = new Rectangle( 4, 2);
        Square        s = new Square( 3);

        double trapezoidArea = t.areaOfTrapezoid ();
        double parallelogramArea = p.areaOdParallelogram ();
        double rectangleArea = r.areaOfRectangle ();
        double squareArea = s.areaOfSquare ();

        System.out.println( "Quadrilateral        : " + q.toString() );
        System.out.println( "Area of Trapezoid    : "     + trapezoidArea );
        System.out.println( "Area of Parallelogram: " + parallelogramArea );
        System.out.println( "Area of Rectangle    : " + rectangleArea );
        System.out.println( "Area of Square       : " + squareArea );
    }
}
