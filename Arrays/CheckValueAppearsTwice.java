package Arrays;

import java.util.HashSet;

public class CheckValueAppearsTwice {
    public static boolean check(int nums[]){
        int n=nums.length;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++){
            if(set.contains(nums[i])){
             return true;
            }
            else{
                set.add(nums[i]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        int n=nums.length;
        System.out.println(check(nums));


    }
}
