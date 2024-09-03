                          // Method OverLoading
// MethodOverLoading : Same Class name , Same Method name and Different Parameter

class Overloading{
    void min(int a,int b){
        if(a<b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
    }
    void min(int a){
        System.out.println(a);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Overloading obj =new Overloading();
        obj.min(6,5);
        obj.min(57);
    }
}
