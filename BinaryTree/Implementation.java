package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Implementation {
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
             this.val=val;

        }
    }
    Node root;
    Implementation(){
        root=null;
    }
     void insert(int value){
        Node newNode=new Node(value);
        if(root==null){
            root=newNode;
            return;
        }
         Queue<Node> queue =new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node temp=queue.poll();
            if(temp.left==null){
                temp.left=newNode;
                break;
            }
             else{
                 queue.add(temp.left);
            }
             if(temp.right==null){
                 temp.right=newNode;
                 break;
             }
              else{
                  queue.add(temp.right);
             }
        }
     }

     public  void inorder(){
         inorderRec(root);
     }
     public static void inorderRec(Node root){
        if(root==null) return ;
         inorderRec(root.left);
         System.out.print(root.val+" ");
         inorderRec(root.right);
     }
    public static void main(String[] args) {
        Implementation i1=new Implementation();
        i1.insert(1);
        i1.insert(2);
        i1.insert(3);
        i1.insert(4);
        i1.insert(5);
        i1.insert(6);
        i1.insert(7);
        i1.inorder();


    }
}
