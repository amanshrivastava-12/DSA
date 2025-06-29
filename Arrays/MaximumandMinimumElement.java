package Arrays;

public class MaximumandMinimumElement {
    public static int max(int arr[]){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
       return max;
    }
    public static int min(int arr[]){
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[]={2,5,7,9,1};
        System.out.println(max(arr));
        System.out.println(min(arr));
    }
}
