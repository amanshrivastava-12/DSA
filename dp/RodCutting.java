package dp;

public class RodCutting {
    public static void main(String[] args) {
        int l[]={1,2,3,4,5,6,7,8};
        int prices[]={1,5,8,9,10,17,17,20};
        int rodLength=8;

        int n=prices.length;
        int dp[][]=new int[n+1][rodLength+1];

        for(int i=1;i<n+1;i++){
            for(int j=1;j<rodLength+1;j++){
                int include=0;
                if(l[i-1]<=j){
//                    valid
                    include=prices[i-1]+dp[i-1][j-l[i-1]];
                }
                int exclude=dp[i-1][j];
                dp[i][j]=Math.max(include,exclude);
            }

        }
        System.out.println(dp[n][rodLength]);
        for(int i=0;i<n+1;i++){
            for(int j=0;j<rodLength+1;j++){
                System.out.print(dp[i][j] +" ");
            }
            System.out.println();
            }
    }
}
