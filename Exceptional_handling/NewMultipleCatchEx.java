package java_progs.Exceptional_handling;

public class NewMultipleCatchEx {
    public static void main(String[] args) {
        try {
            int num = 5 / 0;
            System.out.println(num);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
    // public static void main(String[] args) {
    // try {
    // int array[] = new int[10];
    // array[10] = 30 / 0;
    // } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
    // System.out.println(e.getMessage());
    // }
    // }
}
