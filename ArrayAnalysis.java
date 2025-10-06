import java.util.Scanner;

public class ArrayAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements (at least 10): ");
        int n = scanner.nextInt();

        if (n < 10) {
            System.out.println("Error: You must enter at least 10 numbers.");
            return;
        }

        int[] arr = new int[n];

    
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

    
        int smallest = arr[0];
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

       
        for (int i = 1; i < n; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }


        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("All elements are the same. No second largest element.");
        } else {
            System.out.println("Smallest element: " + smallest);
            System.out.println("Largest element: " + largest);
            System.out.println("Second largest element: " + secondLargest);
        }

        scanner.close();
    }
}
