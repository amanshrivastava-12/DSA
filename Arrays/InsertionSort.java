package Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int nums[]={5,7,8,1,2};
        int n=nums.length;
        for(int i=1;i<n;i++){
            int curr=nums[i];
            int prev=i-1;
//            finding out the correct position
            while(prev>=0 && nums[prev]>curr){
                nums[prev+1]=nums[prev];
                prev--;
            }
//            insertion
            nums[prev+1]=curr;
        }
          for(int a:nums){
              System.out.print(a+" ");
          }
    }
}
// inbuil -> Arrays.sort(arr) and for reverse order-> Arrays.sort(arr,Collections.reverseOrder()); objects pe kam krega ye