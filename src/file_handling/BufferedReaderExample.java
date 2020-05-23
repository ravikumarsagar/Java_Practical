package file_handling;
import java.io.*;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException
    {

        FileReader f=new FileReader("D:\\code.txt");
        BufferedReader b=new BufferedReader(f,10);
        int a;
        while ((a=b.read())!=-1){
            System.out.print((char) a);
        }
        b.close();
        f.close();

        //String a1=b.readLine();
    }

}
