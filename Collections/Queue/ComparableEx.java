package java_progs.Collections.Queue;

import java.util.*;

public class ComparableEx {
    public static void main(String[] args) {
        ArrayList<StudentComparable> lst = new ArrayList<>();
        lst.add(new StudentComparable("charan", 25));
        lst.add(new StudentComparable("jai", 20));
        lst.add(new StudentComparable("bhargav", 15));
        lst.add(new StudentComparable("puja", 18));
        Collections.sort(lst, Collections.reverseOrder());
        for (StudentComparable student : lst)
            System.out.println(student.name + " " + student.age);

    }
}
