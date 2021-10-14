package java_progs;

class SampleTest {
    int val1 = 88, val2 = 99;

    public SampleTest(int val, int val2) {
        this.val1 = val;
        this.val2 = val2;
    }

    public int getter() {
        return val1 + val2;
    }
}

public class FirstProg {
    public static void main(String[] args) {
        System.out.println("Hello World");
        SampleTest obj = new SampleTest(1232, 1235);
        System.out.println(obj.getter());
        String str = "LoveProgramming";
        char ch[] = str.toCharArray();
        int i = 0, j = str.length() - 1;
        while (i < j) {
            char c = ch[j];
            ch[j] = ch[i];
            ch[i] = c;
            i++;
            j--;
        }
        str = String.valueOf(ch);
        System.out.println(str);
    }
}