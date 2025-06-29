package dp;

public class StringConversion {
    public static int convert(String str1,String str2){
        int n=str1.length();
        int m=str2.length();
        int dp[][]=new int[n+1][m+1];

          for(int i=1;i<=n;i++){
              for(int j=1;j<=m;j++){
                  if(str1.charAt(i-1)==str2.charAt(j-1)){
                      dp[i][j]=1+dp[i-1][j-1];

                  }
                   else{
                       dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                  }
              }
          }
            return dp[n][m];
    }


    public static void main(String[] args) {
        String s1="abcde";
        String s2="abcf";
        int n=s1.length();
        int m=s2.length();
        int ans=convert(s1,s2);
        int diff1=n-ans;
        int diff2=m-ans;
        System.out.println(diff1+diff2);


    }
}
