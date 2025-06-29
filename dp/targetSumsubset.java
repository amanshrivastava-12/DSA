package dp;

public class targetSumsubset {
    public static boolean targetSum(int val[],int sum){
        int n= val.length;
        boolean dp[][]=new boolean[n+1][sum+1];

        for(int i=0;i<n+1;i++){
            dp[i][0]=true;
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                int v=val[i-1];
                if(v<=j && dp[i-1][j-v]==true){
//                    include
                    dp[i][j]=true;
                }
                 else if(dp[i-1][j]==true) dp[i][j]=true;
            }
        }
         return dp[n][sum];
    }
    public static void main(String[] args) {
        int val[]={1, 3, 9, 12};
        int sum=25;
        System.out.println(targetSum(val,sum));
    }
}
