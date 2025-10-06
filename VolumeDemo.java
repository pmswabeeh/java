import java.util.Scanner;


interface Volume {
    double pi = 3.14159;  

    void readData(Scanner sc);  
    void dispVolume();          
}


class Sphere implements Volume {
    double radius, volume;

    public void readData(Scanner sc) {
        System.out.print("Enter radius of Sphere: ");
        radius = sc.nextDouble();
        volume = (4.0 / 3.0) * pi * radius * radius * radius;
    }

    public void dispVolume() {
        System.out.println("Volume of Sphere = " + volume);
    }
}


class Cylinder implements Volume {
    double radius, height, volume;

    public void readData(Scanner sc) {
        System.out.print("Enter radius of Cylinder: ");
        radius = sc.nextDouble();
        System.out.print("Enter height of Cylinder: ");
        height = sc.nextDouble();
        volume = pi * radius * radius * height;
    }

    public void dispVolume() {
        System.out.println("Volume of Cylinder = " + volume);
    }
}


public class VolumeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

  
        Volume sphere = new Sphere();
        sphere.readData(sc);
        sphere.dispVolume();

      
        Volume cylinder = new Cylinder();
        cylinder.readData(sc);
        cylinder.dispVolume();

        sc.close();
    }
}
