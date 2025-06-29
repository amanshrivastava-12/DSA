package dp;

public class WildCardMatching {
    public static boolean isMatch(String s,String p){
        int n=s.length();
        int m=p.length();

        boolean dp[][]=new boolean[n+1][m+1];

//        initialise
//         case 1 : jb v s and p both are empty then return true
        dp[0][0]=true;
//        pattern="";
        for(int i=1;i<n+1;i++){
           dp[i][0]=false;
        }
//        string="";
        for(int j=1;j<=m;j++){
            if(p.charAt(j-1)=='*')  dp[0][j]= dp[0][j-1];

        }
//          bottom up
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
//                 case-> ith char=jth char|| jth char==?
                if(s.charAt(i-1)==p.charAt(j-1)||p.charAt(j-1)=='?')
                    dp[i][j]=dp[i-1][j-1];
                else if(p.charAt(j-1)=='*'){
//                    either we can ignore i.e s=i,p=j-1 or we can consider it s=i-1,p=j
                    dp[i][j]=dp[i-1][j] || dp[i][j-1];
                }else{
                    dp[i][j]=false;
                }
            }

        }
          return dp[n][m];
    }
    public static void main(String[] args) {
        String s="abc";
        String p="**d";
        System.out.println(isMatch(s,p));

//tc=O(n*m)
//sc=O(n*m)
    }
}
