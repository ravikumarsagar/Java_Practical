package Programs;
import java.util.Scanner;
public class Table {
    public static void main(String[] args) {

        System.out.println("Enter the number");
        int a;
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        System.out.println("Table of "+a+" is given below "  );
        //int a=2;
        for (int i=1;i<=10;i++){
            System.out.println(a*i);
        }

    }
}
