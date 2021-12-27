package java_progs.Collections.Queue;

public class StudentComparable implements Comparable<StudentComparable> {
    String name;
    int age;

    StudentComparable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(StudentComparable sobj) {
        if (age == sobj.age)
            return 0;
        else if (age > sobj.age)
            return 1;
        return -1;
    }
}
