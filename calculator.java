public class SimpleMath {
    public static void main(String[] args) {
              if (args.length != 2) {
            System.out.println("Usage: java SimpleMath <num1> <num2>");
            return;
        }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
            int sum = num1 + num2;
        int diff = num1 - num2;
        int prod = num1 * num2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + prod);
        if (num2 != 0) {
            int quot = num1 / num2;
            int rem = num1 % num2;
            System.out.println("Quotient: " + quot);
            System.out.println("Remainder: " + rem);
        } else {
            System.out.println("Quotient: Undefined (division by zero)");
            System.out.println("Remainder: Undefined (modulus by zero)");
        }
    }
}
