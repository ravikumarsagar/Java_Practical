package collection_examples;
import java.util.*;
class Priority
{
    public static void main(String[]args)
 {
        PriorityQueue pq=new PriorityQueue();
        pq.add("A");
        pq.offer("B");
        pq.offer("C");
        pq.offer("D");
        //pq.hashCode();
     System.out.println(pq.getClass());
        //System.out.println(pq.removeAll(pq));
        //System.out.println(pq.retainAll(pq));
        //System.out.println(pq.size());
        System.out.println(pq);
 }
}
