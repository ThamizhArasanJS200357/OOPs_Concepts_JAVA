
class Sample{
    int rollno;
    int marks;
    Sample(int num,int mark){   //Class name as a same name as a Constructor name
        System.out.println("This is a Parameterized Constructor");
        rollno=num;
        marks=mark;
    }
}
public class ParameterizedConstructor {
    public static void main(String[] args) {
        Sample obj=new Sample(44,99);
        System.out.println(obj.rollno);
        System.out.println(obj.marks);

    }
}
