
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
}
public class Inheritance {
    public static void main(String[] args) {
        Dog obj=new Dog();
        System.out.println(obj.bark);
        obj.eat();
        obj.walk();
        System.out.println(obj.nolegs);
    }
}
