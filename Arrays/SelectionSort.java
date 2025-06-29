package Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int nums[]={5,7,8,1,2};
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            int smallest=i;
            for(int j=i+1;j<n;j++){
                if(nums[smallest]>nums[j]){
                    smallest=j;
                }

            }
            int temp=nums[i];
            nums[i]=nums[smallest];
            nums[smallest]=temp;
        }
        for(int a:nums){
            System.out.print(a+" ");
        }
    }
}
//tc=O(n^2)
