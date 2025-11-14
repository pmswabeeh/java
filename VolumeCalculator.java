import java.util.Scanner;

public class VolumeCalculator {


    double volume(double side) {
        return side * side * side;
    }

    double volume(double length, double breadth, double height) {
        return length * breadth * height;
    }

    double volume(double radius, double height, boolean isCylinder) {
        return 3.14159 * radius * radius * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VolumeCalculator obj = new VolumeCalculator();

        System.out.println("Choose shape to find volume:");
        System.out.println("1. Cube");
        System.out.println("2. Rectangular Box");
        System.out.println("3. Cylinder");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter side of cube: ");
                double side = sc.nextDouble();
                System.out.println("Volume of cube = " + obj.volume(side));
                break;

            case 2:
                System.out.print("Enter length, breadth, height of rectangular box: ");
                double l = sc.nextDouble();
                double b = sc.nextDouble();
                double h = sc.nextDouble();
                System.out.println("Volume of rectangular box = " + obj.volume(l, b, h));
                break;

            case 3:
                System.out.print("Enter radius and height of cylinder: ");
                double r = sc.nextDouble();
                double ht = sc.nextDouble();
                System.out.println("Volume of cylinder = " + obj.volume(r, ht, true));
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
