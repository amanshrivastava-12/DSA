package Patterns;

public class TopLeftTriangle {
    public static void main(String[] args) {
        int n=5;
        for(int i=5;i>=1;i--){
            for(int j=0;j<i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
