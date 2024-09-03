import java.io.File;
import java.io.FileWriter;

class WritingFile{
    public static void main(String[] args) {
        try {
            File f=new File("Example.txt");
            FileWriter js=new FileWriter(f);
            js.write("Hello this is JS");
            js.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        

    }
}