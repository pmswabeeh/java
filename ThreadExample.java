import java.util.Scanner;

class EvenNumbers implements Runnable {
    int limit;
    EvenNumbers(int n) { limit = n; }

    public void run() {
        System.out.println("Even numbers:");
        for (int i = 2; i <= limit; i += 2) {
            System.out.println(i);
            try { Thread.sleep(500); }
            catch (InterruptedException e) { System.out.println(e); }
        }
    }
}

class OddNumbers implements Runnable {
    int limit;
    OddNumbers(int n) { limit = n; }

    public void run() {
        System.out.println("Odd numbers:");
        for (int i = 1; i <= limit; i += 2) {
            System.out.println(i);
            try { Thread.sleep(500); }
            catch (InterruptedException e) { System.out.println(e); }
        }
    }
}

public class sThreadExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n = sc.nextInt();
        sc.close();

        Thread t1 = new Thread(new EvenNumbers(n));
        Thread t2 = new Thread(new OddNumbers(n));

        t1.start();
        t2.start();
    }
}
