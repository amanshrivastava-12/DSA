package BackTracking;
import java.util.ArrayList;
import java.util.List;
public class SubsetSum {



        public static void main(String[] args) {
            int[] nums = {3, 34, 4, 12, 5, 2};
            int target = 9;
            List<List<Integer>> result = new ArrayList<>();
            findSubsets(nums, target, 0, new ArrayList<>(), result);

            // Display the result
            for (List<Integer> subset : result) {
                System.out.println(subset);
            }
        }

        public static void findSubsets(int[] nums, int target, int start, List<Integer> current, List<List<Integer>> result) {
            if (target == 0) {
                result.add(new ArrayList<>(current));
                return;
            }

            for (int i = start; i < nums.length; i++) {
                if (nums[i] <= target) {
                    current.add(nums[i]);
                    findSubsets(nums, target - nums[i], i + 1, current, result);
                    current.remove(current.size() - 1); // backtrack
                }
            }

    }

}
