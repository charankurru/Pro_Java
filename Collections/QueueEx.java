package java_progs.Collections;

import java.util.*;

public class QueueEx {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<Integer>();
        for (int i = 0; i < 5; i++) {
            queue.add(100 - i);
        }
        for (int num : queue) {
            System.out.println(num);
        }

    }
}
