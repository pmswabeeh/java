import java.util.Scanner;
interface Volume{
double pi=3.14159;
void readdata();
void dispVolume();
}
class Sphere implements Volume{
double radius,volume ;
public void readdata(){
Scanner sc= new Scanner(System.in);
System.out.print("Enter the radius of the sphere:");
radius = sc.nextDouble();
}
public void dispVolume(){
volume=(4.0/3.0)*pi*radius*radius*radius;
System.out.print("volume of sphere="+volume);
}
}
class Cylinder implements Volume {
double radius,height,volume;
public void readdata(){
Scanner sc=new Scanner(System.in);
 System.out.print("enter the radius of the cylinder:");
radius =sc.nextDouble();
System.out.print("enter the height of the cylinder:");
height =sc.nextDouble();
}
public void dispVolume(){
volume = pi*radius*radius*height;
System.out.println("Volume of Cylinder="+volume);
}
}

public class VolumeInterface{
 public static void main(String arg[])
{
Sphere s =new Sphere();
Cylinder c=new Cylinder();
System.out.println("----Sphere----");
s.readdata();
s.dispVolume();
System.out.println("\n---Cylinder---");
c.readdata();
c.dispVolume();
}
}





















