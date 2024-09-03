// This Keyword


class Father{
    char gender;
    int age;
    void print(char gender,int age){
        this.gender=gender;
        this.age=age;
    }
}
class Son extends Father{
    char gender;
}

public class Thiskeyword {
    public static void main(String[] args) {
        Father obj=new Father();
        obj.print('M',50);
        System.out.println(obj.gender);
        System.out.println(obj.age);
    }
}

