package BinaryTree;

public class DeleteXvalNodes {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left= null;
            this.right=right;
        }
    }
    public static Node DelLeafNodes(Node root, int x){
        if (root==null){
            return null;
        }
        root.left=DelLeafNodes(root.left,x);
        root.right=DelLeafNodes(root.right,x);
        if (root.left==null && root.right==null && root.data==x){
            return null;
        }

        return root;

    }
    public static void InorderTraversal(Node root){
        if (root==null){

            return;
        }
        if(root.left==null && root.right==null){
            System.out.println("Leaf Nodes : "+root.data);
        }
        InorderTraversal(root.left);
        System.out.print(root.data+" ");
        InorderTraversal(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
//        DelLeafNodes(root,3);
        InorderTraversal(root);



    }
}
