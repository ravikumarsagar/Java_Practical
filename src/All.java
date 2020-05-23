import java.util.*;
public class All {
    public static void main(String[] args)
    {
        LinkedHashSet s=new LinkedHashSet();
        s.add(null);
        s.add("kmar");
        s.add("sagar");

        Iterator itr=s.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
