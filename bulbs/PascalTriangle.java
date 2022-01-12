package java_progs.bulbs;

import java.util.*;

public class PascalTriangle {

    static int factorial(int n) {
        int numer = 1;
        for (int i = n; i > 1; i--) {
            numer *= i;
        }
        return numer;
    }

    static int ncr(int n, int r) {
        int result = factorial(n) / factorial(r);
        return result;
    }

    public static void main(String[] params) throws Exception {
        int n = 5;
        List<Integer> points = new ArrayList<Integer>(Collections.nCopies(n, 0));
        points.set(0, 1);
        points.set(1, ncr(n - 1, 1));
        System.out.println(points);
        int nr = n - 1;
        for (int i = 2; i < n; i++) {
            int den = i % nr;
            if (den == 0) {
                points.set(i, 1);
                continue;
            }
            int curr = (points.get(i - 1) * nr - (den - 1)) / den;
            points.set(i, curr);
        }
    }
}
