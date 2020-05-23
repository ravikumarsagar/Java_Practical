package Programs;
public class MethodsPractices {
    public static void main(String[] args) {
        M1 m1=new M1();
        m1.info();
        M2 m2=new M2();
    }
}
class M1{
       void info(){
        System.out.println("All is Good");
        list();
        data();
    }
    private  void list(){
        System.out.println("Private Data");
    }
    protected void data(){
        System.out.println("Important Data");
    }
}
class M2{
    public M2()
    {
        //System.out.println("Constructor is called");
    }
}
