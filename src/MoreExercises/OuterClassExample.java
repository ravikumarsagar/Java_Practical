package MoreExercises;
public class OuterClassExample {
     private  int a=10;
     protected String name="Ravi";

  private class InnerClass
    {
    int no=110;
    private String s="Kumar";
    void  printData(){
        System.out.println(no+" "+s);
    }
    }
    public static void main(String[] args) {
     OuterClassExample o=new OuterClassExample(); //if inner class is non static
     OuterClassExample.InnerClass o1=o.new InnerClass();

    // OuterClassExample.InnerClass o=new OuterClassExample.InnerClass();//if inner class is static
        o1.printData();


    }
}
