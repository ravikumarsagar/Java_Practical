package Practice;
public class StaticMember {
    public static void member(){
        System.out.println("member");
    }
}

class M1 extends StaticMember
{
    public static void member(){
        System.out.println("member1");
    }
    public static void main(String[] args) {
        StaticMember m1=new M1();
        m1.member();

    }
}
