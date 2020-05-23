package geometry.models;
public class Point {
    private int x;
    private int y;

    public void setDetail(int a,int b){
        this.x=a;
        this.y=b;
    }
    public void xSet(int set){
        this.x=set;
    }
    public int xReturn(){
        return this.x;
    }

    public void showDetail()
    {
        System.out.println(x+" "+y);
    }
}
