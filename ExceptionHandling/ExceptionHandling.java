

public class ExceptionHandling {
    public static void main(String[] args) {
        int a=5;
        int b=7;
        try {
            System.out.println(a/b);
        } 
        catch (ArithmeticException E) {
            System.out.println("b is 0");

        }
        catch(Exception E){
            System.out.println("b is 0");
        }
        finally{
            System.out.println("Finally Block");
        }

    }
}
