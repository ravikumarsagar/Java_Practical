package file_handling;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException
    {
        FileWriter f=new FileWriter("C:\\Users\\Ravi Kumar\\Documents\\web.html",true);
        f.write("and this is web page");
        f.close();
    }

}
