package java_progs.Strings;

import java.util.*;
public class AnagramEx {
    public static void main(String args[]) {
        System.out.println("hello charan");
        String s = "listen";
        String s2 = "silent";
        System.out.println(StringUtils.isEmpty(s2));
        if (s.length() != s2.length()) {
            System.out.println("Not anagrams");
            return;
        }
        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < s.length(); i++)
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0) + 1);

        for (Character key : mp.keySet())
            System.out.println(key + " " + mp.get(key));

        for (int i = 0; i < s2.length(); i++)
            mp.put(s2.charAt(i), mp.getOrDefault(s2.charAt(i), 0) - 1);

        boolean isana = true;
        for (Character key : mp.keySet())
            if (mp.get(key) != 0) {
                isana = false;
                System.out.println("Not anagrams");
                break;
            }
        if (isana)
            System.out.println("Anagrams");

    }
}
