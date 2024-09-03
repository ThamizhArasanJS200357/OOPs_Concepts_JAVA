        // Recursion


public class Recursion {
    public static void main(String[]args){
         naturalprint(10);
    }
    public static void naturalprint(int s){
        if(s==1){
            System.out.println(1);
        }
        else{
            System.out.println(s);
            naturalprint(s-1);
        }
    }
}
