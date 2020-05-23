package collection_examples;
import java.util.*;
public class LinkedHashMapExample {
    public static void main(String[] args)
    {
        LinkedHashMap l=new LinkedHashMap();
        l.put(null,null);
        l.put(null,null);//it takes only one null key
        l.put(1,"ravi");
        l.put(2,"kumar");
        l.put(3,"sagar");
        l.put(4,"Om");
        l.remove(4);
        System.out.print(l);
        System.out.println(l.get(2));
        l.clear();
        System.out.println(l.values());
        System.out.println(l.keySet());
        Map map =new LinkedHashMap();
        Home home=new Home("Ravi",23,25000,"Delhi");
        Home home1=new Home("Ritu",24,21000,"Goa");
        Home home2=new Home("Om",28,22000,"Mumbai");
        Home home3=new Home("Sweta",28,24000,"Chennai");
        map.put(1,home);
        map.put(2,home1);
        map.put(3,home2);
        map.put(4,home3);
        System.out.println(map.get(4));
    }
}
class Home{
    public String name;
    int age;
    public String address;
    int income;
    public Home(String name, int age,int income,String address){
        this.name=name;
        this.age=age;
        this.income=income;
        this.address=address;
    }
}
