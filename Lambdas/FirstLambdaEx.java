package java_progs.Lambdas;

interface mylambda {
    public void foo();
}

interface MathOperation {
    public int domath(int a, int b);
}

interface NewYear {
    default void testday() {
        System.out.println("Today is 01/01/2022");
    }
}

class TestNew implements NewYear {

}

public class FirstLambdaEx {

    public static void hello(mylambda greet) {
        greet.foo();
    }

    public static int calculate(int a, int b, MathOperation operation) {
        return operation.domath(a, b);
    }

    public static void main(String[] args) {
        System.out.println("This is the first program");
        mylambda greet = () -> System.out.println("I am Lambda !!");
        hello(greet);

        MathOperation add = (int a, int b) -> a + b;
        MathOperation sub = (int a, int b) -> a - b;
        MathOperation mul = (int a, int b) -> a * b;
        MathOperation div = (int a, int b) -> a / b;

        System.out.println("Add of 1+2 is : " + calculate(1, 2, add));
        System.out.println("Sub of 2-1 is : " + calculate(2, 1, sub));
        System.out.println("Mul of 2*2, is: " + calculate(2, 2, mul));
        System.out.println("Div of 8/4 is : " + calculate(8, 4, div));

        TestNew testnew = new TestNew();
        testnew.testday();

    }
}