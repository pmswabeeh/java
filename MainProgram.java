import simple.Calculator;

public class MainProgram {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int num = 5;
        System.out.println("Square of " + num + " = " + c.square(num));
    }
}
