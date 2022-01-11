package java_progs.IOStreams.Byte_oriented;

import java.io.*;

public class FileOutputStreamEx {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        String str = " I will Crack maersk Interview and get placed in Maersk";
        byte[] bstr = str.getBytes();
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            fos.write(bstr);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
