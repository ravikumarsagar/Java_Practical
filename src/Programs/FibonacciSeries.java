package Programs;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        System.out.print(a);
        for (int i=1;i<=10;i++)
        {
            System.out.print(" "+b);
            int sum=a+b;
            a=b;
            b=sum;

        }
    }
}
