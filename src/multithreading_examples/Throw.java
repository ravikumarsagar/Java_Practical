package multithreading_examples;
import java.io.IOException;

public class Throw {
    public static void main(String[] args)
    {
        try {
            //System.out.println("Exceptions");
            throw new IOException();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
             //Run time exceptions
          // System.out.println("Hello");
    }
}
