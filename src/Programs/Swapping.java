package Programs;
public class Swapping {
    public static void main(String[] args) {
        /*int x=5;
        int y=8;
        int temp;
        System.out.print("Before Swapping \n"+x+"\n"+y);
        System.out.println("\n"+"After Swapping");
        temp=x;
        x=y;
        y=temp;
        System.out.print(x+"\n"+y);*/
        int x=5;
        int y=6;
        System.out.print("Before Swapping \n"+x+"\n"+y);
        System.out.println("\n"+"After Swapping");
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.print(x+"\n"+y);


    }
}
