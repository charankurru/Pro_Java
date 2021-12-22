package java_progs.Collections.Queue;

import java.util.*;

public class DequeEx {
    /**
     * add(obj),offer(obj) ==> Theese methods are used to insert elems into dq
     * offerFirst(obj) ==> used to insert the element at First position
     * element(),peek() ==> Theese methods are used to get top element of dq
     * remove(obj) ==> used to remove the specified element from the dq
     * poll() ==> used to remove and retrive the top element of the dq
     * pollLast() ==> used to remove the last element of the dq
     */
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<Integer>();
        for (int i = 0; i < dq.size(); i++)
            dq.offer(i * 2);
        System.out.println("Size of the Deque is " + dq.size());
        System.out.println(dq);
        dq.offerFirst(1111);
        System.out.println("After Adding element at first using offerFirst: " + dq);
        System.out.println("poping first element from dq" + dq.poll());
        System.out.println("poping the last element from dq" + dq.pollLast());

    }
}
