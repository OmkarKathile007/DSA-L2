package BinaryTree;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LowestCommonAncestor {
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

    public  static boolean getPath(Node root,int n,ArrayList<Node> path)
    {
        if (root==null){
            return false;
        }
        path.add(root);

        if (root.data==n){
            return true;
        }
        boolean FoundLeft=getPath(root.left,n,path);
        boolean FoundRight=getPath(root.right,n,path);

        if (FoundLeft || FoundRight){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }

    public static Node lca(Node root, int n1, int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2=new ArrayList<>();

        getPath(root,n1,path1);
        getPath(root,n2,path2);


        int i=0;
        for (;i<path1.size() && i<path2.size();i++){
              if (path1.get(i)!=path2.get(i)){
                  break;
              }
        }

        Node lca=path1.get(i-1);
        return lca;
    }


    public static Node lca2(Node root,int n1,int n2){
        if (root==null ||root.data==n1||root.data==n2){
             return root;
        }

        Node leftLca=lca2(root.left,n1,n2);
        Node RightLca=lca2(root.right,n1,n2);

        if (leftLca==null){
            return RightLca;
        }
        if (RightLca==null){
            return leftLca;
        }

        return root;
    }



    /// Minimum distance between Two Node

    public static int LcaDist(Node root,int n){
        if (root==null){
            return -1;
        }

        if (root.data==n){
            return 0;
        }

        int LeftDist=LcaDist(root.left,n);
        int RightDist=LcaDist(root.right,n);

        if (LeftDist==-1 && RightDist==-1){
            return -1;
        }
        else if(LeftDist==-1){
            return RightDist+1;
        }
        else{
            return LeftDist+1;
        }
    }
    public static int MinDistance(Node root,int n1,int n2){
        Node MinDist=lca2(root,n1,n2);
        int dist1=LcaDist(MinDist,n1);
        int dist=LcaDist(MinDist,n2);

        return dist+dist1;

    }


    public static void main(String[] args) {
        Node newnode = new Node(1);
        newnode.left= new Node(2);
        newnode.left.left= new Node(3);
        newnode.left.right=new Node(4);
        newnode.right=new Node(5);
        newnode.right.left=new Node(6);
        newnode.right.right=new Node(7);
        newnode.right.right.right=new Node(8);

//        System.out.println(lca2(newnode,3,4).data);
        System.out.println(MinDistance(newnode,3,8));
    }
}
