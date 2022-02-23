package java_progs.bulbs;

import java.util.*;

public class PrimeNum {
    public static void main(String[] args) {
        int n = 15;
        List<Integer> lst = new ArrayList<Integer>();
        for (int i = 2; i < n; i++) {
            boolean isprime = true;
            System.out.println(i);
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                lst.add(i);
            }
            // System.out.println(lst);
        }
        System.out.println(lst);
    }
}