package java_progs.Lambdas;

import java.util.*;
import java.util.stream.Collectors;

public class StreamEx {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<Integer>() {
            {
                for (int i = 1; i < 11; i++)
                    add(i);
            }
        };

        List<Integer> res = new ArrayList<Integer>();
        nums.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * num)
                .forEach(res::add);
        System.out.println(res);

        List<Integer> newres = nums.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * num)
                .collect(Collectors.toList());

        System.out.println(newres);

    }
}
