import java.util.Scanner;


class NumberOperations {
    int num;

  
    NumberOperations(int n) {
        num = n;
    }


    int sumOfDigits() {
        int sum = 0, temp = num;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return sum;
    }

  
    int reverseNumber() {
        int rev = 0, temp = num;
        while (temp > 0) {
            rev = rev * 10 + (temp % 10);
            temp /= 10;
        }
        return rev;
    }
}

public class SumAndReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        
        NumberOperations obj = new NumberOperations(n);


        System.out.println("Sum of digits = " + obj.sumOfDigits());
        System.out.println("Reverse of number = " + obj.reverseNumber());

        sc.close();
    }
}
