package dp;

import java.util.Arrays;

public class MCM {
    public static int mcm(int arr[],int i,int j,int dp[][]){
        if(i==j) return 0; // single matrix case
        if(dp[i][j]!=-1) return dp[i][j];
        int ans=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++ ){
            int cost1=mcm(arr,i,k,dp); // Ai.............Ak=> arr[i-1]Xarr[k]
            int cost2=mcm(arr,k+1,j,dp);// Ai+1..............Aj=>arr[k]xarr[j]
            int cost3=arr[i-1]*arr[k]*arr[j];

            int finalCost=cost1+cost2+cost3;
            ans=Math.min(ans,finalCost);

        }
             return dp[i][j]=ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,3};
        int n=arr.length;
        int dp[][]=new int[n][n];
       for(int i[]:dp){
           Arrays.fill(i,-1);
       }
        System.out.println(mcm(arr,1,n-1,dp));

    }
}
