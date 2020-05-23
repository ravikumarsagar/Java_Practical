package Programs;
public class OddEven1
{
    public static void main(String[] args) {

        OddEven1 oddEven=new OddEven1();
        System.out.println(oddEven.check(5));
    }

    public int check(int x){
        if(x%2==0){
            System.out.println("Even number");
        }
        else
        {
            System.out.println("odd");
        }
       return 0;
    }
}
