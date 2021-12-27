package java_progs.Collections.Queue;

import java.util.*;

/**
 * Here we are Using PriortyQueue to order the objects of Student class
 * Since, Student class is an User-defined class ,PriorityQueue cannot sort
 * elements directly
 * For PriorityQueue to odrer objects of User-defined class
 * ==> User-defined class must implement Comparable interface and also define
 * compareTo
 * ==> compareTo(obj) used to compare data of our specific, and order the
 * elements
 */

public class PrioQObjEx {
    public static void main(String[] args) {
        PriorityQueue<StudentComparable> pq = new PriorityQueue<StudentComparable>();
        pq.add(new StudentComparable("charan", 25));
        pq.add(new StudentComparable("jai", 20));
        pq.add(new StudentComparable("bhargav", 15));
        pq.add(new StudentComparable("puja", 18));

        while (pq.size() > 0) {
            StudentComparable obj = pq.poll();
            System.out.println(obj.name + " " + obj.age);
        }

    }
}