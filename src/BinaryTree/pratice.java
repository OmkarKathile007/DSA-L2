package BinaryTree;

public class pratice {
    static class Node {
        int data;
        Node right;
        Node left;


        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

        static class BinaryTree1 {
            static int indx=-1;
            public static Node BuildTree(int nodes[]) {
                indx++;
                if (nodes[indx] == -1) {
                    return null;
                }

                Node newNode = new Node(nodes[indx]);
                newNode.left = BuildTree(nodes);
                newNode.right = BuildTree(nodes);
                return newNode;
            }
            public static void Pre_Order1(Node root){
                if (root==null){
                    return;
                }
                System.out.print(root.data+" ");
                Pre_Order1(root.left);
                Pre_Order1(root.right);
            }




        }




    public static void main(String[] args) {
        int nodes[]={1,5,6,7,8,9,10};
        BinaryTree1 newN=new BinaryTree1();
        Node root=newN.BuildTree(nodes);
//        System.out.println("Root Node of the Tree : "+root.data);
        newN.Pre_Order1(root);




    }
}
