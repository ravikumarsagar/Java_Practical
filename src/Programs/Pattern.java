package Programs;

import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {
        System.out.println("Enter the number to print pattern");
        int pattern;
        Scanner scanner =new Scanner(System.in);
        pattern=scanner.nextInt();
        for (int i=1;i<=pattern;i++)
        {
            for (int j=1;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
