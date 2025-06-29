package Arrays;

public class NumsArray {
    private int[] prefixSum;

    public NumsArray(int[] nums) {
        prefixSum = new int[nums.length + 1];
        for (int i = 1; i < nums.length + 1; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }
         for(int i=0;i<prefixSum.length;i++){
             System.out.println(prefixSum[i]);
         }
    }

    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        NumsArray n=new NumsArray(nums);
    }
}