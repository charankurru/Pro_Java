package java_progs.Collections.List;

import java.util.*;

class ArrayListEx {

    public static void Display(ArrayList<String> lst) {
        for (int i = 0; i < lst.size(); i++) {
            System.out.print(lst.get(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        sc.close();
        for (int i = 0; i < 5; i++) {
            list.add("roll num:" + Integer.toString(i));
        }
        System.out.println(list);

        // Initializing Arraylist we pre data.
        ArrayList<Integer> nums = new ArrayList<Integer>() {
            {
                for (int i = 0; i < 5; i++)
                    add(-1);
            }
        };
        System.out.println(nums);

        // using Collections.nCopies method we can fill the array with values
        ArrayList<Integer> newlst = new ArrayList<Integer>(Collections.nCopies(20, -1));

        // updating the data of newlst arraList
        for (int i = 0; i < newlst.size(); i++) {
            newlst.set(i, newlst.get(i) + i);
        }

        // removing first two elements from newlst
        newlst.remove(0);
        newlst.remove(0);
        System.out.println(newlst);

        // Increasing the value of each element by 10X
        for (int i = 0; i < newlst.size(); i++)
            newlst.set(i, newlst.get(i) * 10);
        System.out.println(newlst);

        // Shifting the array values by 1 to left side of
        for (int i = 1; i < newlst.size(); i++) {
            newlst.set(i - 1, newlst.get(i));
        }
        newlst.remove(newlst.size() - 1);
        System.out.println(newlst);
    }
}
