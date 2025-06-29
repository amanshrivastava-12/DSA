package Arrays;
//continuous part of array
//2 ,(2,4),(2,4,6),(2,4,6,8)
//4,(4,6),(4,6,8),(4,6,8,10)
//6,(6,8),(6,8,10)
//8,(8,10)
//10
public class PrintSubarrays {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
