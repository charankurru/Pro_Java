package java_progs.IOStreams.Character_oriented;

import java.io.*;

public class BufferReaderEx {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        InputStream is = new FileInputStream("D:\\testout.txt");
        int avil = is.available();
        char[] carr = new char[avil];
        try (Reader rdr = new BufferedReader(new InputStreamReader(is))) {
            rdr.read(carr, 0, avil);
            for (char c : carr)
                System.out.print(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter your name please");
        String name = br.readLine();
        System.out.println(name);

    }
}
