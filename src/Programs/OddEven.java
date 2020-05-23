package Programs;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        int x;
        System.out.println("enter the number");
        Scanner scanner=new Scanner(System.in);
        x=scanner.nextInt();
        //int x=10;
        if(x%2==0){

            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
    }


}
