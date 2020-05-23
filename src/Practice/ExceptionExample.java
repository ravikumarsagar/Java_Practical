package Practice;
import java.util.Scanner;
public class ExceptionExample extends Throwable {

    public static void main(String[] args)
    {
        int x;
        System.out.println("enter the value of x");
        Scanner scanner=new Scanner(System.in);
        x=scanner.nextInt();
        int y=10;
        try{
            System.out.println(y/x);
        }
        catch (ArithmeticException e){
           System.out.println("Exception"+e.getMessage());
        }
          // catch (NullPointerException e){
         //   System.out.println("Exception"+e.getMessage());
        //}
        finally {
            System.out.println("Finally Run");
        }
    }
}
