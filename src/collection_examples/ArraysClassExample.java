package collection_examples;
import java.util.Arrays;

public class ArraysClassExample {
    public static void main(String[] args) {

        //int a[]={5,8,6,4,1,9,10};
        int a[]=new int[10];
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        Arrays.sort(a,2,5);
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        Arrays.fill(a,2,6,9);
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}
