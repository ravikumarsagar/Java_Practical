package collection_examples;
import  java.util.*;
public class CollectionsExample {
    public static void main(String[] args) {
        Vector v=new Vector();
        v.add(10);
        v.add(50);
        v.add(70);
        v.add(90);
        v.add(20);
        System.out.println(v);
        Collections.sort(v);
        int x= Collections.binarySearch(v,20);
        System.out.println(x);

    }

}
