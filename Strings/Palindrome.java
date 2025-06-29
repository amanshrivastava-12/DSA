package Strings;

public class Palindrome {
    public static boolean checkPaindrome(String str){

        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        for(int i=0;i<sb.length();i++){
            if(str.charAt(i)!=sb.charAt(i)) {
                return false;
            }
            else continue;

        }
         return true;
    }
    public static void main(String[] args) {
        String str="12321";
        System.out.println(checkPaindrome(str));
    }
}
