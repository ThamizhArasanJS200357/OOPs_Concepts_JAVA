

public class ExceptionThrow {
    static void check(int age){
        if(age<18){
            throw new ArithmeticException("Age Invalid");
        }
    }
    public static void main(String[] args) {
        int a=5;
        try {
            check(17);
        } catch (ArithmeticException E) {
            System.out.println(E.getMessage());
        }
        System.out.println("Hello");
    }
}
