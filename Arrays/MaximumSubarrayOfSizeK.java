package Arrays;
import java.util.*;
public class MaximumSubarrayOfSizeK {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input array
            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Input K
            System.out.print("Enter value of K: ");
            int k = sc.nextInt();

            // Check if K is valid
            if (k > n) {
                System.out.println("Invalid input: K cannot be larger than the array size.");
                return;
            }

            // Step 1: Find sum of first K elements
            int currentSum = 0;
            for (int i = 0; i < k; i++) {
                currentSum += arr[i];
            }

            int maxSum = currentSum;

            // Step 2: Move the window
            for (int i = 1; i <= n - k; i++) {
                // Remove the element going out (arr[i-1])
                // Add the new element coming in (arr[i+k-1])
                currentSum = currentSum - arr[i-1] + arr[i+k-1];

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }

            System.out.println("Maximum sum of subarray of size " + k + " is: " + maxSum);

            sc.close();
        }
    }


