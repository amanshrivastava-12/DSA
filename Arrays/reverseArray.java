package Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        int n=arr.length;
        int i=0;
        int j=n-1;

        while(i<j){
         int temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
         i++;
         j--;

        }
       for(int a:arr){
           System.out.println(a);
       }
    }
}
