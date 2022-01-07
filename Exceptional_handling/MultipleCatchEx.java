package java_progs.Exceptional_handling;

public class MultipleCatchEx {

    // we should not specify Base Exception above sub classes as it throws compile
    // time error.

    public static void main(String[] args) {
        // try {
        // int num = 5 / 0;
        // System.out.println(num);
        // } catch (Exception e) {
        // System.out.println(e.getClass() + " " + e.getMessage());
        // } catch (NullPointerException e) {
        // System.out.println(e.getMessage());
        // } finally {
        // System.out.println("Completed");
        // }

        try {
            int num = 5 / 0;
            System.out.println(num);
        } catch (ArithmeticException e) {
            System.out.println(e.getClass() + " " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println(e.getClass() + " " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Completed");
        }

    }
}
