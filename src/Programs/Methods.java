package Programs;
public class Methods {
    public static void main(String[] args) {
        Calculate methods=new Calculate(5,5);
        methods.add(5,8,6);
        methods.add();
    }
}
class Calculate{
  public void add(){
      //int c=x+y;
      System.out.println("Add");
  }
    public void add(int x,int y,int z){
        int c=x+y+z;
        System.out.println(c);
    }
    public void add(String a,String b){
      String c=a+b;
        System.out.println(c);
    }
   public Calculate(int a,int b){
      int c=a+b;
   }
}
