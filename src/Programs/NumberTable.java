package Programs;

import java.util.Scanner;

public class NumberTable {

    public static void main(String[] args) {

        int x;
        System.out.println("enter the number");
        Scanner scanner=new Scanner(System.in);
        x=scanner.nextInt();
        System.out.println("Table of :" +x);
        for (int i=1;i<=10;i++)
        {
            System.out.println(i*x);
        }

    }
}
