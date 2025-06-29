package Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int nums[]={5,4,3,8,9,1};
        int n=nums.length;
        int counter=1;
        while(counter<n){
            for(int i=0;i<n-counter;i++){
                if(nums[i]>nums[i+1]){
                    int temp=nums[i];
                    nums[i]=nums[i+1];
                    nums[i+1]=temp;
                }
            }
             counter++;
        }
         for(int a: nums){
             System.out.print(a+" ");
         }
    }
}
//tc=O(n^2)