abstract class Shape {}
abstract class TwoDim extends Shape {}
abstract class ThreeDim extends Shape {}
class Square extends TwoDim {
 double side, area;
Square(double s) {
  side = s;
  area = side * side;
   System.out.println("Area of Square = " + area);
  }
}

class Triangle extends TwoDim {
 double base, height, area;
Triangle(double b, double h) {
 base = b;
 height = h;
 area = 0.5 * base * height;
 System.out.println("Area of Triangle = " + area);
}
}
class Sphere extends ThreeDim {
 double radius, area;
Sphere(double r) {
radius = r;
area = 4 * Math.PI * radius * radius;
System.out.println("Surface Area of Sphere = " + area);
}
}
class Cube extends ThreeDim {
 double side, area;
Cube(double s) {
 side = s;
 area = 6 * side * side;
 System.out.println("Surface Area of Cube = " + area);
}
}
public class ShapeArea {
public static void main(String[] args) {
 Square sq = new Square(5);
 Triangle tr = new Triangle(4, 3);
 Sphere sp = new Sphere(2.5);
 Cube cb = new Cube(3);
 }
}
