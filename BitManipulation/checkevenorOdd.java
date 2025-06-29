package BitManipulation;

public class checkevenorOdd {
    public static void oddEven(int n){
       int bitMask=1;
        if((n&bitMask)==0) System.out.println("even");
        else{
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {
        oddEven(3);
        oddEven(11);
        oddEven(14);

    }

}
