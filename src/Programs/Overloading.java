package Programs;
public class Overloading {
    public static void main(String[] args) {
        Add add=new Add();
        System.out.println(add.sum(5,8));
        System.out.println(add.multiply(5,5,6));
    }
}
class Add{
    public int sum(int a, int b){
        return a+b;
    }
    public int multiply(int a,int b,int c){
        return a*b*c;
    }
}
