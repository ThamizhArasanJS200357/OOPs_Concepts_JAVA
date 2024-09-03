import java.io.File;
import java.util.Scanner;

class ReadingFile{
    public static void main(String[] args) {
        try {
            File f=new File("Example.txt");
            Scanner js=new Scanner(f);
            while(js.hasNextLine()){
                System.out.println(js.nextLine());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        

    }
}