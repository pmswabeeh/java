import java.util.Scanner;


class Complex {
    int real, imag;

  
    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    
    Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }


    void display() {
        if (imag >= 0)
            System.out.println(real + " + " + imag + "i");
        else
            System.out.println(real + " - " + (-imag) + "i");
    }
}

public class ComplexAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

  
        System.out.print("Enter real part of first complex number: ");
        int r1 = sc.nextInt();
        System.out.print("Enter imaginary part of first complex number: ");
        int i1 = sc.nextInt();
        Complex c1 = new Complex(r1, i1);

    
        System.out.print("Enter real part of second complex number: ");
        int r2 = sc.nextInt();
        System.out.print("Enter imaginary part of second complex number: ");
        int i2 = sc.nextInt();
        Complex c2 = new Complex(r2, i2);

       
        Complex sum = c1.add(c2);

    
        System.out.print("First Complex Number: ");
        c1.display();
        System.out.print("Second Complex Number: ");
        c2.display();
        System.out.print("Sum of Complex Numbers: ");
        sum.display();

        sc.close();
    }
}
