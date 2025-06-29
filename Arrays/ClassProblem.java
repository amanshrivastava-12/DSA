package Arrays;

import java.util.*;

public class ClassProblem {
        public static void main(String[] args) {
            int arr[] = {4, 2, 7, 1};
            int idx[] = {3, 1, 0, 2};

            Integer[] pair = new Integer[arr.length];

            for (int i = 0; i < arr.length; i++) {
                pair[i] = i; // Stores the indices
            }

            // Sort the indices based on the values in idx[]
            Arrays.sort(pair, (a, b) -> {
                return Integer.compare(idx[a], idx[b]);
            });


            // Create a temporary array to hold the reordered elements of arr[]
            int[] sortedArr = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                sortedArr[i] = arr[pair[i]]; // Reorder arr[] using sorted indices
            }

            // Copy sortedArr back to arr, if needed
            System.arraycopy(sortedArr, 0, arr, 0, arr.length);

            // Print the sorted arr[]
            for (int a : arr) {
                System.out.println(a);
            }
        }
    }


