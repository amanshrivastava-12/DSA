package dp;

public class EditDistance {
    public static int edit(String str1,String str2){
        int n=str1.length();
        int m=str2.length();
        int dp[][]=new int[n+1][m+1];

//        initialise
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0) dp[i][j]=j;
                if(j==0) dp[i][j]=i;
            }
         }
//         bottom up
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
//                same
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }else{ // different
                      int add=dp[i][j-1];
                      int delete=dp[i-1][j];
                      int replace=dp[i-1][j-1];
                      dp[i][j]=Math.min(add,Math.min(delete,replace))+1;
                }
            }
        }
          return dp[n][m];
    }
//    tc=O(n*m)
//    sc=O(n*M)
    public static void main(String[] args) {
        String word1 ="intention";
        String word2 ="execution";
        System.out.println(edit(word1,word2));


    }
}
