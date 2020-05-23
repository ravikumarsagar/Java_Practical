package multithreading_examples;
import java.util.Scanner;
public class ThrowableExample {
    public static void main(String[] args) {
        int amount=5000;
        int withdrawn;
        System.out.println("Enter the amount");
        Scanner scanner=new Scanner(System.in);
        withdrawn=scanner.nextInt();
        try{
            if (amount<withdrawn) //(500<600)
              throw new ArithmeticException("withdraw amount is more");
               amount=amount-withdrawn;
            System.out.println("Transaction Successfully");
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Enter amount less then "+amount);
    }
}
