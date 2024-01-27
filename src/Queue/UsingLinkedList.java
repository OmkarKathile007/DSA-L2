package Queue;

public class UsingLinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static class Queue{
        public static Node head;
        public static Node tail;

        public static boolean isEmpty(){
            return head==null & tail==null;
        }

        public static void add(int data){
            Node newnode=new Node(data);
            if (head==null){
                head=tail=newnode;
            }
            tail.next=newnode;
            tail=newnode;
        }

        public static int  remove(){
            if (isEmpty()){
                System.out.println("Linked list is Empty");
                return -1;
            }
            int front =head.data;
            if (tail==head){
                tail=head=null;
            }
            else {
                head = head.next;
            }
            return front;
        }
        public static int peek(){
            if (head==null){
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
           Queue q= new Queue();
           q.add(5);
           q.add(4);
           q.add(6);

           while(!q.isEmpty()){
               System.out.println(q.peek());
               q.remove();
           }


    }
}
