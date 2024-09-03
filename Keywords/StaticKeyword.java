// Static Keyword


class Father{
    static char gender='M';
    static void print(){
        System.out.println("Parent Class");
    }
}
class Son extends Father{
    char gender='C';
    
}

public class StaticKeyword {
    public static void main(String[] args) {
        Son obj=new Son();
        System.out.println(Father.gender);
        obj.print();
        Father.print();
    } 
}
