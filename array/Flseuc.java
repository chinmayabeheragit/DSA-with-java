import java.util.Scanner;

public class Flseuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt(); // User inputs the size of the array

        int[] arr = new int[n]; // Array to hold user-input values

        System.out.println("Enter " + n + " elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // User inputs each element of the array
        }

        int smallest = arr[0]; // Assume the first element is the smallest
        int largest = arr[0];  // Assume the first element is the largest

        for (int i = 1; i < n; i++) { // Loop through the rest of the array
            if (arr[i] < smallest) {
                smallest = arr[i]; // Update smallest if a smaller value is found
            }
            if (arr[i] > largest) {
                largest = arr[i]; // Update largest if a larger value is found
            }
        }

        System.out.println("The smallest element is: " + smallest);
        System.out.println("The largest element is: " + largest);

        sc.close();
    }
}
