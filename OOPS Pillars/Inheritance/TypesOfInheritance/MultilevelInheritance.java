

class GrandFather{
    char gender='M';
    void print(){
        System.out.println("Parent Class");
    }
}
class Mother extends GrandFather{
    char gender='F';
    void print(){
        System.out.println("Child Class");
    }
}
class Son extends Mother{
    
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Son obj=new Son();
        System.out.println(obj.gender);
        obj.print();
    }
}
