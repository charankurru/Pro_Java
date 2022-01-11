package java_progs.IOStreams.Character_oriented;

import java.io.*;

public class FileReaderEx {
    public static void main(String[] args) throws IOException {
        try (FileReader fr = new FileReader("D://testout.txt")) {
            int data;
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
