package Programs;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        int principal_amount;
        int rate_of_interest;
        int time;
        float simpleInterest;
        System.out.println("Enter total amount");
        Scanner scanner=new Scanner(System.in);
        principal_amount=scanner.nextInt();
        System.out.println("Enter Rate of Interest");
        Scanner sc=new Scanner(System.in);
        rate_of_interest=sc.nextInt();
        System.out.println("Enter time");
        Scanner scanner1=new Scanner(System.in);
        time=scanner1.nextInt();
        simpleInterest=principal_amount*rate_of_interest*time/100;
        System.out.println("Simple Interest is "+simpleInterest);
    }

}

//p*r*t/100;
