package BinarySearchTree;

public class Implementation {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }
    }
    public void delete(Node root,int x){
        
    }
     public  Node insert(Node root,int x){
//        O(logn)
        if(root==null){
            Node n=new Node(x);
            return n;
        }
        if(root.val>x){
            if(root.left==null) root.left=new Node(x);
            else{
                insert(root.left,x);
            }
        }
          else{
              if(root.right==null){
                  root.right=new Node(x);
              }
               else{
                   insert(root.right,x);
              }
        }
            return root;

     }
       public void inorder(Node root){
        if(root==null) return ;
           inorder(root.left);
           System.out.println(root.val);
           inorder(root.right);
       }
    public static void main(String[] args) {
        Node root=null;
        Implementation i1=new Implementation();
        root=i1.insert(root,5);
       root= i1.insert(root,6);
       root= i1.insert(root,4);
       root=i1.insert(root,8);
       root=i1.insert(root,1);
       root=i1.insert(root,2);
        i1.inorder(root);


    }
}
