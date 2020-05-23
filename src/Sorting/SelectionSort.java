package Sorting;
public class SelectionSort {
    public static void main(String[] args) {
        int array[]={5,6,7,1,9,3,4};
        int minimum,temp=0;
        for(int i=0;i<array.length;i++){
            minimum=i;
            for (int j=i+1;j<array.length;j++){
                if(array[j]<array[minimum]){
                    minimum=j;
                }
            }
            temp=array[i];
            array[i]=array[minimum];
            array[minimum]=temp;
        }
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]+" ");
        }
    }
}
