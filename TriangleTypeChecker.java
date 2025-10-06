import java.util.Scanner;

public class TriangleTypeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter side 2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter side 3: ");
        double side3 = scanner.nextDouble();


        if (isValidTriangle(side1, side2, side3)) {
            if (side1 == side2 && side2 == side3) {
                System.out.println("The triangle is Equilateral.");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("The triangle is Isosceles.");
            } else {
                System.out.println("The triangle is Scalene.");
            }
        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }

        scanner.close();
    }


    public static boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}
