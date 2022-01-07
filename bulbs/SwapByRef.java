package java_progs.bulbs;

class IntWrapper {
    public int num;

    IntWrapper(int a) {
        this.num = a;
    }

    public void Swap(IntWrapper a, IntWrapper b) {
        int temp = a.num;
        a.num = b.num;
        b.num = temp;
    }
}

public class SwapByRef {
    public static void main(String[] args) throws Exception {
        IntWrapper num1 = new IntWrapper(1);
        IntWrapper num2 = new IntWrapper(2);
        System.out.println("Before swap by ref");
        System.out.println(num1.num + " " + num2.num);
        System.out.println("After swap by ref");
        new IntWrapper(5).Swap(num1, num2);
        System.out.println(num1.num + " " + num2.num);

    }
}
