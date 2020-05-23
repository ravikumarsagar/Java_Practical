package file_handling;
import java.io.*;

 public class SequenceInputStreamExample {
    public static void main(String[] args) throws IOException
    {
        FileInputStream f=new FileInputStream("C:\\Users\\Ravi Kumar\\Desktop\\exa.text");
        FileInputStream f1=new FileInputStream("C:\\Users\\Ravi Kumar\\Desktop\\exa.text");
        //FileInputStream f2=new FileInputStream("C:\\Users\\Ravi Kumar\\Desktop\\exa.text");
        SequenceInputStream s=new SequenceInputStream(f,f1);
        int i;
        while ((i=s.read())!=-1){
            System.out.print((char)i);
        }
        f.close();
        f1.close();
        s.close();

    }
}

class SequenceInputStreamExample1{
    public static void main(String[] args) throws IOException {
        FileInputStream f=new FileInputStream("C:\\Users\\Ravi Kumar\\Desktop\\exa.text");
        FileInputStream f1=new FileInputStream("C:\\Users\\Ravi Kumar\\Desktop\\exa1.text");
        FileOutputStream f2=new FileOutputStream("C:\\Users\\Ravi Kumar\\Desktop\\exa2.text");
        SequenceInputStream s=new SequenceInputStream(f,f1);
        int i;
        while ((i=s.read())!=-1){
            f2.write(i);
        }
        f.close();
        f1.close();
        f2.close();
        s.close();
    }
}