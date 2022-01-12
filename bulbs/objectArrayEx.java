package java_progs.bulbs;

import java.util.*;

class ArrayObjects {
    String name;

    public ArrayObjects(String name) {
        this.name = name;
    }
}

public class objectArrayEx {
    public static void main(String[] args) {
        ArrayObjects a = new ArrayObjects("Leela");
        ArrayObjects b = new ArrayObjects("Pandu");
        ArrayObjects c = new ArrayObjects("Ducky");
        ArrayObjects arr[] = new ArrayObjects[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        // System.out.println(arr);
        System.out.println(Arrays.deepToString(arr));
        for (ArrayObjects obj : arr) {
            System.out.println(obj.name);
        }
        Object[][] orr = new Object[3][3];
        orr[0] = new Object[] { "Sam", "Jam" };
        orr[1] = new Object[] { 1, 2 };
        orr[2] = new Object[] { 1.222, "hello" };

        ArrayObjects[][] samp = new ArrayObjects[2][2];
        samp[0] = new ArrayObjects[] { a, b, };

    }
}
