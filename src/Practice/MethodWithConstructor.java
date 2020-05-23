package Practice;

public class MethodWithConstructor {
    public static void main(String[] args) {
     //private method never called in other class
        Ask as=new Ask();

    }
}
class Ask {
    public Ask(){
        System.out.println("Constructor called");
        int x=0;
        int y=5;
        int z=x+y;
        System.out.println(z);
    }
    protected Ask(int a,int b){
        return;

    }
    private Ask(int a ,int b,int c){
        int sum=a+b+c;
    }

    public void Ask(){
        System.out.println("Asking");
    }

    protected int Ask(int a,int b,int c){
        return a+b+c;

    }
}
