package LinkedList;

public class DoublyLinkedList {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;

        }



    }
    public static Node head;
    public static int size;

    public static Node tail;
    public void addFirst(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
           head=tail=newnode;
           return;
        }
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
    }

     public void print(){

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" <-> ");
            temp=temp.next;
        }
         System.out.print("null");
         System.out.println();
     }
     public int removeFirst(){
        if(head==null){
            System.out.println("DoublyLinked List is Empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val= head.data;
            head=tail=null;
            size=0;
        }
        int val= head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;

     }
     public void addLast(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=newnode;
            return;
        }
        tail.next=newnode;
        newnode.prev=tail;
        tail=newnode;
     }
     public int removeLast(){
        if (head==null){
            System.out.println("DoublyLinkedList is Empty");
            return Integer.MAX_VALUE;
        }
        int val=tail.data;
        tail=tail.prev;
        tail.next=null;
        size--;
        return val;
     }
    public static void main(String[] args) {
          DoublyLinkedList dll=new DoublyLinkedList();
          dll.addFirst(3);
          dll.addLast(6);
          dll.addFirst(2);
          dll.addFirst(1);
          dll.addLast(4);

          dll.print();
//          dll.removeFirst();;
        dll.removeLast();
          dll.print();
    }
}
