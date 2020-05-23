package file_handling;
import java.io.*;
//import java.io.IOException;

public class FileExample {

    public static void main(String[] args) throws IOException
    {
        File f=new File("C:\\Users\\Ravi Kumar\\Documents\\web.html");
        //f.createNewFile();
        System.out.println(f.canWrite());
        System.out.println(f.canRead());
        //System.out.println(f.delete());
        System.out.println(f.length());
    }
}
