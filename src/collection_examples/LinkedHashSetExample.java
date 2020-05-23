package collection_examples;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {

        LinkedHashSet l=new LinkedHashSet();
        l.add("Ravi");
        l.add("Kumar");
        l.add("Sagar");
        //System.out.println(l);
        //l.remove("Sagar");
        //System.out.println(l.size());
        //System.out.println(l.removeAll(l));

        Iterator it=l.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
