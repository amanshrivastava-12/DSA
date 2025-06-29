package Arrays;

public class SearchInRotatedArray {
    public static int findIndex(int nums[],int target){
        int n=nums.length;
        int si=0;
        int ei=n-1;
        while(si<=ei) {
            int mid = si + (ei - si) / 2;
            if (nums[mid] == target) return mid;
//            check if left part is sorted
            if (nums[si] <= nums[mid]) {
                // Check if target is in the left half
                if (nums[si] <= target && target < nums[mid]) ei = mid - 1;
                else
                si = mid + 1;
            } else {// right half is sorted
                if (nums[mid] < target && target <= nums[ei]) si = mid + 1;
                else
                ei = mid - 1;
            }
        }
         return -1;
    }
    public static void main(String[] args) {
        int nums[]={4,5,6,7,0,1,2};
        int target=3;
        System.out.println(findIndex(nums,target));
    }
}
