package java_progs.Collections.Queue;

import java.util.*;

public class QueueEx {
    /**
     * add(obj),offer(obj) ==> Theese methods are used to insert elems into pq
     * element(),peek() ==> Theese methods are used to get top element of pq
     * remove(obj) ==> used to remove the specified element from the pq
     * poll() ==> used to remove and retrive the top element of the pq
     */
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < 5; i++) {
            queue.add(100 - i);
        }
        System.out.println(queue);
        while (queue.size() != 0) {
            System.out.println(queue.element() + " " + queue.peek());
            System.out.println("Size of the queue is " + queue.size());
            queue.poll();

        }

    }
}
