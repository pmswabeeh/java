import java.util.Scanner;

// Abstract base class
abstract class Shape {
    abstract void area();
}

// TwoDim subclass
abstract class TwoDim extends Shape { }

// ThreeDim subclass
abstract class ThreeDim extends Shape { }

// Square class
class Square extends TwoDim {
    double side;

    Square(double side) {
        this.side = side;
    }

    void area() {
        System.out.println("Area of Square: " + (side * side));
    }
}

// Triangle class
class Triangle extends TwoDim {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    void area() {
        System.out.println("Area of Triangle: " + (0.5 * base * height));
    }
}

// Sphere class
class Sphere extends ThreeDim {
    double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    void area() {
        System.out.println("Surface Area of Sphere: " + (4 * Math.PI * radius * radius));
    }
}

// Cube class
class Cube extends ThreeDim {
    double side;

    Cube(double side) {
        this.side = side;
    }

    void area() {
        System.out.println("Surface Area of Cube: " + (6 * side * side));
    }
}

// Main class
public class ShapeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Square
        System.out.print("Enter side of Square: ");
        double sqSide = sc.nextDouble();
        Shape s1 = new Square(sqSide);
        s1.area();

        // Triangle
        System.out.print("Enter base of Triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter height of Triangle: ");
        double height = sc.nextDouble();
        Shape s2 = new Triangle(base, height);
        s2.area();

        // Sphere
        System.out.print("Enter radius of Sphere: ");
        double radius = sc.nextDouble();
        Shape s3 = new Sphere(radius);
        s3.area();

        // Cube
        System.out.print("Enter side of Cube: ");
        double cubeSide = sc.nextDouble();
        Shape s4 = new Cube(cubeSide);
        s4.area();

        sc.close();
    }
}
