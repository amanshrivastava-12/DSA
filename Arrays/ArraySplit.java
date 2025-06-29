package Arrays;
import java.util.Scanner;
public class ArraySplit {
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

            // Step 1: Find total sum
            int totalSum = 0;
            for (int num : arr) {
                totalSum += num;
            }

            // Step 2: Traverse to find split point
            int leftSum = 0;
            boolean canSplit = false;
            for (int i = 0; i < n - 1; i++) { // n-1 because we need non-empty prefix and suffix
                leftSum += arr[i];
                int rightSum = totalSum - leftSum;
                if (leftSum == rightSum) {
                    canSplit = true;
                    System.out.println("Array can be split after index " + i);
                    break;
                }
            }

            if (!canSplit) {
                System.out.println("Array cannot be split into equal prefix and suffix.");
            }

            sc.close();
        }
    }


