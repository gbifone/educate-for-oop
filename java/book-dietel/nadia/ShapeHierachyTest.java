
public class ShapeHierachyTest {
    public static void main(String[] args) {

        Circle circle = new Circle(12);
        Square square = new Square(20);
        Triangle triangle = new Triangle(6.9, 4.8);
        Sphere sphere = new Sphere(7.8);
        Cube cube = new Cube(3.9);
        Tetrahedron tetrahedron = new Tetrahedron(19.2);

        System.out.println("Shape processed individually:\n");
        System.out.printf ( "%s\n%s: %,.2f\n\n", circle, "areaof2D", circle.areaOFShapes ( ) );
        System.out.printf ( "%s\n%s: %,.2f\n\n", square, "areaof2D", square.areaOFShapes ( ) );
        System.out.printf ( "%s\n%s: %,.2f\n\n", triangle, "areaof2D", triangle.areaOFShapes ( ) );
        System.out.printf ( "%s\n%s: %,.2f\n%s: %.2f\n\n", sphere, "areaof3D", sphere.areaOFShapes ( ),"volumeOf3D" ,sphere.volumeOf3D());
        System.out.printf ( "%s\n%s: %,.2f\n%s: %.2f\n\n", cube, "areaof3D", cube.areaOFShapes ( ), "volumeOf3D" ,sphere.volumeOf3D());
        System.out.printf ( "%s\n%s: %,.2f\n%s: %.2f\n\n", tetrahedron, "areaof3D", tetrahedron.areaOFShapes ( ) ,"volumeOf3D" ,sphere.volumeOf3D() );

        Shape[] shape = new Shape[6];

        shape[0] = circle;
        shape[1] = square;
        shape[2] = triangle;
        shape[3] = sphere;
        shape[4] = cube;
        shape[5] = tetrahedron;

        System.out.println ( "Shape processed polymorphically:\n" );

        for ( Shape currentShape : shape ) {
            if (currentShape instanceof TwoDimensionalShape){
                System.out.println(currentShape);
                System.out.printf("%s: %.2f\n\n", "AreaOfShapes", currentShape.areaOFShapes());
        }
            else if(currentShape instanceof ThreeDimensionalShape){
                System.out.println(currentShape);
                System.out.printf("%s: %.2f\n%s: %.2f\n\n", "AreaOfShapes", currentShape.areaOFShapes(),"VolumeOF3D",((ThreeDimensionalShape) currentShape).volumeOf3D());

            }

        }
    }
}
