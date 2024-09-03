// MethodOverriding : Different Class name , Same Method name and Same Parameter

class Animal{
    int nolegs=4;
    public static void eat(){
        System.out.println("I am eating");
    }
    public static void walk(){
        System.out.println("I am walking");
    }
}
class Dog extends Animal{
    Boolean bark=true;
    int nolegs=5;
    public static void eat(){
        System.out.println("Dog is eating");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Dog obj=new Dog();
        System.out.println(obj.bark);
        obj.eat();
        obj.walk();
        System.out.println(obj.nolegs);
    }
}