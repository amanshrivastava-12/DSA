package Arrays;
// not preferred for small datasets
public class BinarySearch {
    public static int BinarySearch(int arr[],int n,int key){
        int si=0;
        int ei=n-1;
        while(si<=ei){
            int mid=si+(ei-si)/2;
            if(arr[mid]==key) return mid;

           else if(arr[mid]>key) ei=mid-1;
           else si=mid+1;


        }
         return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14};
        int n=arr.length;
        int key=10;
        System.out.println(BinarySearch(arr,n,key));
    }
}
