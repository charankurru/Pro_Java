package java_progs.IOStreams.Character_oriented;

import java.io.*;

public class InputStreamReaderEx {
    public static void main(String args[]) throws IOException {
        InputStream is = new FileInputStream("D:\\testout.txt");
        InputStreamReader reader = new InputStreamReader(is);
        try {
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            reader.close();
        }
    }
}
