package Arrays;

public class TwoSumSortedArray {
        public static int[] findTwoNumbers(int[] arr, int target) {
            int left = 0;
            int right = arr.length - 1;

            while (left < right) {
                int currentSum = arr[left] + arr[right];

                if (currentSum == target) {
                    return new int[] {arr[left], arr[right]};
                } else if (currentSum < target) {
                    left++;
                } else {
                    right--;
                }
            }

            return new int[] {}; // Return empty array if no pair found
        }

        public static void main(String[] args) {
            int[] arr = {10,11,13,16,21,42};
            int target = 63;

            int[] result = findTwoNumbers(arr, target);

            if (result.length == 2) {
                System.out.println("Pair found: (" + result[0] + ", " + result[1] + ")");
            } else {
                System.out.println("No pair found");
            }
        }
    }