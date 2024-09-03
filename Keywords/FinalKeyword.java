
class Father{
    final char gender='M';
    final void print(){
        System.out.println("Parent Class");
    }
}
class Son extends Father{
    char gender='c';
}

public class FinalKeyword {
    public static void main(String[] args) {
        Son obj=new Son();
        System.out.println(obj.gender);
        obj.print();
    }
}

