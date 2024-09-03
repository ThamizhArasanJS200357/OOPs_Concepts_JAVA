
class UserDefined extends Exception{
     UserDefined(String str) {
        super(str);
    }
    
}
public class ExceptionThrows {
    static void check(int age)throws UserDefined{
        if(age<18){
            throw new UserDefined("Age Invalid");
        }
    }
    public static void main(String[] args) {
        int a=5;
        try {
            check(17);
        } catch (UserDefined E) {
            System.out.println(E.getMessage());
        }
        System.out.println("Hello");
    }
}
