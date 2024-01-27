package BinaryTree;

import Deque.ImplementQueue;

import javax.swing.plaf.BorderUIResource;
import javax.swing.text.InternationalFormatter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class PreOrder {
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

    static StringBuilder sb = new StringBuilder();
    public static void PreOrderTraversal(Node root){
        if (root==null){
//            System.out.print(-1+" ");
            return;
        }
        if (root.left==null){
            sb.append("(");
            sb.append(root.data);
            sb.append(")");
        }
        if (root.right==null){
            sb.append("(");
            sb.append(root.data);
            sb.append(")");
        }
        System.out.print(sb+" ");
        PreOrderTraversal(root.left);
        PreOrderTraversal(root.right);
    }


    public static void InorderTraversal(Node root){   //LVR
        if (root==null){
            return;
        }
        InorderTraversal(root.left);
        System.out.print(root.data+" ");
        InorderTraversal(root.right);
    }


    public static void PostOrderTraversal(Node root){
        if (root==null){
            return;
        }
        PostOrderTraversal(root.left);
        PostOrderTraversal(root.right);
        System.out.print(root.data+" ");
    }

    public static void LevelOrderTraversal(Node root){
        if (root==null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currentNode=q.remove();
            if (currentNode==null){
                System.out.println();
                if (q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currentNode.data+" ");
                if (currentNode.left!=null){
                    q.add(currentNode.left);
                }
                if(currentNode.right!=null){
                    q.add(currentNode.right);
                }
            }
        }

    }

    public static int HeightOfTree(Node root){
        if (root==null){
            return 0;
        }
        int lh=HeightOfTree(root.left);
        int rh=HeightOfTree(root.right);
        return Math.max(lh,rh)+1;
    }

    public static int CountNoOfNodes(Node root){
        if (root==null){
            return 0;
        }
        int lh=CountNoOfNodes(root.left);
        int rh=CountNoOfNodes(root.right);
        return lh+rh+1;
    }

    public static int SumOfNodes(Node root){
        if (root==null){
            return 0;
        }
        int leftsum=SumOfNodes(root.left);
        int rightdum=SumOfNodes(root.right);
        return leftsum+rightdum+root.data;

    }


    ////////////////////////////>   Diameter Calculate of Tree  O(n)
    public static class InfoTree{
        int diameter;
        int height;

        InfoTree(int diameter,int height){
            this.diameter=diameter;
            this.height=height;
        }
    }

    public static InfoTree InfoTreeCalculate(Node root){
        if (root==null){
            return new InfoTree(0,0);
        }
        InfoTree left=InfoTreeCalculate(root.left);
        InfoTree right=InfoTreeCalculate(root.right);
        int finalTree= Math.max(Math.max(left.diameter, right.diameter),left.height+ right.height+1);
        int heightTree=Math.max(left.height, right.height)+1;

        return  new InfoTree(finalTree,heightTree);
    }




    ////////////////////////////>   Diameter Calculate of Tree  O(n*n)
    public static int ClaculateDiameter(Node root){
        if (root==null){
            return 0;
        }
        int leftDia=ClaculateDiameter(root.left);
        int rightDia=ClaculateDiameter(root.right);
        int leftheight=HeightOfTree(root.left);
        int rightheight=HeightOfTree(root.right);
        int self=leftheight+rightheight+1;
        return Math.max(self,Math.max(leftDia,rightDia));
    }

    public static boolean isIdentical(Node mainT,Node SubT){
        if (mainT==null && SubT==null){
            return true;
        } else if (mainT==null || SubT==null || mainT.data!=SubT.data) {
            return false;
        }

        if (!isIdentical(mainT.left,SubT.left)){
            return false;
        }
        if (!isIdentical(mainT.right, SubT.right)){
            return false;
        }
        return true;
    }


    public static boolean SubtreeOfAnother(Node mainT,Node SubT ){
        if (mainT==null){
            return false;
        }
        if (mainT.data==SubT.data){
            if (isIdentical(mainT,SubT)){
                return true;
            }
        }
        return SubtreeOfAnother(mainT.left,SubT) || SubtreeOfAnother(mainT.right,SubT);
    }








    public static void main(String[] args) {
        int Nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1,};
        int nodes[]={1,5,6,7,8,9,10,11};
        BinaryTree tree = new BinaryTree();
        Node root=tree.BuildTree(nodes);
        PreOrderTraversal(root);


//        PostOrderTraversal(root);;


     //          1
     //         / \
     //        2   3
     //       / \ / \
     //      4  5 6  7

//        LevelOrderTraversal(root);
//        Node root= new Node(1);
//        root.left=new Node(2);
//        root.right=new Node(3);
//        root.left.left=new Node(4);
//        root.left.right=new Node(5);
//        root.right.left=new Node(6);
//        root.right.right=new Node(7);
//        LevelOrderTraversal(root);

////        System.out.println(HeightOfTree(root));
////        System.out.println(CountNoOfNodes(root));
////        System.out.println(SumOfNodes(root));
//        System.out.println(ClaculateDiameter(root));

//        System.out.println(InfoTreeCalculate(root).diameter);




     //   Check Sub-root in another NODE
//        Node mainTree= new Node(1);
//        mainTree.left=new Node(2);
//        mainTree.right=new Node(3);
//        mainTree.left.left=new Node(4);
//        mainTree.left.right=new Node(7);
//        mainTree.right.right=new Node(6);
//
//        Node subTree=new Node(2);
//        subTree.left=new Node(4);
//        subTree.right=new Node(5);
//
//
//        System.out.println(SubtreeOfAnother(mainTree,subTree));





        ///////////////////////>





    }
}
