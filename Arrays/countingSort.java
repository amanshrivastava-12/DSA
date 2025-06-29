package Arrays;

public class countingSort {
//     for range of numbers
//    tc=O(n+range)
//    sc=O(range)
    public static void countingSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);

        }
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
//sorting
        int j=0;
      for(int i=0;i<count.length;i++){
         while(count[i]>0){
             arr[j]=i;
             j++;
             count[i]--;
         }
      }
       for(int a: arr){
           System.out.print(a+" ");
       }
     }
    public static void main(String[] args) {
  int nums[]={5,7,8,1,2};

        countingSort(nums);

    }
}
