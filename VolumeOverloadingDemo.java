class VolumeCalculator {


    double volume(double side) {
        return side * side * side;
    }

    
    double volume(double length, double breadth, double height) {
        return length * breadth * height;
    }

  
    double volume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }
}

public class VolumeOverloadingDemo {
    public static void main(String[] args) {
        VolumeCalculator v = new VolumeCalculator();

        double cubeVol = v.volume(5); // cube with side 5
        double boxVol = v.volume(4, 3, 6); // box with l=4,b=3,h=6
        double cylVol = v.volume(3.5, 10); // cylinder with r=3.5,h=10

        System.out.println("Volume of Cube: " + cubeVol);
        System.out.println("Volume of Rectangular Box: " + boxVol);
        System.out.println("Volume of Cylinder: " + cylVol);
    }
}
