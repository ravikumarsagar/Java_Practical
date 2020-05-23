package Practice;
public class InterfaceExamples {
    public static void main(String[] args) {
        I3 a1=new A1();
        a1.run();
        //a1.eat();
    }
}
class A1 implements I3
{
    public void eat()
    {
        System.out.println("Eating");
    }
    public void run(){
        System.out.println("running");
    }
}

interface I3{
    void run();
}
