package Arrays;
// arrays are always passed by reference
public class Basics {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14,16};
        int key=17;
        int n=arr.length;
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("key found at index"+i);
                flag=true;
                break;
            }

        }
          if(flag==false){
              System.out.println("key not found");
          }

    }

}
