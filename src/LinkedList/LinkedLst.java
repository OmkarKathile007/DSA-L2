package LinkedList;

public class LinkedLst {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }


    }

    static Node head;
    static Node tail;

    boolean isEmpty(){
        return head==null;
    }

    void push_back(int data){
        if(isEmpty()){
            head=new Node(data);
        }

        Node newNode=new Node(data);
    }
    void push_front(int data){
        if (isEmpty()){
            head=new Node(data);
        }
        Node newNode= new Node(data);
        newNode.next=head;
        head=newNode;
    }
    int pop_front(){
        if (isEmpty()){
            return -1;
        }
        int data= head.data;
        head=head.next;
        return data;
    }
    int pop_back(){
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        Node check=head;
        while (check!=null){
            check=check.next;
        }
        tail=check;
        int data= tail.data;
        tail=temp;
        return data;
    }

    public static void main(String[] args) {
        LinkedLst ll=new LinkedLst();
        ll.push_back(3);
        ll.push_back(4);
        ll.push_front(2);
        ll.push_front(1);

        Node h1=head;
        while (h1!=null){
            System.out.println(h1.data);
            h1=h1.next;

        }
        ll.pop_back();
        Node h2=head;
        while (h2!=null){
            System.out.println(h1.data);
            h2=h2.next;

        }

    }

}
