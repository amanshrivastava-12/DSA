package dp;

import java.util.Arrays;

public class q1daythree {
    public static boolean findtarget(int val[]){
     int N=val.length;
       int sum=0;
       for(int i=0;i<val.length;i++){
           sum+=val[i];
       }
         if((sum%2!=0) ) //odd sum
             return false;
         int target=sum/2;

        int dp[][]=new int[N+1][target+1];
        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
         return ans(0,val,N,target,dp);


    }
    public static boolean ans(int idx,int val[],int N,int target,int dp[][]){
         if(target==0) return true;
         if(target<0) return false;
         if(idx>=N) return false;
         if(dp[idx][target]!=-1) return dp[idx][target]==1;
        boolean include= ans(idx+1,val,N,target-val[idx],dp);
        boolean exclude=ans(idx+1,val,N,target,dp);

        dp[idx][target] = (include || exclude) ? 1 : 0;
        return dp[idx][target] == 1;

    }
    public static void main(String[] args) {
   int val[]={1,5,11,5};
   int N=val.length;

        System.out.println(findtarget(val));
    }
}
