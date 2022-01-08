package java_progs.Exceptional_handling;

public class Blocks {
    public static void main(String[] args) {
        try {
            // @SuppressWarnings("unchecked")
            // String str = null;
            // System.out.println(str.length());
            int num = 5 / 0;
            System.out.println(num);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getClass() + " " + e.getMessage());
        } finally {
            System.out.println("Completed");
        }

    }
}
