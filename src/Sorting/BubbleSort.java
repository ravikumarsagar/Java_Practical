package Sorting;
public class BubbleSort {
    public static void main(String[] args) {
        int array[]={5,8,7,3,2,9};
        int temp;
        for (int i=0;i<array.length;i++)
        {
            for(int j=0;j<array.length-1;j++){

                if(array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}
