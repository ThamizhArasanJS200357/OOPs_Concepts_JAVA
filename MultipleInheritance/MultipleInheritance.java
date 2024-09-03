interface Father{
    abstract void call();
    abstract void talk();
}
interface Mother{
    abstract void call();
    abstract void talk();
}
class Son implements Father,Mother{
    public void call(){
        System.out.println("calling");
    }
    public void talk(){
        System.out.println("talking");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Son obj=new Son();
        obj.call();
        obj.talk();
    }
}
