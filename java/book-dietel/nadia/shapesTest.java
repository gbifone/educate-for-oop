
public class shapesTest {
    public static void main(String[] args) {
        Points point = new Points(19.3 ,8.9);
        System.out.println("Values Of coordinates are \n" + point);
        System.out.println("\n");
        Trapezoid T = new Trapezoid(point,6);
        System.out.println("The area of Trapezoid is:" + T.areaOfShapes(point));
        Parallelogram P = new Parallelogram(point);
        System.out.println("The area of Parallelogram is:" + P.areaOfShapes(point));
        Rectangle R = new Rectangle(point);
        System.out.println("The area of Rectangle is:" + R.areaOfShapes(point));
        Square S = new Square(point);
        System.out.println("The area of Square is:" + S.areaOfShapes(point));
    }
}
