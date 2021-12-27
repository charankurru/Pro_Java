package java_progs.Collections.Queue;

import java.util.*;
import java.util.Comparator;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class AgeComparator implements Comparator<Student> {

    public int compare(Student s1, Student s2) {

        if (s1.age == s2.age)
            return 0;
        else if (s1.age > s2.age)
            return 1;
        return -1;
    }

}

class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class ComparatorEx {
    public static void main(String[] args) {
        ArrayList<Student> lst = new ArrayList<Student>();
        lst.add(new Student("charan", 25));
        lst.add(new Student("jai", 20));
        lst.add(new Student("bhargav", 15));
        lst.add(new Student("puja", 18));

        Collections.sort(lst, new AgeComparator());

        System.out.println("Sorting the data based on Age");

        for (Student student : lst)
            System.out.println(student.name + " " + student.age);
        System.out.println();

        Collections.sort(lst, new NameComparator());

        System.out.println("Sorting the data based on Name");

        for (Student student : lst)
            System.out.println(student.name + " " + student.age);

    }
}
