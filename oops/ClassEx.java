package java_progs.oops;

import java.util.*;

class College {
    // class variables
    final String College_name = "Aditya Engineering College";
    final String chairman = "Shesha Reddy";
    final String Vc = "statish reddy";
    static int studentlimit = 1000;
    static ArrayList<Student> students = new ArrayList<Student>();

    // constructor
    public College() {
        System.out.println("College Name" + College_name);
        System.out.println("Chairman" + chairman);
        System.out.println("Vice Chairman" + chairman);
    }

    // methods
    public boolean Enroll(String name, String opt_branch) {
        Student sob = new Student(name, opt_branch);
        int stud_len = students.size();
        if (stud_len < studentlimit) {
            students.add(sob);
            sob.display();
            return true;
        }
        return false;

    }
}

public class ClassEx {
    public static void main(String[] args) {
        College col = new College();
        boolean isenroll = col.Enroll("charan", "IT");
        if (!isenroll)
            System.out.println("Failed to enroll");

    }
}
