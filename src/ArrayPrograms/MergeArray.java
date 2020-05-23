package ArrayPrograms;
public class MergeArray {
    public static void main(String[] args) {

        int array1[]={5,6,7};
        int array2[]={8,9,10,11};

        int array1_length=array1.length;
        int array2_length=array2.length;
        int add=array1_length+array2_length;

        int sum[]=new int[add];

        for (int i=0;i<array1_length;i++)
        {
            sum[i]=array1[i];
        }
        for (int i=0;i<array2_length;i++)
        {
            sum[array1.length+i]=array2[i];
        }
        for (int i=0;i<sum.length;i++){
            System.out.print(sum[i]+" ");
        }
    }
}

