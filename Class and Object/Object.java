// Object

public class Object{
    String name;
    int rollno;

    public void display(){
        System.out.println(name);
        System.out.println(rollno);
    }

    public static void main(String[] args) {
        Object obj=new Object();
        obj.name="Rolex";
        obj.rollno=57;
        obj.display();
    }
}
