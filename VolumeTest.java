import java.util.Scanner;


interface Volume {
    double pi = 3.14159;  

    void readdata();      
    void dispvolume();    
}


class Sphere implements Volume {
    double radius;

    public void readdata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of sphere: ");
        radius = sc.nextDouble();
    }

    public void dispvolume() {
        double volume = (4.0 / 3.0) * pi * radius * radius * radius;
        System.out.println("Volume of Sphere = " + volume);
    }
}

class Cylinder implements Volume {
    double radius, height;

    public void readdata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of cylinder: ");
        radius = sc.nextDouble();
        System.out.print("Enter height of cylinder: ");
        height = sc.nextDouble();
    }

    public void dispvolume() {
        double volume = pi * radius * radius * height;
        System.out.println("Volume of Cylinder = " + volume);
    }
}


public class VolumeTest {
    public static void main(String[] args) {
        Sphere s = new Sphere();
        s.readdata();
        s.dispvolume();

        Cylinder c = new Cylinder();
        c.readdata();
        c.dispvolume();
    }
}
