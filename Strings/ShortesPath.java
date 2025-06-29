package Strings;

public class ShortesPath {
    public static float calcDist(String str){
        int n=str.length();
//        tc=O(n)
        int x=0,y=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='E'){
                x=x+1;
            }
            else if(str.charAt(i)=='W'){
                x=x-1;
            }
            else if(str.charAt(i)=='N'){
                y=y+1;
            }
            else{
                y=y-1;
            }
        }
        int X2=x*x;
        int Y2=y*y;

         return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
        String str="WNEENESENNN";
        int x=0;
        int y=0;
        System.out.println(calcDist(str));

    }
}
