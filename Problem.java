import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter marks: ");
        int marks = scanner.nextInt();

        if (marks < 25) {
            System.out.println("Grade: F");
        } else if (marks >= 25 && marks <= 44) {
            System.out.println("Grade: E");
        } else if (marks >= 45 && marks <= 49) {
            System.out.println("Grade: D");
        } else if (marks >= 50 && marks <= 59) {
            System.out.println("Grade: C");
        } else if (marks >= 60 && marks <= 69) {
            System.out.println("Grade: B");
        } else if (marks >= 70) {
            System.out.println("Grade: A");
        } else {
            System.out.println("Invalid marks entered.");
        }
        
        scanner.close(); // Closing the scanner
    }
}
