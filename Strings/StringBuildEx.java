package java_progs.Strings;

public class StringBuildEx {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("charan");
        StringBuffer str1 = new StringBuffer("charan");
        if (str1 == str)
            System.out.println("True");
        else
            System.out.println("False");
        System.out.println(str.equals(str1));

    }
}
