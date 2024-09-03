// Abstract Method

abstract class Computer{    //Abstract class cannot create the object
    abstract void turnOff();  //Abstract method can't be defined only declare
    abstract void turnOn();
}
class Hp extends Computer{
    void turnOn(){
        System.out.println("Turn On -Hp");    
    }
    void turnOff(){
        System.out.println("Turning Off-Hp");
    }
}
class Dell extends Computer{
    void turnOn(){
        System.out.println("Turn On -Dell");    
    }
    void turnOff(){
        System.out.println("Turning Off-Dell");
    }

}

public class AbstractMethod {
    public static void main(String[] args) {
        Hp obj=new Hp();
        obj.turnOn();
        obj.turnOff();
        Dell obj1=new Dell();
        obj1.turnOn();
        obj1.turnOff();
        
    }
}
