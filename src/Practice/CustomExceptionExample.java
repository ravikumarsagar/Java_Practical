package Practice;
import java.util.Scanner;
public class CustomExceptionExample
{
    public static void check () throws MyException{
        int number;
        System.out.println("Enter the number to enter play zone");
        Scanner scanner=new Scanner(System.in);
        number=scanner.nextInt();
        if (number!=10)
            throw new MyException("try again with different number");
        else {
            System.out.print("Welcome to play zone");
        }
    }
    public static void main(String[] args) {
        try {
            check();
        }
        catch (MyException e){
            System.out.println(" Exception "+e);
        }
    }
}
class MyException extends Exception{
    MyException(String s){
        super(s);
    }
}
