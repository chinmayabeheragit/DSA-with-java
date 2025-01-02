import java.util.Scanner;

public class Problem1 {
    // Method to print the pattern
    public static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt(); // Input the value of n
        pattern1(n); // Call the pattern1 method
        scanner.close(); // Close the scanner
    }
}
