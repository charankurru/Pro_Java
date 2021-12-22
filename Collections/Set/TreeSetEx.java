package java_progs.Collections.Set;

import java.util.*;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        set.addAll(Arrays.asList(9, 1, 3, 5, 25, 11, 33, 7));
        System.out.println("TreeSet :" + set);

        // Ceiling ==> used to return equal or closet greatest element from set or
        // return null;
        System.out.println("ceil value of 17 is : " + set.ceiling(17));

        // floor ==> used to return equal or closet low element from set or null
        System.out.println("floor value of 17 is :" + set.floor(17));

        // headSet ==> used to return group of elements less than given element from set
        // or null
        System.out.println("headSet 17 is :" + set.headSet(17));

        // tailSet ==> Used to return group of elements less than given element from set
        System.out.println("tailSet  17 is :" + set.tailSet(17));

        // higher ==> used to return closet higher of given element
        System.out.println("Closest greater value of 17 is :" + set.higher(17));

        // lower ==> used to return closet lower of given element
        System.out.println("Closest lower value of 17 is :" + set.lower(17));

        // pollFirst ==> used to retrive and remove the first element i.e lowest value
        System.out.println("Lowest value from set is (ele is poped) :" + set.pollFirst());

        // pollLast ==> used to retrive and remove the last element i.e highest value
        System.out.println("highest value from set is (ele is poped):" + set.pollLast());

        System.out.println("TreeSet :" + set);

        // First() ==> It returns the first (lowest) element currently in this sorted
        // set.
        System.out.println("lowest value from set is " + set.first());

        // last() ==> It returns the last element currently in this sorted set,i.e
        // highest value
        System.out.println("Highest value from set is " + set.last());

    }
}
