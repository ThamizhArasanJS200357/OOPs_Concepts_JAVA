interface Father{
    abstract void call();
    abstract void talk();
}
class Inter implements Father{
    public void call(){
        System.out.println("calling");
    }
    public void talk(){
        System.out.println("talking");
    }
}

public class Interface {
    public static void main(String[] args) {
        Inter obj=new Inter();
        obj.call();
        obj.talk();
    }
}
