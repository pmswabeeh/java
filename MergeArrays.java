import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter size of first array: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }

     
        System.out.print("Enter size of second array: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

      
        int[] mergedArray = new int[size1 + size2];
        for (int i = 0; i < size1; i++) {
            mergedArray[i] = array1[i];
        }
        for (int i = 0; i < size2; i++) {
            mergedArray[size1 + i] = array2[i];
        }

       
        System.out.println("Merged array:");
        for (int value : mergedArray) {
            System.out.print(value + " ");
        }

        scanner.close();
    }
}
