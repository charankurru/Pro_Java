package java_progs.IOStreams.Byte_oriented;

import java.io.*;

public class FileInputStreamEx {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        try (FileInputStream fs = new FileInputStream("D:\\testout.txt")) {

            // 1) using read();
            int data;
            System.out.println("reading data byte by byte");
            while ((data = fs.read()) != -1)
                System.out.print((char) data);
            System.out.println();
            System.out.println();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try (FileInputStream fs = new FileInputStream("D:\\testout.txt")) {
            // 2) using read(byte[] b)
            int avail = fs.available();
            byte[] buf = new byte[avail];
            int byte_num = fs.read(buf); // returns number of bytes read.
            System.out.println("Total number of bytes available: " + byte_num);
            for (byte b : buf) {
                System.out.print((char) b);
            }
            System.out.println();
            System.out.println();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try (FileInputStream fs = new FileInputStream("D:\\testout.txt")) {
            // 2) using read(byte[] b , offset, len)
            int avail = fs.available();
            byte[] buf = new byte[avail];
            int byte_num = fs.read(buf, 4, 5); // returns number of bytes read.
            System.out.println("Total number of bytes available: " + byte_num);
            for (byte b : buf) {
                System.out.print((char) b);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
