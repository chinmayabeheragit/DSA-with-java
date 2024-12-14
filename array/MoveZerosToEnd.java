import java.util.Scanner;

public class MoveZerosToEnd {
    public static void moveZerosToEnd(int[] arr, int n) {
        int j = 0; // Pointer to place the next non-zero element

        // Traverse the array
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) { // If element is non-zero
                arr[j] = arr[i];
                j++;
            }
        }

        // Fill the remaining positions with zeros
        for (int i = j; i < n; i++) {
            arr[i] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of the array
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Rearrange the array
        moveZerosToEnd(arr, n);

        // Output the modified array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
