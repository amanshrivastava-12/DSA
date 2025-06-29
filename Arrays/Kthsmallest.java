package Arrays;

import java.util.PriorityQueue;

public class Kthsmallest {
    public static int find(int arr[],int K){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        int ans=0;
         for(int i=0;i<K;i++){
             ans=pq.poll();
         }
          return ans;
    }
    public static void main(String[] args) {
        int arr[]={2,5,7,1,9,4};
        int n=arr.length;
        System.out.println(find(arr,3));
    }
}
