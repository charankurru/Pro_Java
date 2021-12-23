package java_progs.oops;

class Student {
    final String college = "Aec";
    static int Start_id = 1;
    String name;
    String branch;
    int roll_no;
    static final int fee = 5000;

    public Student(String name, String branch) {
        this.name = name;
        this.branch = branch;
        this.roll_no = Start_id;
        Start_id++;
    }

    public void display() {
        System.out.println(this.name + " " + this.roll_no + " " + college);
        System.out.println(fee);
    }

}

public class ObjectEx {
    public static void main(String[] args) {
        Student sob = new Student("charan", "IT");
        Student sob2 = new Student("Praveen", "CSE");
        Student sob3 = new Student("cherry", "ECE");
        sob.display();
        sob2.display();
        sob3.display();
    }
}
