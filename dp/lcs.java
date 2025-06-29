package dp;

import java.util.*;

public class
lcs {
    public static int ans(String s1,String s2,int m,int n,int dp[][]){
        if(m==0 || n==0) return 0;

        if(dp[m][n]!=-1) return dp[m][n];

        if(s1.charAt(m-1)==s2.charAt(n-1)){
             return dp[m][n]= 1 + ans(s1,s2,m-1,n-1,dp);
        }
         else
             return dp[m][n]= Math.max(ans(s1,s2,m-1,n,dp),ans(s1,s2,m,n-1,dp));

    }
    public static int lcsTab(String s1,String s2,int m,int n){
        int dp[][]=new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)) dp[i][j]=dp[i-1][j-1]+1;

                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);

            }
        }
        printArr(dp);

         return dp[m][n];

    }
    public static void printArr(int dp[][]){
        int n=dp.length;
        int m=dp[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
         String s1="abc";
         String s2="ac";
         int m=s1.length();
         int n=s2.length();
//         int dp[][]=new int[m+1][n+1];

//         for(int i=0;i<=m;i++){
//             for(int j=0;j<=n;j++){
//                 dp[i][j]=-1;
//             }
//         }
//         for(int i[]: dp){
//             Arrays.fill(i,-1);
//         }
        System.out.println(lcsTab(s1,s2,m,n));


    }
}
