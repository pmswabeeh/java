import java.util.Scanner;
public class BaseConversion {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
System.out.print("Enter an integer: ");
int num = sc.nextInt();
System.out.println("Decimal: " + num);
System.out.println("Octal: " + Integer.toOctalString(num));
System.out.println("Hexadecimal: " + Integer.toHexString(num).toUpperCase());
}
}
