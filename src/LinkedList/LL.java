package LinkedList;

import java.nio.file.NotDirectoryException;

public class LL {
    private class Node{
        private int data;
        private Node next;
        Node(int data){
            this.data=data;

        }
        Node(int data, Node next){
            this.data=data;
            this.next=next;
        }


    }
    private Node head;
    private Node tail;
    private int size=0;

    public void insert_first(int data){

        Node node=new Node(data);
        node.next=head;
        head=node;

        if (tail==null){
            tail=head;
        }
        size++;

    }
    public void insert_last(int data){
        if (tail==null){
            insert_first(data);
            return;
        }
        Node node =new Node(data);
        node.next=tail;
        tail=new Node(data);

    }

    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LL node = new LL();
        node.insert_first(4);
        node.insert_first(5);
        node.insert_first(6);
        node.insert_first(7);
        node.display();



    }
}
