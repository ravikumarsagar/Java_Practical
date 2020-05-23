package MoreExercises;

public abstract  class Methods {
    abstract void name();
}
class M1 extends Methods{

    String s="Ravi";
    int a=s.length();

    public void name(){
        System.out.println("hello");
    }
    void info(){
        System.out.println("info");
    }

    public static void main(String[] args) {

        Methods methods=new M1();
        methods.name();

        ((M1) methods).info();
    }

}