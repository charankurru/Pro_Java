package java_progs.Strings;

public class StringRev {
    public static void main(String args[]) {
        String str = "";
        String str2 = "yashwanth";

        // way one
        // Take an extra string variable and assign the reversed the string to it
        int strlen = str2.length();
        for (int i = strlen - 1; i >= 0; i--)
            str += str2.charAt(i);
        System.out.println(str);

        // way Two
        // Converting string into byte Array and reversing the chars and converting into
        // string.
        byte[] bytestr = str2.getBytes();
        int i = 0, j = bytestr.length - 1;
        while (i < j) {
            byte temp = bytestr[i];
            bytestr[i] = bytestr[j];
            bytestr[j] = temp;
            i++;
            j--;
        }
        System.out.println(new String(bytestr));

        // way Three using the String builder Class.
        String newstr = "I am king!";
        StringBuilder builder = new StringBuilder();
        builder.append(newstr);
        builder.reverse();
        System.out.println(builder);

        // way Four using the chararray
        String name = "CharanCherry";
        char[] chararray = name.toCharArray();
        i = 0;
        j = chararray.length - 1;
        while (i < j) {
            char temp = chararray[i];
            chararray[i] = chararray[j];
            chararray[j] = temp;
            i++;
            j--;
        }
        System.out.println(String.valueOf(chararray));

    }
}
