package java_progs.Lambdas;

import java.util.*;
import java.util.stream.*;

public class StreamMapEx {

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> nums = new ArrayList<Integer>() {
            {
                for (int i = 1; i < 10; i++)
                    add(i);
            }
        };

        List<Integer> Mappednums = nums.stream().map(num -> num * num).collect(Collectors.toList());
        System.out.println(Mappednums);
    }

}
