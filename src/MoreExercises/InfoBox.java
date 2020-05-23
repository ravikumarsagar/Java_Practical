package MoreExercises;
public class InfoBox {
    private int length,height,breath;  //properties

    public void setDimension(int l,int b,int h)  //behavior
    {
        length=l;
        height=h;
        breath=b;
    }
    public void showDimension()
    {
        System.out.println(length+" "+breath+" "+height);
    }
    public static void main(String[] args) {
        InfoBox infoBox=new InfoBox();
        infoBox.setDimension(10,12,5);
        infoBox.showDimension();
    }
}
