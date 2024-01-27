package LinkedList;

import javax.imageio.plugins.tiff.FaxTIFFTagSet;
import javax.xml.stream.FactoryConfigurationError;

public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    public static Node Head;
    public static Node Tail;
    public static int size;
    public void addFirst(int data){
        Node newnode=new Node(data);
        size++;
        if (Head==null){
            Head=Tail=newnode;
            return;
        }
        newnode.next=Head;
        Head=newnode;
    }
    public void addLast(int data){
        Node newnode = new Node(data);
        size++;
        Tail.next=newnode;
        Tail=newnode;

    }
    public void Print(){
      Node temp=Head;
      while(temp != null){
          System.out.print(temp.data+"--->");
          temp=temp.next;
      }
        System.out.println("null");
    }
    public void add(int indx,int data){

        if(indx==0){
            addFirst(data);
            return;
        }
        Node newnode = new Node(data);
        size++;
        Node temp=Head;
        int i=0;
        while(i<indx-1){
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
    public int removeFirst(){

        if (size==0){
            System.out.println("List is Empty");
            return 0;
        }
        else if(size==1){
            int val=Head.data;
            Head=Tail=null;
            size=0;
            return val;
        }
        int val=Head.data;
        Head=Head.next;
        size--;
        return val;

    }
    public int removeLast(){
        if(size==0){
            return 0;

        }
        else if(size==1){
            int val=Head.data;
            Head=Tail=null;
            size=0;
            return val;
        }
        Node prev=Head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=Tail.data;
        prev.next=null;
        Tail=prev;
        size--;
        return val;
    }

    public int IterSearch(int key){
        int indx=0;
        Node temp=Head;
        while(temp!=null){
            if (temp.data==key){
                return indx;
            }
            temp=temp.next;
            indx++;
        }
        return -1;
    }
    public int Helper(Node head,int key){
        if (head==null){
            return -1;
        }
        if (head.data==key){
            return 0;
        }
        int index=Helper(head.next,key);
        if (index==-1){
            return -1;
        }
        return index+1;
    }
    public int RecSearch(int key){
        return Helper(Head,key);
    }
    public  void reverse(){
        Node prev=null;
        Node curr=Tail=Head;
        Node next;
        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Head=prev;
    }

   public void FindNElement(int n){
        int sz=0;
        Node temp=Head;
        while(temp!=null){
            temp = temp.next;
            sz++;
        }
        if(n==sz){
            Head=Head.next;
            return;
        }
        int i=1;
        int itoFind=n-sz;
        Node prev=Head;
        while (i < itoFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
   }

   // Pallindrome

    public Node  SlowFast(){
        Node slow=Head;
        Node Fast=Head;
        while(Fast!=null && Fast.next!=null){
            slow=slow.next;
            Fast=Fast.next.next;
        }
        return slow;
    }
    public boolean  Pallindrome(){
        if(Head==null || Head.next==null){
            System.out.println("Not Enough Node in Linked List");
            return false;
        }

        Node prev=null;
        Node curr=SlowFast();;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=Head;
        while (right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
     // CHECK CYCLE IN LINKED-LIST
    public static boolean IsCycled(){
        Node slow=Head;
        Node Fast=Head;
        while(Fast!=null && Fast.next!=null){
            slow=slow.next;
            Fast=Fast.next.next;
            if(slow==Fast){
                return true;
            }
        }
        return false;
    }

    // REMOVE CYCLE IN LINKEDLIST
    public static void RemoveCycle(){
        Node slow=Head;
        Node Fast=Head;
        boolean cycle=false;
        while(Fast!=null && Fast.next!=null){
            slow=slow.next;
            Fast=Fast.next.next;
            if(slow==Fast){
                cycle=true;
                break;
            }
        }
        if (cycle==false){
            return;
        }
        slow=Head;
        Node prev=null;
        while (slow!=Fast){
            prev=Fast;
            slow=slow.next;
            Fast=Fast.next;
         }
        prev.next=null;
    }

    // MERGE SORT
    private Node findMid(Node head){
        Node slow=head;
        Node Fast=head.next;
        while(Fast!=null && Fast.next!=null){
            slow=slow.next;
            Fast=Fast.next.next;
        }
        return slow;
    }
    public Node MergeSort(Node Head){
      if(Head==null && Head.next==null){
          return Head;
      }
      Node mid=findMid(Head);
      Node right=mid.next;
        mid.next=null;
      Node lefthalf=MergeSort(Head);
      Node righthalf=MergeSort(right);

      return Merge(lefthalf,righthalf);
    }

    private Node Merge(Node head1,Node head2){
        Node mergell=new Node(-1);
        Node temp=mergell;
        while(head1!=null && head2!=null){
            if(head1.data<= head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while (head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergell.next;
    }

    public void Zigzag(){


        Node slow=Head;
        Node fast=Head.next;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;
        Node prev=null;
        Node curr=mid.next;
        mid.next=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=Head;
        Node right=prev;
        Node nextL,nextR;
        while(left!=null && right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            left=nextL;
            right=nextR;
        }

    }




    public static void main(String[] args) {
//        LinkedList ll= new LinkedList();
//        ll.addFirst(2);
//        ll.addFirst(3);
//        ll.addLast(4);
//        ll.addLast(5);
//        ll.add(2,10);     // Insert the value at that index
//
//          ll.Print();
//          ll.reverse();
//          ll.Print();
//          ll.FindNElement(3);
//          ll.Print();


//        ll.removeFirst();
//        ll.Print();
//        ll.removeLast();
//        ll.Print();
//        System.out.println("Key Found at Index :"+ll.IterSearch(4));
//        System.out.println(ll.RecSearch(100));

//        System.out.println("Length of LinkedList :"+ll.size);


        // SLOW FAST APPROACH FLOYD'S ALGORITHM
//        Head= new Node(1);
//        Head.next=new Node(2);
//        Node temp=new Node(3);
//        Head.next=temp;
//        Head.next.next=new Node(3);
//        Head.next.next.next=new Node(4);
////        Head.next.next.next.next=temp;
//
//        System.out.println(IsCycled());
//        RemoveCycle();
//        System.out.println(IsCycled());

        LinkedList ll=new LinkedList();
//        ll.addFirst(1);
//        ll.addFirst(2);
//        ll.addFirst(2);
//        ll.addFirst(2);
//        ll.addFirst(1);
//        ll.Print();
////        ll.reverse();
//        System.out.println(ll.Pallindrome());
//        ll.Print();
//        ll.Head=ll.MergeSort(ll.Head);
//        ll.Print();
//        ll.Print();


        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.Print();
        ll.Zigzag();
        ll.Print();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);

        LinkedList ll2=new LinkedList();
        ll2.addFirst(10);
        ll2.addFirst(11);
        ll2.addFirst(12);
        ll2.addFirst(13);
        ll2.addFirst(14);





    }
}
