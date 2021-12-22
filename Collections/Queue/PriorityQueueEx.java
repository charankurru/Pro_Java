package java_progs.Collections.Queue;

import java.util.*;

public class PriorityQueueEx {

    /**
     * add(obj),offer(obj) ==> Theese methods are used to insert elems into pq
     * element(),peek() ==> Theese methods are used to get top element of pq
     * remove(obj) ==> used to remove the specified element from the pq
     * poll() ==> used to remove and retrive the top element of the pq
     */

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(99);
        pq.add(100);
        pq.add(10);
        pq.add(1);

        while (pq.size() != 0) {
            System.out.println(pq.poll());
        }

        PriorityQueue<Character> cp = new PriorityQueue<>();
        cp.add('c');
        cp.add('a');
        cp.add('b');
        while (cp.size() != 0) {
            // System.out.println(cp.element());
            System.out.println(cp.peek());
            System.out.println(cp.poll());
        }

    }
}
