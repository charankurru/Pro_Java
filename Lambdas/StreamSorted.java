package java_progs.Lambdas;

import java.util.*;
import java.util.stream.Collectors;

public class StreamSorted {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(99);
        nums.add(70);
        nums.add(144);
        nums.add(5);
        nums.add(10);
        nums.add(1);

        List<Integer> res = nums.parallelStream().sorted().collect(Collectors.toList());
        System.out.println(res);

        int sum = nums.parallelStream().reduce(0, (ans, i) -> ans + i);

        System.out.println(sum);

    }

}
