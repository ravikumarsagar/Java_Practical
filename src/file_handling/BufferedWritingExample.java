package file_handling;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWritingExample {
    public static void main(String[] args) {
        try {
            FileWriter f1=new FileWriter("C:\\Users\\Ravi Kumar\\Desktop\\Exa.text",true);
            BufferedWriter b=new BufferedWriter(f1);
            b.write("Hi i am coder");

            b.close();
        }
        catch (IOException e){

            //System.out.println(e.getClass());
        }

    }
}
