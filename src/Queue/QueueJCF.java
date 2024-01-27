package Queue;

import java.util.*;

public class QueueJCF {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<Integer>();
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(4);
        q1.add(5);
        q1.add(10);
        while (!q1.isEmpty()) {
            System.out.println(q1.peek());
            q1.remove();
        }
        Deque<Integer> de=new LinkedList<>();



        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(2);




    }
}

