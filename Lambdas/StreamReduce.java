package java_progs.Lambdas;

import java.util.*;

public class StreamReduce {

    public static void main(String[] args) throws Exception {

        ArrayList<Integer> nums = new ArrayList<Integer>() {
            {
                for (int i = 1; i < 10; i++)
                    add(i);
            }
        };

        // Generate sum of all even numbers

        int evensum = nums.stream().filter(num -> num % 2 == 0).reduce(0, (ans, i) -> ans + i);

        int oddsum = nums.stream().filter(num -> num % 2 == 1).reduce(0, (ans, i) -> ans + i);

        System.out.println("Even sum of all  numbers" + evensum);
        System.out.println("Odd sum of all numbers" + oddsum);

    }

}
