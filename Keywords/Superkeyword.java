// Super Keyword


class Father{
    char gender='M';
    void print(){
        System.out.println("Parent Class");
    }
}
class Son extends Father{
    char gender='c';
    void print(){
        super.print();
        System.out.println(super.gender);
    }
}

public class Superkeyword {
    public static void main(String[] args) {
        Son obj=new Son();
        obj.print();
        Father obj1=new Father();
        System.out.println(obj1.gender);
    }
}

