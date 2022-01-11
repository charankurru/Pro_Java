package java_progs.IOStreams.Byte_oriented;

public class ByteEx {

    public static void main(String[] args) {
        String str = "I love java programming.";
        byte[] barr = str.getBytes();
        for (int b : barr)
            System.out.println(b + " ==> " + (char) b);
        if (str.length() == barr.length)
            System.out.println("same length");

        // Displaying all charcters present in programming.
        // for (int i = 0; i < 257; i++) {
        // System.out.println((char) i);
        // }
    }

}