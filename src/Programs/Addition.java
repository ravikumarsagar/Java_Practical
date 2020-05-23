package Programs;
import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {
        /*int x;
        int y;
        int add;
        System.out.println("Enter two number");
        //System.out.println("enter the second number");
        Scanner scanner=new Scanner(System.in);
        x=scanner.nextInt();
        Scanner scanner1=new Scanner(System.in);
        y=scanner1.nextInt();
        add=x+y;
        System.out.println(add);*/
        Addition1 addition1=new Addition1();
        System.out.println(addition1.addition(6,7));
    }
    }
class Addition1{

    public int addition(int x,int y){
      return x+y;
    }
}
