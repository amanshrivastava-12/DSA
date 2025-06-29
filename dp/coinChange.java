package dp;

public class coinChange {


public static int coinChangeUtil(int[] coins, int n, int sum, int[][] dp) {
    // Base Case: When sum is 0, there is 1 way to make the sum (use no coins)
    if (sum == 0) {
        return 1;
    }

    // Base Case: When no coins left and sum is not 0, there is no way to make the sum
    if (n == 0) {
        return 0;
    }

    // If value already calculated, return the stored value
    if (dp[n][sum] != -1) {
        return dp[n][sum];
    }

    int include = 0;
    // Check for valid condition
    if (coins[n - 1] <= sum) {
        include = coinChangeUtil(coins, n, sum - coins[n - 1], dp);
    }
    int exclude = coinChangeUtil(coins, n - 1, sum, dp);

    // Memoize the result before returning
    dp[n][sum] = include + exclude;
    return dp[n][sum];
}

    public static void main(String[] args) {
        int coins[]={2,5,3,6};
        int sum=10;
        int n=coins.length;
        int dp[][]=new int[n+1][sum+1];
//         intialise the first column by 1
        for(int i=0;i<n+1;i++){
            dp[i][0]=1;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                int include=0;
//                  check for valid condition
                if(coins[i-1]<=j){
                    include=dp[i][j-coins[i-1]];
                }
                 int exclude=dp[i-1][j];
                dp[i][j]=include+exclude;
            }
        }
        System.out.println(dp[n][sum]);
    }
}
