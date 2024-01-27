package BinaryTree;

public class KthLevel {
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

    public static void KLevel(Node root,int level,int k){
        if (root==null){
            return;
        }
        if (level==k){
            System.out.print(root.data+" ");
            return;
        }
        KLevel(root.left,level+1,k);
        KLevel(root.right,level+1,k);
    }


    /////>   Finding minimum distance between nodes

    public static Node lca(Node root,int n1,int n2){
        if (root==null){
            return null;
        }

        if (root.data==n1 || root.data==n2){
            return root;
        }

        Node leftlca=lca(root.left,n1,n2);
        Node rightlca=lca(root.right,n1,n2);

        if (root.left==null){
            return root.right;
        }
        if (root.right==null){
            return root.left;
        }

        return root;
    }

    public static int lcaDistance(Node root,int n){
        if (root==null){
            return -1;
        }
        if (root.data==n){
            return 0;
        }
        int lLca=lcaDistance(root.left,n);
        int rLca=lcaDistance(root.right,n);

        if (lLca==-1 && rLca==-1){
            return -1;
        }
         else if (lLca==-1){
            return rLca+1;
        }
        else{
            return lLca+1;
        }
    }

    public static int minDist1(Node root,int n1,int n2){
        Node lca=lca(root,n1,n2);
        int leftlca=lcaDistance(root,n1);
        int rightlca=lcaDistance(root,n2);

        return leftlca+rightlca;
    }

    ////> Kth Ancestor of the Tree

    public static int KthAncestor(Node root,int n,int k){

        if (root==null){
            return -1;
        }
        if (root.data==n){
            return 0;
        }

        int leftLca=KthAncestor(root.left,n,k);
        int rightLca=KthAncestor(root.right,n,k);

        int max=Math.max(leftLca,rightLca);
        if (leftLca==-1 && rightLca==-1){
            return -1;
        }
        else if (max+1==k){
            System.out.println(root.data+" ");
        }

            return max+1;


    }


    /////> SumTree

    public static int SumTree(Node root){
        if (root==null){
            return 0;
        }

        int leftChild=SumTree(root.left);
        int rightChild=SumTree(root.right);

        int data=root.data;

        int newLeft=root.left==null?0:root.left.data;
        int newRight=root.right==null?0:root.right.data;
        root.data=leftChild+newLeft+rightChild+newRight;

        return data;

    }

    public static void main(String[] args) {

        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

//        KLevel(root,1,3);
//        Node root1=lca(root,4,7);
//        int minDist=minDist1(root,4,7);
//        System.out.println(" MiniMum Distance : "+minDist);

        KthAncestor(root,6,2);






    }
}
