// Default Constructor


class Sample{
    int rollno;
    int marks;
    Sample(){   //Class name as a same name as a Constructor name
        System.out.println("This is a Default Constructor");
        rollno=57;
        marks=95;
    }
}
public class DefaultConstructor {
    public static void main(String[] args) {
        Sample obj=new Sample();
        System.out.println(obj.rollno);
        System.out.println(obj.marks);

    }
}
