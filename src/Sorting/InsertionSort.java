package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int array[]={5,3,8,6,1,4};
        int temp,j;
        for (int i=1;i<array.length;i++){
            temp=array[i];
            j=i;
            while (j>0&&array[j-1]>temp){
                array[j]=array[j-1];
                j=j-1;
            }
            array[j]=temp;
        }
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
