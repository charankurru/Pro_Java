package java_progs.Strings;

import java.util.*;

public class Problem1 {
    public static void main(String[] args) throws Exception {

        // Problem1

        String str = "character";
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);
        char ans = ' ';
        int maxi = 0;
        for (char c : map.keySet()) {
            int val = map.get(c);
            if (val > maxi) {
                maxi = val;
                ans = c;
            }
        }
        System.out.println("Most repeating Character is :" + ans);

        // Problem2

        Set<Character> set = new LinkedHashSet<Character>();
        for (int i = 0; i < str.length(); i++)
            set.add(str.charAt(i));

        System.out.println(set);
        String unique = "";
        for (char c : set)
            unique += c;
        System.out.println("String " + str + " after removing duplicates is ==>" + unique);

        // Problem3
        System.out.print("All repeating characters in str ==>");
        for (char c : map.keySet())
            if (map.get(c) > 1)
                System.out.print(c);
        System.out.println();

        // Problem4

        String str1 = "Charan";
        String str2 = "Charan";
        System.out.println(str1.equals(str2));

        // Problem 5 first non-repeating character in str
        for (char c : map.keySet())
            if (map.get(c) == 1) {
                System.out.println("First Non-repeating Character is ==>" + c);
                break;
            }

        String statment = "Charan       loves java"; // "java loves Charan"
        // String res = "";
        // int i = 0;
        // while (i < statment.length()) {
        // String cur = "";
        // while (i < statment.length() && statment.charAt(i) != ' ') {
        // cur += statment.charAt(i);
        // System.out.println(i + " " + statment.charAt(i));
        // i++;
        // }
        // cur += " ";
        // res = cur + res;
        // i++;
        // }
        // System.out.println(res);

        String res = "";
        int i = 0;
        while (i < statment.length()) {
            String cur = "";
            while (i < statment.length() && statment.charAt(i) != ' ') {
                cur = statment.charAt(i) + cur;
                // System.out.println(i + " " + statment.charAt(i));
                i++;
            }
            if (i < statment.length())
                System.out.println(i + "==>" + statment.charAt(i));
            while (i < statment.length() && statment.charAt(i + 1) == ' ') {
                i++;
            }
            cur += " ";
            res += cur;
            i++;
        }
        System.out.println(res);
        System.out.println(Arrays.toString(statment.split("\\s+")));

    }
}