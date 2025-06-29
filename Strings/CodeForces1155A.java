package Strings;

public class CodeForces1155A {
    public static void main(String[] args) {
        String str="tour";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if((ch=='A' || ch=='a') || (ch=='O' || ch=='o' ) || (ch=='Y' || ch=='y' ) || (ch=='E' || ch=='e' )||(ch=='U' || ch=='u' ) || (ch=='I' || ch=='i' ) ){
                continue;
            }
             else {
                 sb.append('.');
                sb.append(Character.toLowerCase(ch));
            }

        }
        System.out.println(sb.toString());
    }
}
