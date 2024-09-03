// Hierarchical Inheritances


class GrandFather{
    char gender='M';
    void print(){
        System.out.println("Parent Class");
    }
}
class Mother extends GrandFather{
    char gender='F';
    void print(){
        System.out.println("Child Class 1");
    }
}
class Uncle extends GrandFather{
    char gender='M';
    void print(){
        System.out.println("Child Class 2");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Mother obj=new Mother();
        System.out.println(obj.gender);
        obj.print();
        Uncle obj1=new Uncle();
        System.out.println(obj1.gender);
        obj1.print();
    }
}
