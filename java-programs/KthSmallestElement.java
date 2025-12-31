import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of elements
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Read array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Read K value
        System.out.print("Enter value of K: ");
        int k = sc.nextInt();

        // Check valid K
        if (k <= 0 || k > n) {
            System.out.println("Invalid value of K");
        } else {
            // Sort the array
            Arrays.sort(arr);

            // Print Kth smallest element
            System.out.println("The " + k + "th smallest element is: " + arr[k - 1]);
        }

        sc.close();
    }
}
