package BinaryTree;

import java.nio.file.NotDirectoryException;

public class SumofThree {
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

    public static int KthAncestor(Node root){
        if (root==null){
            return 0;
        }
        int leftChild=KthAncestor(root.left);
        int RightChild=KthAncestor(root.right);


        int data= root.data;

        int newLeft=root.left==null ?0: root.left.data;
        int newRight=root.right==null?0:root.right.data;

        root.data=newLeft+leftChild+newRight+RightChild;
        return data;
    }
    public static void main(String[] args) {

    }
}
