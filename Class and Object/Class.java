// Class


class Class1{
    String name;
    int rollno;

    public void display(){
        System.out.println(name);
        System.out.println(rollno);
    }
    public void setvalue(String s,int t){
        name=s;
        rollno=t;
    }
}

public class Class{
    public static void main(String[] args) {
        Class1 obj=new Class1();
        obj.name="Rolex";
        obj.rollno=57;
        obj.display();

        Class1 js=new Class1();
        js.name="thamizh";
        js.rollno=44;
        js.display();

        obj.setvalue("JS", 12);
        obj.display();
    }
}
