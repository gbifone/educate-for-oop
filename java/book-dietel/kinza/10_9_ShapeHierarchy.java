/**
 * Created by Kinza Fatima on 6/7/2017.
 */
public class ShapeHierarchy {
    public static void main ( String[] args ) {

        Shapes triangle = new Triangle ( 3.4,4.0 );
        Shapes square = new Square ( 5.3 );
        Shapes circle = new Circle ( 8 );
        Tetrahedron tetrahedron= new Tetrahedron ( 5.9 );
        Sphere sphere = new Sphere ( 2.1 );
        Cube cube = new Cube ( 3.3 );

        System.out.println ( "Shapes processed individually:\n" );
        System.out.printf ( "%s\n%s: %,.2f\n\n", triangle, "area of 2D", triangle.areaOfShapes () );
        System.out.printf ( "%s\n%s: %,.2f\n\n", square, "area of 2D", square.areaOfShapes () );
        System.out.printf ( "%s\n%s: %,.2f\n\n", circle, "area of 2D", circle.areaOfShapes () );
        System.out.printf ( "%s\n%s: %,.2f\n%s: %,.2f\n\n", tetrahedron, "area of 3D", tetrahedron.areaOfShapes (), " volume of 3D", tetrahedron.volumeOf3DShapes ());
        System.out.printf ( "%s\n%s: %,.2f\n%s: %,.2f\n\n", sphere, "area of 3D", sphere.areaOfShapes (), " volume of 3D", sphere.volumeOf3DShapes () );
        System.out.printf ( "%s\n%s: %,.2f\n%s: %,.2f\n\n", cube, "area of 3D", cube.areaOfShapes (), " volume of 3D", cube.volumeOf3DShapes () );

        Shapes[] shapes = new Shapes[ 6 ];

        shapes[ 0 ] = triangle;
        shapes[ 1 ] = square;
        shapes[ 2 ] = circle;
        shapes[ 3 ] = tetrahedron;
        shapes[ 4 ] = sphere;
        shapes[ 5 ] = cube;

        System.out.println ( "Shapes processed polymorphically:\n" );

        for ( Shapes currentShape : shapes ) {
            if (currentShape instanceof TwoDimensionalShapes){
                System.out.println(currentShape);
                System.out.printf("%s: %.2f\n\n", "AreaOfShapes", currentShape.areaOfShapes ());
            }
            else if(currentShape instanceof ThreeDimensionalShapes){
                 System.out.println(currentShape);
                 System.out.printf("%s: %.2f\n%s: %.2f\n\n", "AreaOfShapes", currentShape.areaOfShapes (),"VolumeOF3D",((ThreeDimensionalShapes) currentShape).volumeOf3DShapes ());

            }
        }
    }
}
