package geometry.runners;
import geometry.models.Point;

public class MainClass {
    public static void main(String[]args)
    {
        Point point=new Point();
        point.setDetail(20,5);
        point.showDetail();
        System.out.println(point.xReturn());
    }
}
