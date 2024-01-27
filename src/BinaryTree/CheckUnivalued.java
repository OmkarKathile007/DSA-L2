package BinaryTree;

public class CheckUnivalued
{
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static Boolean CheckUniValued(Node root,int child){
        if (root==null){
            return true;
        }
        if (child!= root.data){
            System.out.println("All Values are Not equal");
            return false;
        }

        return CheckUniValued(root.left,child ) && CheckUniValued(root.right,child);
    }
    public static void main(String[] args) {
         Node root = new Node(4);
         root.left=new Node(4);
         root.right=new Node(4);
         root.left.left=new Node(4);
         root.left.right=new Node(4);
         root.right.right=new Node(4);
         root.right.left=new Node(4);

        System.out.println(CheckUniValued(root,root.data));;
    }
}
