package Programs;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args)
    {
        //int a[]={5,8,6,3,8};
        int num;
        int reverse=0;
        int rem;
        System.out.println("Enter the number");
        Scanner scanner=new Scanner(System.in);
        //int a=7818946;
        num=scanner.nextInt();
        while (num!=0)
        {
            rem =num%10;
            reverse=reverse*10+rem;
            num=num/10;
        }
        System.out.println(reverse);

    }
}
