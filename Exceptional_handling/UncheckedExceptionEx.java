package java_progs.Exceptional_handling;

public class UncheckedExceptionEx {

    public static void writeList() {
        int[] arr = new int[10];
        try {
            arr[10] = 11;
        }

        catch (NumberFormatException e1) {
            System.out.println("NumberFormatException => " + e1.getMessage());
        }

        catch (IndexOutOfBoundsException e2) {
            System.out.println("IndexOutOfBoundsException => " + e2.getMessage());
        }

    }

    public static void main(String[] args) {
        writeList();
    }
}
