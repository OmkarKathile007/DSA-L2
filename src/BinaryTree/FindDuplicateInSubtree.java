package BinaryTree;

import java.util.HashMap;
import java.util.HashSet;

public class FindDuplicateInSubtree {
    public static class Node{
        int data;
        Node right;
        Node left;

        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static HashMap<Integer,Integer> map = new HashMap<>();

    public static void DuplicateIntoSingle(Node root){
        if (root==null){
            return;
        }
        DuplicateIntoSingle(root.left);
        map.put(root.data, map.getOrDefault(root.data,0)+1);
        DuplicateIntoSingle(root.right);
    }
    public static void RemoveDuplicate(){
      for (Integer i:map.keySet()){
          if (map.get(i)>1){
              System.out.print(i+" ");
          }
      }
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(4);
        root.right=new Node(3);
        root.left.left=new Node(3);
        root.right.right=new Node(3);
        root.right.left=new Node(4);
        root.right.left.left=new Node(3);
        DuplicateIntoSingle(root);
        RemoveDuplicate();


    }
}
