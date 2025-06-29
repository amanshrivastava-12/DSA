package dp;

import java.util.Arrays;

public class zerooneknapsack {
    public static int findans(int val[],int wt[],int W,int n,int dp[][]){
        if(n==0 || W==0) return 0;

        if(dp[n][W]!=-1) return dp[n][W];

         int include=0;
         if(wt[n-1]<=W)
      include= val[n-1]+ findans(val,wt,W-wt[n-1],n-1,dp);
        int exclude=findans(val,wt,W,n-1,dp);

        return dp[n][W]= Math.max(include,exclude);
    }
    public static int findansbyTabulation(int val[],int wt[],int W,int n,int dp[][]){

        for(int i=1;i<=n;i++){
            for(int j=1;j<=W;j++){
                // check valid
                int include=0;
                if(wt[i-1]<=j){
                     include=val[i-1]+dp[i-1][j-wt[i-1]];
                }
                int exclude=dp[i-1][j];
                dp[i][j]=Math.max(include,exclude);
            }
        }
          return dp[n][W];
    }

    public static void main(String[] args) {
        int val[]={1, 5, 4, 7};
        int wt[]= {1, 4, 3, 5};
        int W=7;
        int n=val.length;
        int dp[][]=new int[n+1][W+1];

//        for(int i[]:dp){  //commenting this for implementing tabulation
//            Arrays.fill(i,-1);
//        }
//        System.out.println(findans(val,wt,W,n,dp));
        System.out.println(findansbyTabulation(val,wt,W,n,dp));
    }
}
