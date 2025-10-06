import java.util.Scanner;

public class RemoveVowels {
  
    public static String removeVowels(String str) {
        return str.replaceAll("[AEIOUaeiou]", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

  
        String result = removeVowels(input);

       
        System.out.println("String after removing vowels: " + result);

        sc.close();
    }
}
