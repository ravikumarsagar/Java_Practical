package MoreExercises;

class GenericClass <T> {
    T s;
    public void setName(T name){
        s=name;
    }
    public T getName(){
        return this.s;
    }

}
public class GenericClassExample{
    public static void main(String[] args) {
        GenericClass<Integer> g=new GenericClass<Integer>();
        GenericClass<String>g1=new GenericClass<String>();
        g1.setName("Ravi");
        System.out.println(g1.getName());
        g.setName(56);
        g.getName();
        System.out.println(g.getName());

    }

}
