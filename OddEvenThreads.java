import java.util.Scanner;

class OddNumbers implements Runnable {
    int limit;

    OddNumbers(int limit) {
        this.limit = limit;
    }

    public void run() {
        System.out.println("Odd Numbers:");
        for (int i = 1; i <= limit; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
             }
            }
        }
        System.out.println();
    }

class EvenNumbers implements Runnable {
    int limit;

    EvenNumbers(int limit) {
        this.limit = limit;
    }

    public void run() {
        System.out.println("Even Numbers:");
        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}


public class OddEvenThreads {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit: ");
        int n = sc.nextInt();

        
        OddNumbers odd = new OddNumbers(n);
        EvenNumbers even = new EvenNumbers(n);

        
        Thread t1 = new Thread(odd);
        Thread t2 = new Thread(even);

     
        t1.start();
        t2.start();
    }
}
