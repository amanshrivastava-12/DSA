package Arrays;

public class MaximumSumSubarray {
    public static void maxSumBruteForce(int num[]){
        //Time complexity=O(n^3)
//Space complexity=O(1)
        int maxSum=Integer.MIN_VALUE;

        int n=num.length;
        for(int i=0;i<n;i++){
           int start=i;
           for(int j=i;j<n;j++){
              int end=j;
              int currSum=0;
              for(int k=start;k<=end;k++){
                    currSum+=num[k];
              }
               maxSum=Math.max(currSum,maxSum);
           }
        }
        System.out.println(maxSum);
    }
     public static void maxSubarraySumPrefix(int num[]){
//        tc=O(n^2)
//         sc=O(n)
        int n=num.length;
        int prefixSum[]=new int[n];
        int maxSum=Integer.MIN_VALUE;
        int s=0;
        for(int i=0;i<n;i++){
            s+=num[i];
            prefixSum[i]=s;
        }
        for(int i=0;i<n;i++){
            int start=i;
            for(int j=i;j<n;j++){
                int end=j;
               int currSum=start==0?prefixSum[end]: prefixSum[end]-prefixSum[start-1];
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }

        }
         System.out.println(maxSum);
     }
     public static void kadaneAlgoApproach(int num[]){
//        tc=O(n);
//        sc=O(1)
//         agr sare element negative h to special condition  lgana pdega
        int n=num.length;
         int cs=0;
         int ms=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
         cs+=num[i];
         if(cs<=0) cs=0;
         if(cs>ms) ms=cs;

        }
         System.out.println(ms);
     }

    public static void main(String[] args) {
        int num[]={-1};
        kadaneAlgoApproach(num);
    }
}

