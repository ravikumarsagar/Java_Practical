package Programs;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        int x;
        System.out.println("enter the year");
        Scanner scanner=new Scanner(System.in);
        x=scanner.nextInt();
        if ((x%4==0&&(x%100!=0)||(x%400==0)))
        {
            System.out.println("leap year");
        }
        else {
            System.out.println("not a leap year");
        }

    }
}
