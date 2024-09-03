// Single Inheritances


class Father{
    char gender='M';
    void print(){
        System.out.println("Parent Class");
    }
}
class Son extends Father{
    
}

public class SingleInheritance {
    public static void main(String[] args) {
        Son obj=new Son();
        System.out.println(obj.gender);
        obj.print();
    }
}
