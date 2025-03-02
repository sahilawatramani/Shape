// Name: Sahil Awatramani
// PRN: 23070126112
// Batch: B2
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            // Displaying menu for shape selection
            System.out.println("\nSelect a shape to calculate area, perimeter, and volume (if applicable):");
            System.out.println("1. Circle\n2. Rectangle\n3. Square\n4. Sphere\n5. Cylinder\n6. Equilateral Pyramid\n7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();

            Shape shape = null;
            switch (choice) {
                case 1: // Circle
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scan.nextDouble();
                    shape = new Circle(radius);
                    break;
                case 2: // Rectangle
                    System.out.print("Enter length: ");
                    double length = scan.nextDouble();
                    System.out.print("Enter width: ");
                    double width = scan.nextDouble();
                    shape = new Rectangle(length, width);
                    break;
                case 3: // Square
                    System.out.print("Enter side length: ");
                    double side = scan.nextDouble();
                    shape = new Square(side);
                    break;
                case 4: // Sphere
                    System.out.print("Enter radius of the sphere: ");
                    radius = scan.nextDouble();
                    shape = new Sphere(radius);
                    break;
                case 5: // Cylinder
                    System.out.print("Enter radius: ");
                    radius = scan.nextDouble();
                    System.out.print("Enter height: ");
                    double height = scan.nextDouble();
                    shape = new Cylinder(radius, height);
                    break;
                case 6: // Equilateral Pyramid
                    System.out.print("Enter base side length: ");
                    side = scan.nextDouble();
                    System.out.print("Enter height: ");
                    height = scan.nextDouble();
                    shape = new EquilateralPyramid(side, height);
                    break;
                case 7:
                    System.out.println("Exiting program.");
                    scan.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
                    continue;
            }

            // Displaying computed values
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            System.out.println("Volume: " + shape.calculateVolume());
        }
    }
}
