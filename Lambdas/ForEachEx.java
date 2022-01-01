package java_progs.Lambdas;

import java.util.*;

public class ForEachEx {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> nums = new ArrayList<Integer>() {
            {
                for (int i = 1; i < 11; i++)
                    add(i);
            }
        };

        nums.forEach(System.out::print);
        System.out.println();

        nums.forEach(element -> {
            if (element % 2 == 0)
                System.out.println(element + " Even Number");
            else
                System.out.println(element + " Odd Number");
        });
    }

}
