package java_progs.Exceptional_handling;

import java.io.*;

public class TryWithResource {
    public static void main(String[] args) {
        String line;
        // this is try-with-resource the resources are automatically closed;
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            while ((line = br.readLine()) != null) {
                System.out.println("Line =>" + line);
            }
        } catch (IOException e) {
            System.out.println("IOException in try block =>" + e.getMessage());
        }
    }
}
