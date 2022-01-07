package java_progs.Exceptional_handling;

import java.io.*;

public class CheckedExceptionEx {

    public static void readFile(String filename) throws IOException {
        try {
            FileReader fr = new FileReader(filename);
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getClass() + "==>" + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            readFile("myfile.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
