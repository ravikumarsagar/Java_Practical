package Practice;

public class ConstructorInheritance extends Child {

    public ConstructorInheritance(){
        System.out.println("Kills");
    }

    public static void main(String[] args) {

        ConstructorInheritance i=new ConstructorInheritance();
    }

}

class Child{

    public Child(){
        System.out.println("Chills");
   }
}

