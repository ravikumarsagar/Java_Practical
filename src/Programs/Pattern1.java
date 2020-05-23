package Programs;

import java.util.Scanner;//check again

public class Pattern1 {
    public static void main(String[] args) {

        int pattern;
        System.out.println("enter the number");
        Scanner scanner=new Scanner(System.in);
        pattern=scanner.nextInt();

        for (int i=5;i<pattern;i--){
            for (int j=1;j<i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
