package file_handling;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) throws IOException
    {

        FileInputStream f=new FileInputStream("C:\\Users\\Ravi Kumar\\Desktop\\exa.text");
        int i=0;
        while ((i=f.read())!=-1){
            System.out.print((char)i);
        }
        f.close();
    }
}
