package Programs;
import java.util.Scanner;
public class FactorialNumber {
    public static void main(String[] args) {
        int number;
        int fact=1;
        System.out.println("enter the number");
        Scanner scanner=new Scanner(System.in);
        number=scanner.nextInt();
        for (int i=1;i<=number;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of Number "+fact);
    }
}
