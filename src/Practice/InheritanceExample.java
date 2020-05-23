package Practice;

class Vehicle{
    String name;
    int model;
    String address;
}
class Car extends Vehicle{
}
class Bike extends Vehicle
{
    public Bike(String s,int i,String a){
        this.name=s;
        this.model=i;
        this.address=a;
        System.out.println(name+" "+model+" "+address);
    }
}
public class InheritanceExample{
    public static void main(String[]args){
        Bike b=new Bike("BMW",2017,"Delhi");

        //System.out.println(b.hashCode());
    }
}
