// Methods

public class Methods{
    public static void main(String[]args){
        add(10,15);
        add();
        int res=add(10,20,30);
        System.out.println(res);
        System.out.println("a is printed");
    }//not parameterized
    public static void add(){
        int a=10;
        int b=30;
        int c=a+b;
        System.out.println(c);
    }//parameterized
    public static void add(int a,int b){
        int c=a+b;
        System.out.println(c);
    }//Without using the void method
    public static int add(int a,int b,int c){
        int d=a+b+c;
        return d;

    }
}
