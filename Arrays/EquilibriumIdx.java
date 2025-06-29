package Arrays;
import java.util.*;
public class EquilibriumIdx {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Step 1: Input array
            System.out.print("Enter number of elements: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Step 2: Find total sum
            int totalSum = 0;
            for (int num : arr) {
                totalSum += num;
            }

            int leftSum = 0;
            boolean found = false;

            // Step 3: Traverse array
            for (int i = 0; i < n; i++) {
                totalSum -= arr[i]; // Now totalSum is the right sum

                if (leftSum == totalSum) {
                    System.out.println("Equilibrium Index found at: " + i);
                    found = true;
                    break;
                }

                leftSum += arr[i];
            }

            if (!found) {
                System.out.println("No Equilibrium Index found");
            }

            sc.close();
        }
    }


