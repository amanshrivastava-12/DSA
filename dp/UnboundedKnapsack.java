package dp;

public class UnboundedKnapsack {
    public static void main(String[] args) {
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int W=7;
        int n=val.length;
        int dp[][]=new int[n+1][W+1];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=W;j++){
                int include=0;
                if(wt[i-1]<=j){
//                    include
                    include=val[i-1]+dp[i][j-wt[i-1]];

                }
                 int exclude=dp[i-1][j];
                dp[i][j]=Math.max(include,exclude);
            }
        }
        System.out.println(dp[n][W]);

    }
}
