// Hybrid Inheritances


class Father{
    char gender='M';
    void print(){
        System.out.println("Parent Class");
    }
}
class Daughter extends Father{
    char gender='F';
    void print(){
        System.out.println("Child Class 1");
    }
}
class Son extends Father{
    char gender='M';
    void print(){
        System.out.println("Child Class 2");
    }
}
class GrandDaughter extends Daughter{
    void print(){
        System.out.println("Grand Daugther");
    }

}

public class HybridInheritance {
    public static void main(String[] args) {
        Daughter obj=new Daughter();
        System.out.println(obj.gender);
        obj.print();
        GrandDaughter obj1=new GrandDaughter();
        System.out.println(obj1.gender);
        obj1.print();
    }
}
