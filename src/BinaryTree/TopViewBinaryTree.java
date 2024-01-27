package BinaryTree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopViewBinaryTree {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static class BinaryTree{
        static int indx=-1;

        public static Node BuildTree(int Nodes[]){
            indx++;
            if(Nodes[indx]==-1){
                return null;
            }
            Node newnode = new Node(Nodes[indx]);
            newnode.left=BuildTree(Nodes);
            newnode.right=BuildTree(Nodes);

            return newnode;

        }
    }
    public static class Info{
        Node node;
        int hd;

        public Info(Node data, int hd){
            this.node=data;
            this.hd=hd;
        }
    }
    public static void BinaryTree(Node root) {
        Queue<Info> que = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        que.add(new Info(root, 0));
        que.add(null);
        int min = 0;
        int max = 0;

        while (!que.isEmpty()) {
            Info curr = que.remove();
            if (curr == null) {
                if (que.isEmpty()) {
                    break;
                } else {
                    que.add(null);
                }

            }
            else {
                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }

                if (curr.node.left != null) {
                    que.add(new Info(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }
                if (curr.node.right != null) {
                    que.add(new Info(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }
        }

        for (int i = min; i <= max; i++) {
            System.out.print((map.get(i)).data+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node root= new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        BinaryTree(root);
    }
}
