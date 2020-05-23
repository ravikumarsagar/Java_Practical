package file_handling;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) {

        try {
            FileOutputStream f=new FileOutputStream("C:\\Users\\Ravi Kumar\\Desktop\\exa.text",true);
            String s="Hi this is my number";
            byte []b=s.getBytes();
            f.write(b);
            f.close();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
