import java.util.Scanner;


class Student {
    String name;
    int rollNo;


    public void readDetails(Scanner sc) {
        System.out.print("Enter student name: ");
        name = sc.nextLine();
        System.out.print("Enter roll number: ");
        rollNo = sc.nextInt();
        sc.nextLine(); // consume newline
    }


    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }
}


class Mark extends Student {
    int[] marks = new int[5];
    int total = 0;
    double average;


    public void readMarks(Scanner sc) {
        System.out.println("Enter marks of 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }
        average = total / 5.0;
    }


    public void displayResult() {
        displayDetails();
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        Mark obj = new Mark();

    
        obj.readDetails(sc);
        obj.readMarks(sc);

        System.out.println("\n--- Student Result ---");
        obj.displayResult();

        sc.close();
    }
}
