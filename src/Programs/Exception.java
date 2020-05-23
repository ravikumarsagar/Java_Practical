package Programs;

public class Exception {
    public static void main(String[] args) {

        try{
            int a=5;
            int b=55;
            int c=a+b;
            System.out.println(c);
        }
        catch (ArithmeticException a){
            System.out.println("Zero");
        }
        finally {
            System.out.println("one");
        }
    }
    
}
