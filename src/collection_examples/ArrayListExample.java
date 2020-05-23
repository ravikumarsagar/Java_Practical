package collection_examples;
import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {

    ArrayList array1=new ArrayList();
    array1.add("Apple");
    array1.add("Ball");
    array1.add("Cat");
    ArrayList array=new ArrayList();
    array.add("Ravi");
    array.add("Kumar");
    array.add("Sagar");
    //array.remove("Ravi");
    array.add(2,"ravi");
    //array.removeAll(array);
    array.addAll(array1);
        //System.out.print(array);
        Iterator it=array.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
