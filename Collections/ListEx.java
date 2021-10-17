package java_progs.Collections;

import java.util.*;

public class ListEx {
    public static void ReverseList(List<Integer> lst) {
        int i = 0, j = lst.size() - 1;
        while (i < j) {
            int temp = lst.get(j);
            lst.set(j, lst.get(i));
            lst.set(i, temp);
            i++;
            j--;
        }
    }

    public static void display(List<Integer> lst) {
        for (int num : lst) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println(lst);
    }

    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            lst.add(i);
        }
        ReverseList(lst);
        display(lst);
        Collections.sort(lst);
        display(lst);
    }
}
