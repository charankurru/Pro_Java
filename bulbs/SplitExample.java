package java_progs.bulbs;

/**
 * SplitExample
 */
public class SplitExample {
    public static void main(String[] args) {
        String str = "I,Love, coding, very, much";
        String newstr = " ";
        String finalstr = " ";

        // Code to split a given String on delimiter , //s ==> White Space.
        String arr[] = str.split(",");
        for (String str2 : arr) {
            System.out.println(str2);
        }

        // Code to reverse each word in a given String

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                finalstr = finalstr + newstr;
                newstr = " ";
            }
            newstr = str.charAt(i) + newstr;
        }
        finalstr += newstr;
        System.out.println(finalstr);
    }
}