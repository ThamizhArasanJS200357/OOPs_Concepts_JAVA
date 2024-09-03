// Abstract Class

abstract class Computer{    //Abstract class cannot create the object
    void turnOn(){
        System.out.println("Turning On");
    }
}
class Hp extends Computer{
    void turnOn(){
        System.out.println("Turn On 1");    }
}
class Dell extends Computer{

}

public class AbstractClass {
    public static void main(String[] args) {
        Hp obj=new Hp();
        obj.turnOn();
        Dell obj1=new Dell();
        obj1.turnOn();
    }
}
