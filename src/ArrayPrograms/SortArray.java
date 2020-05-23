package ArrayPrograms;
public class SortArray {
    public static void main(String[] args) {
        int array[]={5,7,6,3,8,1,9};
        int temp=0;
        for (int i=array.length;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){

                if (array[i]<array[j])
                {
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
            System.out.println(array[i]+" ");
        }
    }
}
//check again
