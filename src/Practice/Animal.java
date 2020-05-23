package Practice;
public class Animal //Constructor Practices
{
    String name;
    int leg;
    int eye;
    public Animal(String name,int leg,int eye){
        this.name=name;
        this.leg=leg;
        this.eye=eye;
    }
    public void printDetail()
    {
        System.out.println(this.name + this.eye + this.leg);
    }
}
class Execute{
    public static void main(String[] args) {
        Animal animal=new Animal("hen",2,2);
        animal.printDetail();
    }
}