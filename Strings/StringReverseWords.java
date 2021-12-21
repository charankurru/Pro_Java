package java_progs.Strings;

public class StringReverseWords {

    // 1)
    // Two types of String Reversing here
    // Reverse characters of all words in string,maintain order

    // 2)
    // reverse the words

    public static void main(String[] args) {
        String str = "Hello Newyork! I am Spiderman here!";
        String rev = "";
        String s = " ";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                rev += s;
                s = "";
            }
            s = str.charAt(i) + s;
        }
        System.out.println(rev);
        rev = "";
        s = " ";
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                rev += s;
                s = "";
            }
            s = str.charAt(i) + s;
        }
        System.out.println(rev + s);
    }

}
