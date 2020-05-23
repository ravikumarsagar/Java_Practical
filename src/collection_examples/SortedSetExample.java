package collection_examples;
import java.util.Iterator;
import java.util.TreeSet;
public class SortedSetExample  {
    public static void main(String[] args) {
        TreeSet treeSet=new TreeSet();
        //treeSet.add(null);
        treeSet.add("D");
        treeSet.add("C");
        treeSet.add("B");
        treeSet.add("A");
        treeSet.add("E");
        treeSet.add("F");
        treeSet.add("G");
        System.out.print(treeSet);
        //System.out.println(treeSet.first());
        //System.out.println(treeSet.last());
        //System.out.println(treeSet.ceiling("D"));
        //System.out.println(treeSet.floor("B"));
        //System.out.println(treeSet.comparator());
        //System.out.println(treeSet.lower("C"));
       // System.out.println(treeSet.higher("B"));
        System.out.println(treeSet.pollFirst());
        System.out.println(treeSet.pollLast());
        System.out.println(treeSet.headSet("D"));
        Iterator it=treeSet.descendingIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
