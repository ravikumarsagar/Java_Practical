package Programs;
import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        int x;
        int y;
        int z;
        System.out.println("enter the three number");
        Scanner scanner=new Scanner(System.in);

        x=scanner.nextInt();
        y=scanner.nextInt();
        z=scanner.nextInt();

        if (x>y &&x>z){
            System.out.println("first number is large");
        }
        else if (y>x && y>z){
            System.out.println("second number is large");
        }
        else if (z>x && z>y){
            System.out.println("third number is large");
        }
    }
}
