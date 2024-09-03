
class Poly{
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

public class Polymorphism {
    public static void main(String[] args) {
        Poly obj =new Poly();
        obj.min(6,5);
        obj.min(57);
    }
}
