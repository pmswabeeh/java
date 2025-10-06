
class OddThread implements Runnable {
    int limit;

    OddThread(int limit) {
        this.limit = limit;
    }

    public void run() {
        for (int i = 1; i <= limit; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd: " + i);
            }
        }
    }
}

class EvenThread implements Runnable {
    int limit;

    EvenThread(int limit) {
        this.limit = limit;
    }

    public void run() {
        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            }
        }
    }
}

public class SimpleOddEven {
    public static void main(String[] args) {
        int n = 10; // limit (you can change it)

        Thread oddThread = new Thread(new OddThread(n));
        Thread evenThread = new Thread(new EvenThread(n));

        oddThread.start();
        evenThread.start();
    }
}
