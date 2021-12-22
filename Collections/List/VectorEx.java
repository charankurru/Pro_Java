package java_progs.Collections.List;

import java.util.*;

public class VectorEx {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<Integer>();
        for (int i = 0; i < 5; i++)
            vec.add(i);
        System.out.println(vec);
        int l = 0, r = vec.size() - 1;

        // reversing the elements of vector.
        while (l < r) {
            int temp = vec.get(r);
            vec.set(r, vec.get(l));
            vec.set(l, temp);
            l++;
            r--;
        }
        System.out.println(vec);

        // Sorting the array by ascending order
        Collections.sort(vec);
        System.out.println(vec);
    }
}
